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
from guardai_api.model.model_head import ModelHead
from guardai_api.model.project_settings import ProjectSettings
globals()['ModelHead'] = ModelHead
globals()['ProjectSettings'] = ProjectSettings
from guardai_api.model.project_request import ProjectRequest


class TestProjectRequest(unittest.TestCase):
    """ProjectRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testProjectRequest(self):
        """Test ProjectRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ProjectRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()