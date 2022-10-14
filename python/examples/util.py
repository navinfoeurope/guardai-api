#  Copyright (C) 2022 by NavInfo Europe B.V. The Netherlands - All rights reserved
#  Information classification: Confidential
#  This content is protected by international copyright laws.
#  Reproduction and distribution is prohibited without written permission.
#  -*- coding: utf-8 -*-
__author__ = "Kobus Grobler"

import os
import yaml
import logging.config

from typing import Union
from guardai_api import Configuration
from guardai_api import ApiClient
from guardai_api.api.login_api import LoginApi
from guardai_api.model.login_request import LoginRequest


def get_auth_token(host: str, api_key: str, api_key_id: str = None) -> str:
    """
    Return a auth token from the specified host name and API key.
    :param host: the GuardAI host name
    :param api_key: the API key for an account
    :param api_key_id: the API key id to use
    :return: a auth token
    """
    conf = Configuration(host=host, discard_unknown_keys=True)
    api_client = ApiClient(conf)
    api = LoginApi(api_client)
    return api.login(LoginRequest(api_key_id=api_key_id, api_key=api_key)).jwt


def get_api_client(host: str, api_token: str) -> ApiClient:
    """
    Return a configured API client from the specified host name and API token.
    :param host: the GuardAI host name
    :param api_token: the API token (from get_auth_token)
    :return: a configured ApiClient instance
    """
    _conf = Configuration(host=host, discard_unknown_keys=True)
    _conf.api_key['JWT'] = api_token
    _conf.api_key_prefix['JWT'] = 'Bearer'
    return ApiClient(_conf)


def load_sdk_config(config_file: str = 'guardai-sdk-config.yml') -> Union[dict, None]:
    """
    Load the sdk config from the provided yml config file.

    :param config_file: a yaml config file
    :return: the config dict or None if config could not be loaded
    """
    config_file = config_file if os.environ.get('GUARDAI_CONFIG_FILE') is None\
        else os.environ.get('GUARDAI_CONFIG_FILE')

    try:
        with open(config_file, 'rt') as f:
            return yaml.safe_load(f.read())

    except Exception as e:
        print(e)
        print(f'Error loading sdk configuration from {config_file}.')
        return None


def configure_logging(config_file: str) -> None:
    """
    Configure Python logging from the provided yml config file.

    :param config_file: a yaml config file
    """
    try:
        with open(config_file, 'rt') as f:
            logging.config.dictConfig(yaml.safe_load(f.read()))
    except Exception as e:
        print(e)
        print('Error configuring logging. Using defaults')
        logging.basicConfig(level=logging.INFO)


def get_client():
    config = load_sdk_config()
    if config is None:
        print("A configuration file with valid connection information is required.")
        exit(1)

    print('Retrieving authentication token...')
    auth_token = get_auth_token(config['connection']['host'],
                                config['connection']['api-key'], config['connection']['api-key-id'])
    return get_api_client(config['connection']['host'], auth_token)
