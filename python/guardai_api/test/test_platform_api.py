"""
    GuardAI Platform API

    GuardAI is an adversarial security assessment Platform for AI  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: info@navinfo.eu
    Generated by: https://openapi-generator.tech
"""


import unittest

import guardai_api
from api.platform_api import PlatformApi  # noqa: E501


class TestPlatformApi(unittest.TestCase):
    """PlatformApi unit test stubs"""

    def setUp(self):
        self.api = PlatformApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_cancel_worker(self):
        """Test case for cancel_worker

        Administrative call to cancel a worker job (admin rights required)  # noqa: E501
        """
        pass

    def test_delete_platform_file(self):
        """Test case for delete_platform_file

        Delete platform file (only admins).  # noqa: E501
        """
        pass

    def test_download_platform_file(self):
        """Test case for download_platform_file

        Download platform file.  # noqa: E501
        """
        pass

    def test_get_environments(self):
        """Test case for get_environments

        Get the list of environments.  # noqa: E501
        """
        pass

    def test_get_queue_info(self):
        """Test case for get_queue_info

        Get worker queue information.  # noqa: E501
        """
        pass

    def test_stat_platform_file(self):
        """Test case for stat_platform_file

        Stat platform file (only admins).  # noqa: E501
        """
        pass

    def test_upload_file_part(self):
        """Test case for upload_file_part

        Upload a file part to the platform.  # noqa: E501
        """
        pass

    def test_upload_platform_file(self):
        """Test case for upload_platform_file

        Upload a file to the platform and return a reference (only admins).  # noqa: E501
        """
        pass

    def test_worker_heartbeat(self):
        """Test case for worker_heartbeat

        Worker heartbeat - can only be called by a worker instance.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
