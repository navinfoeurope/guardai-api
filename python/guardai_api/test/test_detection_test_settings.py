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
globals()['DatasetSetting'] = DatasetSetting
from guardai_api.model.detection_test_settings import DetectionTestSettings


class TestDetectionTestSettings(unittest.TestCase):
    """DetectionTestSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDetectionTestSettings(self):
        """Test DetectionTestSettings"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DetectionTestSettings()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
