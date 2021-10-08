#!/usr/bin/env python
#  Copyright (c) 2021. NavInfo EU
#  All rights reserved.
#
#  You may only use this code under the terms of the NavInfo license.
#
# -*- coding: utf-8 -*-
__author__ = "Kobus Grobler"

import sys
import argparse
import time

sys.path.append('.')
sys.path.append('./asap_api')

from asap_client.exceptions import ApiException, NotFoundException
from asap_client.asap_api.test_api import TestApi
from api_util.util import load_sdk_config, get_auth_token, get_api_client

if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='ASA Start Test Example')
    parser.add_argument('--test-id', type=int, required=True,
                        help='The ASA Platform test ID to start.')
    args = parser.parse_args()

    config = load_sdk_config()
    if config is None:
        print("A configuration file with valid connection information is required.")
        exit(1)

    print('Retrieving authentication token...')
    auth_token = get_auth_token(config['connection']['host'],
                                config['connection']['api-key'], config['connection']['api-key-id'])
    api_client = get_api_client(config['connection']['host'], auth_token)
    test_api = TestApi(api_client)

    print(f'Starting test #{args.test_id}')
    try:
        test = test_api.get_status(args.test_id)
        if test.status == 'INITIALIZING' or test.status == 'RUNNING':
            print('Test already started.')
        else:
            test_api.start_test(args.test_id)
    except NotFoundException as nf:
        print(f'Failed to start test - test with ID #{args.test_id} was not found.')
        exit(2)
    except ApiException as ae:
        print(f'Failed to start test: {ae.body}')
        exit(3)

    print('Displaying test status press Control-C to exit.')

    try:
        while True:
            test = test_api.get_status(args.test_id)
            print(f'\rTest status: {test.status} message: {test.message}', end='')
            time.sleep(1)
    except ApiException as ae:
        print(f'Failed to get test status: {ae.body}')
        exit(3)
