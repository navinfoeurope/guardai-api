"""
    GuardAI Platform API

    GuardAI is an adversarial security assessment Platform for AI  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: info@navinfo.eu
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import guardai_api
from guardai_api.model.dataset_setting import DatasetSetting
from guardai_api.model.defense_response import DefenseResponse
globals()['DatasetSetting'] = DatasetSetting
globals()['DefenseResponse'] = DefenseResponse
from guardai_api.model.benchmark_test import BenchmarkTest


class TestBenchmarkTest(unittest.TestCase):
    """BenchmarkTest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testBenchmarkTest(self):
        """Test BenchmarkTest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = BenchmarkTest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
