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
from guardai_api.model.dataset_settings import DatasetSettings
from guardai_api.model.transform import Transform
globals()['DatasetSettings'] = DatasetSettings
globals()['Transform'] = Transform
from guardai_api.model.dataset_request import DatasetRequest


class TestDatasetRequest(unittest.TestCase):
    """DatasetRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDatasetRequest(self):
        """Test DatasetRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DatasetRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()