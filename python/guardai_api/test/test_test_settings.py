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
from guardai_api.model.crafted_test_settings import CraftedTestSettings
from guardai_api.model.dataset_setting import DatasetSetting
from guardai_api.model.detection_test_settings import DetectionTestSettings
from guardai_api.model.metric import Metric
from guardai_api.model.pass_fail_criteria import PassFailCriteria
globals()['CraftedTestSettings'] = CraftedTestSettings
globals()['DatasetSetting'] = DatasetSetting
globals()['DetectionTestSettings'] = DetectionTestSettings
globals()['Metric'] = Metric
globals()['PassFailCriteria'] = PassFailCriteria
from guardai_api.model.test_settings import TestSettings


class TestTestSettings(unittest.TestCase):
    """TestSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTestSettings(self):
        """Test TestSettings"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TestSettings()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
