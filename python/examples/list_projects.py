#!/usr/bin/env python
#  Copyright (C) 2021 by NavInfo Europe B.V. The Netherlands - All rights reserved
#  Information classification: Confidential
#  This content is protected by international copyright laws.
#  Reproduction and distribution is prohibited without written permission.
#  -*- coding: utf-8 -*-
__author__ = "Kobus Grobler"

from guardai_api.api.project_api import ProjectApi
from guardai_api.api.test_api import TestApi

from util import get_client

if __name__ == '__main__':

    api_client = get_client()
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
