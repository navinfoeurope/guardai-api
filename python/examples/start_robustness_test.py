#!/usr/bin/env python
#  Copyright (C) 2021 by NavInfo Europe B.V. The Netherlands - All rights reserved
#  Information classification: Confidential
#  This content is protected by international copyright laws.
#  Reproduction and distribution is prohibited without written permission.
#  -*- coding: utf-8 -*-
__author__ = "Kobus Grobler"

import argparse
import time

from guardai_api.api.test_api import TestApi
from guardai_api.exceptions import ApiException, NotFoundException

from util import get_client

if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='GaurdAI Start Test Example')
    parser.add_argument('--test-id', type=int, required=True,
                        help='The test ID to start.')
    args = parser.parse_args()
    api_client = get_client()
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
