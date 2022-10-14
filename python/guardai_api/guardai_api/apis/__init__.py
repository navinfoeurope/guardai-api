
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from guardai_api.api.benchmark_api import BenchmarkApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from api.benchmark_api import BenchmarkApi
from api.datasets_api import DatasetsApi
from api.defenses_api import DefensesApi
from api.keys_api import KeysApi
from api.login_api import LoginApi
from api.metrics_api import MetricsApi
from api.model_api import ModelApi
from api.organization_api import OrganizationApi
from api.platform_api import PlatformApi
from api.project_api import ProjectApi
from api.register_api import RegisterApi
from api.reports_api import ReportsApi
from api.test_api import TestApi
from api.test_profiles_api import TestProfilesApi
from api.transform_api import TransformApi
from api.users_api import UsersApi
from api.versions_api import VersionsApi
from api.webhooks_api import WebhooksApi
