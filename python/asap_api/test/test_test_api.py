"""
    Adversarial Security Assessment Platform for AI

    Adversarial Security Assessment Platform for AI API  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: info@navinfo.eu
    Generated by: https://openapi-generator.tech
"""


import unittest

import asap_client
from asap_api.test_api import TestApi  # noqa: E501


class TestTestApi(unittest.TestCase):
    """TestApi unit test stubs"""

    def setUp(self):
        self.api = TestApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_attack(self):
        """Test case for add_attack

        Add attack.  # noqa: E501
        """
        pass

    def test_add_defense(self):
        """Test case for add_defense

        Add defense.  # noqa: E501
        """
        pass

    def test_add_noise(self):
        """Test case for add_noise

        Add noise.  # noqa: E501
        """
        pass

    def test_add_test(self):
        """Test case for add_test

        Add new test.  # noqa: E501
        """
        pass

    def test_delete_test(self):
        """Test case for delete_test

        Delete a test.  # noqa: E501
        """
        pass

    def test_get_defenses(self):
        """Test case for get_defenses

        Get defenses.  # noqa: E501
        """
        pass

    def test_get_status(self):
        """Test case for get_status

        Get test status.  # noqa: E501
        """
        pass

    def test_get_tests(self):
        """Test case for get_tests

        Get tests.  # noqa: E501
        """
        pass

    def test_remove_defense(self):
        """Test case for remove_defense

        Remove defense.  # noqa: E501
        """
        pass

    def test_remove_filter(self):
        """Test case for remove_filter

        Remove filter.  # noqa: E501
        """
        pass

    def test_start_test(self):
        """Test case for start_test

        Start a test.  # noqa: E501
        """
        pass

    def test_stop_test(self):
        """Test case for stop_test

        Stop a test.  # noqa: E501
        """
        pass

    def test_update_status(self):
        """Test case for update_status

        Update test status.  # noqa: E501
        """
        pass

    def test_update_test(self):
        """Test case for update_test

        Update test.  # noqa: E501
        """
        pass

    def test_upload_data(self):
        """Test case for upload_data

        Upload data.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()