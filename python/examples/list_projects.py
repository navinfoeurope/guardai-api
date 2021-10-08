#!/usr/bin/env python
#  Copyright (c) 2021. NavInfo EU
#  All rights reserved.
#
#  You may only use this code under the terms of the NavInfo license.
#
# -*- coding: utf-8 -*-
__author__ = "Kobus Grobler"

import sys

sys.path.append('.')
sys.path.append('./asap_api')

from asap_client.asap_api.project_api import ProjectApi
from asap_client.asap_api.test_api import TestApi
from api_util.util import load_sdk_config, get_auth_token, get_api_client

if __name__ == '__main__':

    config = load_sdk_config()
    if config is None:
        print("A configuration file with valid connection information is required.")
        exit(1)

    print('Retrieving authentication token...')
    auth_token = get_auth_token(config['connection']['host'],
                                config['connection']['api-key'], config['connection']['api-key-id'])
    api_client = get_api_client(config['connection']['host'], auth_token)
    project_api = ProjectApi(api_client)
    test_api = TestApi(api_client)

    print('Listing projects...')
    projects = project_api.get_projects()

    for project in projects:
        tests = test_api.get_tests(project.id)
        print(f'Project Name: {project.name} ID: {project.id} number of tests: {len(tests)}'
              f' Verified: {project.verified}')
        if project.verified:
            if project.settings and project.settings.head_settings:
                print(f'\tHead settings: {project.settings.head_settings}')
            print('Tests:\t')
            for test in tests:
                print(f'\t\tTest ID: {test.id} Status :{test.status}')
                if test.defenses is not None:
                    for defense in test.defenses:
                        print(f'\t\t\tDefense: {defense.name}')
                        for filter in defense.filters:
                            print(f'\t\t\t\tFilter: {filter.name}')
