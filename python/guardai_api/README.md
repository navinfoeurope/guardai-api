# GuardAI-api
GuardAI is an adversarial security assessment Platform for AI

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0
- Package version: 1.0.1
- Build package: org.openapitools.codegen.languages.PythonPriorClientCodegen
For more information, please visit [https://www.navinfo.eu](https://www.navinfo.eu)

## Requirements.

Python >=3.6

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/navinfoeurope/guardai-api.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/navinfoeurope/guardai-api.git`)

Then import the package:
```python
import guardai_api
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import guardai_api
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import time
import guardai_api
from pprint import pprint
from api import benchmark_api
from guardai_api.model.benchmark_request import BenchmarkRequest
from guardai_api.model.benchmark_response import BenchmarkResponse
from guardai_api.model.benchmark_test import BenchmarkTest
from guardai_api.model.benchmark_test_request import BenchmarkTestRequest
from guardai_api.model.benchmark_test_status_response import BenchmarkTestStatusResponse
from guardai_api.model.defense_request import DefenseRequest
from guardai_api.model.filter_request import FilterRequest
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'


# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = benchmark_api.BenchmarkApi(api_client)
    organization_id = 1 # int | The organization ID.
    benchmark_request = BenchmarkRequest(
        name="name_example",
        settings=BenchmarkSettings(
            projects=[
                BenchmarkProject(
                    enabled=True,
                    id=1,
                ),
            ],
            tasks=[
                "tasks_example",
            ],
            tests=[
                BenchmarkTest(
                    dataset_setting=DatasetSetting(
                        batch_size=1,
                        end_idx=1,
                        fraction=3.14,
                        indexes=[
                            1,
                        ],
                        num_items=1,
                        selection_type="COUNT",
                        shuffle=True,
                        start_idx=1,
                        workers=1,
                    ),
                    defenses=[
                        DefenseResponse(
                            defense_parameters="defense_parameters_example",
                            filters=[
                                AIFilter(
                                    codebase_name="codebase_name_example",
                                    enabled=True,
                                    group=[
                                        "group_example",
                                    ],
                                    id=1,
                                    name="name_example",
                                    paper_link="paper_link_example",
                                    parameters="parameters_example",
                                    tasks=[
                                        "tasks_example",
                                    ],
                                    type="type_example",
                                ),
                            ],
                            id=1,
                            name="name_example",
                            test_id=1,
                        ),
                    ],
                    id=1,
                    name="name_example",
                    status="CANCELLED",
                ),
            ],
        ),
    ) # BenchmarkRequest | benchmarkRequest

    try:
        # Add a benchmark to an organization.
        api_response = api_instance.add_benchmark(organization_id, benchmark_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->add_benchmark: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8082*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BenchmarkApi* | [**add_benchmark**](docs/BenchmarkApi.md#add_benchmark) | **POST** /api/v1/benchmarks | Add a benchmark to an organization.
*BenchmarkApi* | [**add_benchmark_test**](docs/BenchmarkApi.md#add_benchmark_test) | **POST** /api/v1/benchmarks/{id}/addtest | Add new test.
*BenchmarkApi* | [**add_benchmark_test_defense**](docs/BenchmarkApi.md#add_benchmark_test_defense) | **POST** /api/v1/benchmarks/{id}/{testId}/defense | Add defense to benchmark test.
*BenchmarkApi* | [**add_benchmark_test_filter**](docs/BenchmarkApi.md#add_benchmark_test_filter) | **POST** /api/v1/benchmarks/{id}/{testId}/filter | Add filter to benchmark test.
*BenchmarkApi* | [**delete_benchmark**](docs/BenchmarkApi.md#delete_benchmark) | **DELETE** /api/v1/benchmarks/{id} | Delete a benchmark.
*BenchmarkApi* | [**delete_benchmark_test**](docs/BenchmarkApi.md#delete_benchmark_test) | **DELETE** /api/v1/benchmarks/{id}/{testId} | Delete a benchmark test.
*BenchmarkApi* | [**get_benchmark**](docs/BenchmarkApi.md#get_benchmark) | **GET** /api/v1/benchmarks/{id} | Get a benchmark.
*BenchmarkApi* | [**get_benchmark_test_status**](docs/BenchmarkApi.md#get_benchmark_test_status) | **GET** /api/v1/benchmarks/{id}/{testId}/status | Get benchmark test status.
*BenchmarkApi* | [**get_benchmarks**](docs/BenchmarkApi.md#get_benchmarks) | **GET** /api/v1/benchmarks | Get list of benchmarks.
*BenchmarkApi* | [**remove_benchmark_filter**](docs/BenchmarkApi.md#remove_benchmark_filter) | **DELETE** /api/v1/benchmarks/{id}/{testId}/{filterId} | Remove filter from benchmark test.
*BenchmarkApi* | [**remove_benchmark_test_defense**](docs/BenchmarkApi.md#remove_benchmark_test_defense) | **DELETE** /api/v1/benchmarks/{id}/{testId}/defense/{defenseId} | Remove defense from benchmark test.
*BenchmarkApi* | [**start_benchmark_test**](docs/BenchmarkApi.md#start_benchmark_test) | **GET** /api/v1/benchmarks/{id}/{testId}/start | Start a benchmark test.
*BenchmarkApi* | [**stop_benchmark_test**](docs/BenchmarkApi.md#stop_benchmark_test) | **GET** /api/v1/benchmarks/{id}/{testId}/stop | Stop a benchmark test.
*BenchmarkApi* | [**update_benchmark**](docs/BenchmarkApi.md#update_benchmark) | **PUT** /api/v1/benchmarks/{id} | Update benchmark.
*BenchmarkApi* | [**update_benchmark_test**](docs/BenchmarkApi.md#update_benchmark_test) | **PUT** /api/v1/benchmarks/{id}/{testId} | Update test.
*DatasetsApi* | [**copy_dataset**](docs/DatasetsApi.md#copy_dataset) | **POST** /api/v1/datasets/{id}/copy | Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.
*DatasetsApi* | [**delete_custom_dataset**](docs/DatasetsApi.md#delete_custom_dataset) | **DELETE** /api/v1/datasets/{id}/{orgId} | Delete dataset.
*DatasetsApi* | [**download_dataset**](docs/DatasetsApi.md#download_dataset) | **GET** /api/v1/datasets/{id}/{orgId}/data | Download dataset data.
*DatasetsApi* | [**get_dataset**](docs/DatasetsApi.md#get_dataset) | **GET** /api/v1/datasets/{id}/{orgId} | Get dataset.
*DatasetsApi* | [**get_dataset_classes**](docs/DatasetsApi.md#get_dataset_classes) | **GET** /api/v1/datasets/{id}/{orgId}/classes | Retrieve dataset classes (coco dataset supported).
*DatasetsApi* | [**get_dataset_item**](docs/DatasetsApi.md#get_dataset_item) | **GET** /api/v1/datasets/{id}/{idx}/item | Get an item from the dataset.
*DatasetsApi* | [**get_dataset_target**](docs/DatasetsApi.md#get_dataset_target) | **GET** /api/v1/datasets/{id}/{idx}/target | Get a target from the dataset.
*DatasetsApi* | [**get_datasets**](docs/DatasetsApi.md#get_datasets) | **GET** /api/v1/datasets/{orgId} | Get the datasets defined for this organization.
*DatasetsApi* | [**update_custom_dataset**](docs/DatasetsApi.md#update_custom_dataset) | **PUT** /api/v1/datasets/{id}/{orgId} | Update dataset.
*DatasetsApi* | [**upload_dataset**](docs/DatasetsApi.md#upload_dataset) | **POST** /api/v1/datasets/{orgId} | Upload dataset.
*DatasetsApi* | [**upload_dataset_file**](docs/DatasetsApi.md#upload_dataset_file) | **POST** /api/v1/datasets/{id}/file | Upload a file to the dataset and return a reference.
*DefensesApi* | [**get_defense**](docs/DefensesApi.md#get_defense) | **GET** /api/v1/defenses/{id} | Get a defense.
*DefensesApi* | [**update_defense**](docs/DefensesApi.md#update_defense) | **PUT** /api/v1/defenses/{id} | Update defense.
*KeysApi* | [**create_key**](docs/KeysApi.md#create_key) | **POST** /api/v1/keys | Create API key.
*KeysApi* | [**delete_key**](docs/KeysApi.md#delete_key) | **DELETE** /api/v1/keys/{id} | Delete a key.
*KeysApi* | [**get_key**](docs/KeysApi.md#get_key) | **GET** /api/v1/keys/{id} | Get a key.
*KeysApi* | [**get_keys**](docs/KeysApi.md#get_keys) | **GET** /api/v1/keys | Get all of a user&#39;s keys.
*LoginApi* | [**get_auth_user**](docs/LoginApi.md#get_auth_user) | **GET** /api/v1/login/token | Get the currently OAuth2 authenticated user platform token.
*LoginApi* | [**get_o_auth_clients**](docs/LoginApi.md#get_o_auth_clients) | **GET** /api/v1/login/sso | Get the list of supported OAuth clients.
*LoginApi* | [**login**](docs/LoginApi.md#login) | **POST** /api/v1/login | Retrieve an access token using API keys.
*MetricsApi* | [**add_metric**](docs/MetricsApi.md#add_metric) | **POST** /api/v1/metrics | Add a metric to an organization.
*MetricsApi* | [**delete_metric**](docs/MetricsApi.md#delete_metric) | **DELETE** /api/v1/metrics/{id} | Delete a metric by ID.
*MetricsApi* | [**download_metric_file**](docs/MetricsApi.md#download_metric_file) | **GET** /api/v1/metrics/{id}/data | Download metric file.
*MetricsApi* | [**get_metric**](docs/MetricsApi.md#get_metric) | **GET** /api/v1/metrics/{id} | Get a metric by ID.
*MetricsApi* | [**get_metrics**](docs/MetricsApi.md#get_metrics) | **GET** /api/v1/metrics | Get the custom metrics available for this user.
*MetricsApi* | [**update_metric**](docs/MetricsApi.md#update_metric) | **PUT** /api/v1/metrics/{id} | Update metric by ID.
*MetricsApi* | [**upload_metric_file**](docs/MetricsApi.md#upload_metric_file) | **POST** /api/v1/metrics/{id} | Upload the metric implementation.
*ModelApi* | [**add_model**](docs/ModelApi.md#add_model) | **POST** /api/v1/models | Add a model to an organization.
*ModelApi* | [**copy_model**](docs/ModelApi.md#copy_model) | **POST** /api/v1/models/{id}/copy | Make a copy of a model. To copy to a different organization, extra permissions are required.
*ModelApi* | [**delete_model**](docs/ModelApi.md#delete_model) | **DELETE** /api/v1/models/{id} | Delete a model by ID.
*ModelApi* | [**download_model_data**](docs/ModelApi.md#download_model_data) | **GET** /api/v1/models/{id}/data | Download model data.
*ModelApi* | [**get_model**](docs/ModelApi.md#get_model) | **GET** /api/v1/models/{id} | Get a model by ID.
*ModelApi* | [**get_models**](docs/ModelApi.md#get_models) | **GET** /api/v1/models | Get the models available for this user.
*ModelApi* | [**update_model**](docs/ModelApi.md#update_model) | **PUT** /api/v1/models/{id} | Update model by ID.
*ModelApi* | [**upload_model_data**](docs/ModelApi.md#upload_model_data) | **POST** /api/v1/models/{modelId}/modeldata | Upload model data.
*OrganizationApi* | [**add_organization**](docs/OrganizationApi.md#add_organization) | **POST** /api/v1/organizations | Add organization.
*OrganizationApi* | [**copy_organization**](docs/OrganizationApi.md#copy_organization) | **POST** /api/v1/organizations/{id}/copy | Make a copy of the organization to another organization (requires admin permissions).
*OrganizationApi* | [**delete_organization**](docs/OrganizationApi.md#delete_organization) | **DELETE** /api/v1/organizations/{id} | Delete an organization.
*OrganizationApi* | [**delete_organization_file**](docs/OrganizationApi.md#delete_organization_file) | **DELETE** /api/v1/organizations/{id}/file | Delete organization file.
*OrganizationApi* | [**download_organization_file**](docs/OrganizationApi.md#download_organization_file) | **GET** /api/v1/organizations/{id}/file | Download organization file.
*OrganizationApi* | [**get_asset_definitions**](docs/OrganizationApi.md#get_asset_definitions) | **GET** /api/v1/organizations/{id}/assets | Get the assets defined for this organization.
*OrganizationApi* | [**get_defined_hpo**](docs/OrganizationApi.md#get_defined_hpo) | **GET** /api/v1/organizations/{id}/hpo | Get the hyper-parameter optimization methods defined for this organization.
*OrganizationApi* | [**get_defined_transforms**](docs/OrganizationApi.md#get_defined_transforms) | **GET** /api/v1/organizations/{id}/transforms | Get the transforms defined for this organization.
*OrganizationApi* | [**get_members**](docs/OrganizationApi.md#get_members) | **GET** /api/v1/organizations/{id}/members | Get all members (admin access rights required).
*OrganizationApi* | [**get_organization**](docs/OrganizationApi.md#get_organization) | **GET** /api/v1/organizations/{id} | Get organization by id.
*OrganizationApi* | [**get_organization_file_usage**](docs/OrganizationApi.md#get_organization_file_usage) | **GET** /api/v1/organizations/{id}/file/usage | Get organization file project usage.
*OrganizationApi* | [**get_organizations**](docs/OrganizationApi.md#get_organizations) | **GET** /api/v1/organizations | Get all organizations - (requires admin permissions).
*OrganizationApi* | [**rename_organization_file**](docs/OrganizationApi.md#rename_organization_file) | **PUT** /api/v1/organizations/{id}/file | Rename organization file.
*OrganizationApi* | [**update_org_stats**](docs/OrganizationApi.md#update_org_stats) | **GET** /api/v1/organizations/{id}/stat | Update storage and accounting information for this organization (admin rights).
*OrganizationApi* | [**update_organization**](docs/OrganizationApi.md#update_organization) | **PUT** /api/v1/organizations/{id} | Update organization.
*OrganizationApi* | [**upload_organization_file**](docs/OrganizationApi.md#upload_organization_file) | **POST** /api/v1/organizations/{id}/file | Upload a file to the organization and return a reference.
*PlatformApi* | [**cancel_worker**](docs/PlatformApi.md#cancel_worker) | **GET** /api/v1/platform/cancel | Administrative call to cancel a worker job (admin rights required)
*PlatformApi* | [**delete_platform_file**](docs/PlatformApi.md#delete_platform_file) | **DELETE** /api/v1/platform/file | Delete platform file (only admins).
*PlatformApi* | [**download_platform_file**](docs/PlatformApi.md#download_platform_file) | **GET** /api/v1/platform/file | Download platform file.
*PlatformApi* | [**get_environments**](docs/PlatformApi.md#get_environments) | **GET** /api/v1/platform/environments | Get the list of environments.
*PlatformApi* | [**get_queue_info**](docs/PlatformApi.md#get_queue_info) | **GET** /api/v1/platform/workerqueue | Get worker queue information.
*PlatformApi* | [**stat_platform_file**](docs/PlatformApi.md#stat_platform_file) | **GET** /api/v1/platform/file/stat | Stat platform file (only admins).
*PlatformApi* | [**upload_file_part**](docs/PlatformApi.md#upload_file_part) | **POST** /api/v1/platform/filepart | Upload a file part to the platform.
*PlatformApi* | [**upload_platform_file**](docs/PlatformApi.md#upload_platform_file) | **POST** /api/v1/platform/file | Upload a file to the platform and return a reference (only admins).
*PlatformApi* | [**worker_heartbeat**](docs/PlatformApi.md#worker_heartbeat) | **PUT** /api/v1/platform/heartbeat | Worker heartbeat - can only be called by a worker instance.
*ProjectApi* | [**add_project**](docs/ProjectApi.md#add_project) | **POST** /api/v1/projects | Add a project to an organization.
*ProjectApi* | [**copy_project**](docs/ProjectApi.md#copy_project) | **POST** /api/v1/projects/{id}/copy | Make a copy of the project available to (optionally) another organization.
*ProjectApi* | [**copy_project_model**](docs/ProjectApi.md#copy_project_model) | **POST** /api/v1/projects/{id}/copymodel | Make a copy of the project model available to the organization.
*ProjectApi* | [**delete_data**](docs/ProjectApi.md#delete_data) | **DELETE** /api/v1/projects/{id}/modeldata | Delete project model data.
*ProjectApi* | [**delete_project**](docs/ProjectApi.md#delete_project) | **DELETE** /api/v1/projects/{id} | Delete a project.
*ProjectApi* | [**download_project_data**](docs/ProjectApi.md#download_project_data) | **GET** /api/v1/projects/{id}/data | Download project data.
*ProjectApi* | [**get_project**](docs/ProjectApi.md#get_project) | **GET** /api/v1/projects/{id} | Get a project.
*ProjectApi* | [**get_projects**](docs/ProjectApi.md#get_projects) | **GET** /api/v1/projects | Get list of projects.
*ProjectApi* | [**update_project**](docs/ProjectApi.md#update_project) | **PUT** /api/v1/projects/{id} | Update project .
*ProjectApi* | [**upload_project_data**](docs/ProjectApi.md#upload_project_data) | **POST** /api/v1/projects/{id}/modeldata | Upload project data.
*ProjectApi* | [**upload_project_file**](docs/ProjectApi.md#upload_project_file) | **POST** /api/v1/projects/{id}/files | Upload a file to the project and return a reference.
*ProjectApi* | [**use_model**](docs/ProjectApi.md#use_model) | **GET** /api/v1/projects/{id}/usemodel | Use an existing model to configure the project.
*ProjectApi* | [**verify_project**](docs/ProjectApi.md#verify_project) | **PUT** /api/v1/projects/{id}/verify | Start the model verification process.
*RegisterApi* | [**register**](docs/RegisterApi.md#register) | **POST** /api/v1/register | Register user
*RegisterApi* | [**send_invite**](docs/RegisterApi.md#send_invite) | **POST** /api/v1/register/invite | Send user invite - admin permissions required.
*ReportsApi* | [**add_report**](docs/ReportsApi.md#add_report) | **POST** /api/v1/reports | Add report.
*ReportsApi* | [**delete_report**](docs/ReportsApi.md#delete_report) | **DELETE** /api/v1/reports/{id} | Delete a report.
*ReportsApi* | [**download_report_data**](docs/ReportsApi.md#download_report_data) | **GET** /api/v1/reports/{id}/download | Download report data.
*ReportsApi* | [**get_report**](docs/ReportsApi.md#get_report) | **GET** /api/v1/reports/{reportId} | Get a report.
*ReportsApi* | [**get_report_file**](docs/ReportsApi.md#get_report_file) | **GET** /api/v1/reports/{id}/file | Get file from report.
*ReportsApi* | [**get_report_meta_data**](docs/ReportsApi.md#get_report_meta_data) | **GET** /api/v1/reports/{id}/meta | Get meta data.
*ReportsApi* | [**get_reports**](docs/ReportsApi.md#get_reports) | **GET** /api/v1/reports | Get reports for a test.
*ReportsApi* | [**view_data**](docs/ReportsApi.md#view_data) | **GET** /api/v1/reports/{id}/{didx}/{aidx}/{idx}/{tag} | View report data.
*TestApi* | [**add_defense**](docs/TestApi.md#add_defense) | **POST** /api/v1/tests/{testId}/defense | Add defense.
*TestApi* | [**add_filter**](docs/TestApi.md#add_filter) | **POST** /api/v1/tests/{id}/filter | Add a filter.
*TestApi* | [**add_test**](docs/TestApi.md#add_test) | **POST** /api/v1/tests | Add a new test.
*TestApi* | [**delete_test**](docs/TestApi.md#delete_test) | **DELETE** /api/v1/tests/{id} | Delete a test.
*TestApi* | [**get_defenses**](docs/TestApi.md#get_defenses) | **GET** /api/v1/tests/{testId}/defenses | Get defenses.
*TestApi* | [**get_status**](docs/TestApi.md#get_status) | **GET** /api/v1/tests/{testId}/status | Get test status.
*TestApi* | [**get_tests**](docs/TestApi.md#get_tests) | **GET** /api/v1/tests | Get tests for a project.
*TestApi* | [**remove_defense**](docs/TestApi.md#remove_defense) | **DELETE** /api/v1/tests/{testId}/defense/{id} | Remove defense.
*TestApi* | [**remove_filter**](docs/TestApi.md#remove_filter) | **DELETE** /api/v1/tests/{testId}/filter/{id} | Remove a filter.
*TestApi* | [**start_test**](docs/TestApi.md#start_test) | **GET** /api/v1/tests/{testId}/start | Start a test.
*TestApi* | [**stop_test**](docs/TestApi.md#stop_test) | **GET** /api/v1/tests/{id}/stop | Stop all the running jobs in a test.
*TestApi* | [**update_status**](docs/TestApi.md#update_status) | **PUT** /api/v1/tests/{testId}/status | Update test status - can only be called by worker instance.
*TestApi* | [**update_test**](docs/TestApi.md#update_test) | **PUT** /api/v1/tests/{id} | Update test.
*TestApi* | [**update_test_run**](docs/TestApi.md#update_test_run) | **PUT** /api/v1/tests/testrun/{id} | Update test run.
*TestProfilesApi* | [**add_profile**](docs/TestProfilesApi.md#add_profile) | **POST** /api/v1/profiles/{testId} | Add a profile to an organization using the provided test id as a template.
*TestProfilesApi* | [**add_test_profile_defense**](docs/TestProfilesApi.md#add_test_profile_defense) | **PUT** /api/v1/profiles/{id}/adddefense | Add a defense to the profile
*TestProfilesApi* | [**add_test_profile_filter**](docs/TestProfilesApi.md#add_test_profile_filter) | **PUT** /api/v1/profiles/{id}/addfilter | Add a filter to the profile
*TestProfilesApi* | [**copy_profile**](docs/TestProfilesApi.md#copy_profile) | **POST** /api/v1/profiles/{id}/copy | Make a copy of a profile. To copy to a different organization, extra permissions are required.
*TestProfilesApi* | [**create_test_profile**](docs/TestProfilesApi.md#create_test_profile) | **POST** /api/v1/profiles | Create a new test profile
*TestProfilesApi* | [**delete_profile**](docs/TestProfilesApi.md#delete_profile) | **DELETE** /api/v1/profiles/{id} | Delete a profile by ID.
*TestProfilesApi* | [**get_test_profile**](docs/TestProfilesApi.md#get_test_profile) | **GET** /api/v1/profiles/{id} | Get the test profile.
*TestProfilesApi* | [**get_test_profiles**](docs/TestProfilesApi.md#get_test_profiles) | **GET** /api/v1/profiles | Get the profiles available for this user.
*TestProfilesApi* | [**remove_test_profile_defense**](docs/TestProfilesApi.md#remove_test_profile_defense) | **DELETE** /api/v1/profiles/{id}/defense/{defenseId} | Remove defense from test profile.
*TestProfilesApi* | [**update_test_profile**](docs/TestProfilesApi.md#update_test_profile) | **PUT** /api/v1/profiles/{id} | Update profile by ID.
*TransformApi* | [**add_transform**](docs/TransformApi.md#add_transform) | **POST** /api/v1/transforms | Add a transform to an organization.
*TransformApi* | [**delete_transform**](docs/TransformApi.md#delete_transform) | **DELETE** /api/v1/transforms/{id} | Delete a transform by ID.
*TransformApi* | [**download_file**](docs/TransformApi.md#download_file) | **GET** /api/v1/transforms/{id}/data | Download transform file.
*TransformApi* | [**get_transform**](docs/TransformApi.md#get_transform) | **GET** /api/v1/transforms/{id} | Get a transform by ID.
*TransformApi* | [**get_transforms**](docs/TransformApi.md#get_transforms) | **GET** /api/v1/transforms | Get the transforms available for this user.
*TransformApi* | [**update_transform**](docs/TransformApi.md#update_transform) | **PUT** /api/v1/transforms/{id} | Update transform by ID.
*TransformApi* | [**upload_file**](docs/TransformApi.md#upload_file) | **POST** /api/v1/transforms/{id} | Upload the data file for the transform.
*UsersApi* | [**delete_user**](docs/UsersApi.md#delete_user) | **DELETE** /api/v1/users/{id} | Delete a user.
*UsersApi* | [**get_logged_in_user**](docs/UsersApi.md#get_logged_in_user) | **GET** /api/v1/users/me | Get the currently logged-in user.
*UsersApi* | [**get_user**](docs/UsersApi.md#get_user) | **GET** /api/v1/users/{id} | Get a user.
*UsersApi* | [**get_user_logs**](docs/UsersApi.md#get_user_logs) | **GET** /api/v1/users/{id}/logs | Get user logs.
*UsersApi* | [**get_users**](docs/UsersApi.md#get_users) | **GET** /api/v1/users | Get all users (access rights required).
*UsersApi* | [**send_feedback**](docs/UsersApi.md#send_feedback) | **POST** /api/v1/users/feedback | Send user feedback.
*UsersApi* | [**update_profile**](docs/UsersApi.md#update_profile) | **PUT** /api/v1/users | Update profile of currently authenticated user.
*UsersApi* | [**update_user**](docs/UsersApi.md#update_user) | **PUT** /api/v1/users/{id} | Update user by user id - (admin permission required)
*VersionsApi* | [**get_platform_version**](docs/VersionsApi.md#get_platform_version) | **GET** /api/v1/versions | Get platform version
*WebhooksApi* | [**create_webhook**](docs/WebhooksApi.md#create_webhook) | **POST** /api/v1/webhooks/test/{testId} | Create a webhook for a test.
*WebhooksApi* | [**delete_webhook**](docs/WebhooksApi.md#delete_webhook) | **DELETE** /api/v1/webhooks/{hookId} | Delete a webhook.
*WebhooksApi* | [**get_webhook**](docs/WebhooksApi.md#get_webhook) | **GET** /api/v1/webhooks/{webhookId} | Get a webhook.
*WebhooksApi* | [**get_webhooks**](docs/WebhooksApi.md#get_webhooks) | **GET** /api/v1/webhooks/test/{testId} | Get all webhooks defined for a test.
*WebhooksApi* | [**update_webhook**](docs/WebhooksApi.md#update_webhook) | **PUT** /api/v1/webhooks/{hookId} | Update a webhook.


## Documentation For Models

 - [AIFilter](docs/AIFilter.md)
 - [APIKeyResponse](docs/APIKeyResponse.md)
 - [Annotation](docs/Annotation.md)
 - [AssetsResponse](docs/AssetsResponse.md)
 - [AuthorizedUserResponse](docs/AuthorizedUserResponse.md)
 - [BenchmarkProject](docs/BenchmarkProject.md)
 - [BenchmarkRequest](docs/BenchmarkRequest.md)
 - [BenchmarkResponse](docs/BenchmarkResponse.md)
 - [BenchmarkSettings](docs/BenchmarkSettings.md)
 - [BenchmarkTest](docs/BenchmarkTest.md)
 - [BenchmarkTestRequest](docs/BenchmarkTestRequest.md)
 - [BenchmarkTestStatusResponse](docs/BenchmarkTestStatusResponse.md)
 - [BoundingBox](docs/BoundingBox.md)
 - [ClassMappingFileRef](docs/ClassMappingFileRef.md)
 - [CraftedTestSettings](docs/CraftedTestSettings.md)
 - [DataSet](docs/DataSet.md)
 - [DatasetRequest](docs/DatasetRequest.md)
 - [DatasetSetting](docs/DatasetSetting.md)
 - [DatasetSettings](docs/DatasetSettings.md)
 - [DatasetTarget](docs/DatasetTarget.md)
 - [DefenseRequest](docs/DefenseRequest.md)
 - [DefenseResponse](docs/DefenseResponse.md)
 - [DetectionTestSettings](docs/DetectionTestSettings.md)
 - [EnvironmentResponse](docs/EnvironmentResponse.md)
 - [FileStatResponse](docs/FileStatResponse.md)
 - [FilterRequest](docs/FilterRequest.md)
 - [HPODefinition](docs/HPODefinition.md)
 - [HeadSetting](docs/HeadSetting.md)
 - [InviteRequest](docs/InviteRequest.md)
 - [LogEntryResponse](docs/LogEntryResponse.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [Metric](docs/Metric.md)
 - [MetricDefinition](docs/MetricDefinition.md)
 - [ModelHead](docs/ModelHead.md)
 - [ModelRequest](docs/ModelRequest.md)
 - [ModelResponse](docs/ModelResponse.md)
 - [OrganizationRequest](docs/OrganizationRequest.md)
 - [OrganizationResponse](docs/OrganizationResponse.md)
 - [OrganizationSettings](docs/OrganizationSettings.md)
 - [OrganizationStatsResponse](docs/OrganizationStatsResponse.md)
 - [PassFailCriteria](docs/PassFailCriteria.md)
 - [PipelineResponse](docs/PipelineResponse.md)
 - [ProfileSettings](docs/ProfileSettings.md)
 - [ProjectRequest](docs/ProjectRequest.md)
 - [ProjectResponse](docs/ProjectResponse.md)
 - [ProjectSettings](docs/ProjectSettings.md)
 - [QueueInfoResponse](docs/QueueInfoResponse.md)
 - [Rectangle](docs/Rectangle.md)
 - [RegisterRequest](docs/RegisterRequest.md)
 - [ReportRequest](docs/ReportRequest.md)
 - [ReportResponse](docs/ReportResponse.md)
 - [Resource](docs/Resource.md)
 - [Segmentation](docs/Segmentation.md)
 - [StatusRequest](docs/StatusRequest.md)
 - [TestProfileRequest](docs/TestProfileRequest.md)
 - [TestProfileResponse](docs/TestProfileResponse.md)
 - [TestRequest](docs/TestRequest.md)
 - [TestResponse](docs/TestResponse.md)
 - [TestRunRequest](docs/TestRunRequest.md)
 - [TestRunResponse](docs/TestRunResponse.md)
 - [TestSettings](docs/TestSettings.md)
 - [Transform](docs/Transform.md)
 - [TransformDefinition](docs/TransformDefinition.md)
 - [UserRequest](docs/UserRequest.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserSettings](docs/UserSettings.md)
 - [WebHookSettings](docs/WebHookSettings.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WorkerHeartbeatEntry](docs/WorkerHeartbeatEntry.md)
 - [WorkerHeartbeatRequest](docs/WorkerHeartbeatRequest.md)


## Documentation For Authorization


## JWT

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author

info@navinfo.eu


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in guardai_api.apis and guardai_api.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from guardai_api.api.default_api import DefaultApi`
- `from guardai_api.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import guardai_api
from guardai_api.apis import *
from guardai_api.models import *
```

