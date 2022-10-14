# guardai_api.ProjectApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_project**](ProjectApi.md#add_project) | **POST** /api/v1/projects | Add a project to an organization.
[**copy_project**](ProjectApi.md#copy_project) | **POST** /api/v1/projects/{id}/copy | Make a copy of the project available to (optionally) another organization.
[**copy_project_model**](ProjectApi.md#copy_project_model) | **POST** /api/v1/projects/{id}/copymodel | Make a copy of the project model available to the organization.
[**delete_data**](ProjectApi.md#delete_data) | **DELETE** /api/v1/projects/{id}/modeldata | Delete project model data.
[**delete_project**](ProjectApi.md#delete_project) | **DELETE** /api/v1/projects/{id} | Delete a project.
[**download_project_data**](ProjectApi.md#download_project_data) | **GET** /api/v1/projects/{id}/data | Download project data.
[**get_project**](ProjectApi.md#get_project) | **GET** /api/v1/projects/{id} | Get a project.
[**get_projects**](ProjectApi.md#get_projects) | **GET** /api/v1/projects | Get list of projects.
[**update_project**](ProjectApi.md#update_project) | **PUT** /api/v1/projects/{id} | Update project .
[**upload_project_data**](ProjectApi.md#upload_project_data) | **POST** /api/v1/projects/{id}/modeldata | Upload project data.
[**upload_project_file**](ProjectApi.md#upload_project_file) | **POST** /api/v1/projects/{id}/files | Upload a file to the project and return a reference.
[**use_model**](ProjectApi.md#use_model) | **GET** /api/v1/projects/{id}/usemodel | Use an existing model to configure the project.
[**verify_project**](ProjectApi.md#verify_project) | **PUT** /api/v1/projects/{id}/verify | Start the model verification process.


# **add_project**
> ProjectResponse add_project(organization_id, project)

Add a project to an organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_request import ProjectRequest
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    organization_id = 1 # int | The organization ID.
    project = ProjectRequest(
        dataset_length=1,
        heads=[
            ModelHead(
                losses=[
                    "losses_example",
                ],
                name="name_example",
            ),
        ],
        message="message_example",
        name="name_example",
        settings=ProjectSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            class_mapping_estimation=True,
            class_mapping_params={},
            dataset_id=1,
            eps_exploration=True,
            eps_exploration_params={},
            head_settings=[
                HeadSetting(
                    head=ModelHead(
                        losses=[
                            "losses_example",
                        ],
                        name="name_example",
                    ),
                    metrics=[
                        Metric(
                            enabled=True,
                            name="name_example",
                            params={},
                            uid="uid_example",
                        ),
                    ],
                ),
            ],
            hpo_id=1,
            hpo_params={},
            optimal_parameterization=True,
            source_model_id=1,
            store_composite_images=True,
            store_intermediate_data=True,
            tasks=[
                "tasks_example",
            ],
            transforms=[
                Transform(
                    id=1,
                    name="name_example",
                    params={},
                ),
            ],
            use_class_names_from_dataset=True,
        ),
        valid=True,
    ) # ProjectRequest | project

    # example passing only required values which don't have defaults set
    try:
        # Add a project to an organization.
        api_response = api_instance.add_project(organization_id, project)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->add_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization_id** | **int**| The organization ID. |
 **project** | [**ProjectRequest**](ProjectRequest.md)| project |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_project**
> ProjectResponse copy_project(id, new_project)

Make a copy of the project available to (optionally) another organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_request import ProjectRequest
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.
    new_project = ProjectRequest(
        dataset_length=1,
        heads=[
            ModelHead(
                losses=[
                    "losses_example",
                ],
                name="name_example",
            ),
        ],
        message="message_example",
        name="name_example",
        settings=ProjectSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            class_mapping_estimation=True,
            class_mapping_params={},
            dataset_id=1,
            eps_exploration=True,
            eps_exploration_params={},
            head_settings=[
                HeadSetting(
                    head=ModelHead(
                        losses=[
                            "losses_example",
                        ],
                        name="name_example",
                    ),
                    metrics=[
                        Metric(
                            enabled=True,
                            name="name_example",
                            params={},
                            uid="uid_example",
                        ),
                    ],
                ),
            ],
            hpo_id=1,
            hpo_params={},
            optimal_parameterization=True,
            source_model_id=1,
            store_composite_images=True,
            store_intermediate_data=True,
            tasks=[
                "tasks_example",
            ],
            transforms=[
                Transform(
                    id=1,
                    name="name_example",
                    params={},
                ),
            ],
            use_class_names_from_dataset=True,
        ),
        valid=True,
    ) # ProjectRequest | Optional new project information.
    dest_org_id = 1 # int | The optional destination organization id. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Make a copy of the project available to (optionally) another organization.
        api_response = api_instance.copy_project(id, new_project)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->copy_project: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Make a copy of the project available to (optionally) another organization.
        api_response = api_instance.copy_project(id, new_project, dest_org_id=dest_org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->copy_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |
 **new_project** | [**ProjectRequest**](ProjectRequest.md)| Optional new project information. |
 **dest_org_id** | **int**| The optional destination organization id. | [optional]

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_project_model**
> copy_project_model(id, model)

Make a copy of the project model available to the organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.model_request import ModelRequest
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.
    model = ModelRequest(
        dataset_id=1,
        description="description_example",
        environment="environment_example",
        framework_type="Keras",
        name="name_example",
        tasks=[
            "tasks_example",
        ],
        transforms=[
            Transform(
                id=1,
                name="name_example",
                params={},
            ),
        ],
    ) # ModelRequest | New model information.
    dest_model_id = 1 # int | The optional destination model id. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Make a copy of the project model available to the organization.
        api_instance.copy_project_model(id, model)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->copy_project_model: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Make a copy of the project model available to the organization.
        api_instance.copy_project_model(id, model, dest_model_id=dest_model_id)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->copy_project_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |
 **model** | [**ModelRequest**](ModelRequest.md)| New model information. |
 **dest_model_id** | **int**| The optional destination model id. | [optional]

### Return type

void (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_data**
> ProjectResponse delete_data(data_type, id)

Delete project model data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    data_type = "Model" # str | dataType
    id = 1 # int | The project ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete project model data.
        api_response = api_instance.delete_data(data_type, id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->delete_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| The project ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project**
> delete_project(id)

Delete a project.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a project.
        api_instance.delete_project(id)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->delete_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |

### Return type

void (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_project_data**
> file_type download_project_data(data_type, id)

Download project data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    data_type = "Model" # str | dataType
    id = 1 # int | The project ID.

    # example passing only required values which don't have defaults set
    try:
        # Download project data.
        api_response = api_instance.download_project_data(data_type, id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->download_project_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| The project ID. |

### Return type

**file_type**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project**
> ProjectResponse get_project(id)

Get a project.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.

    # example passing only required values which don't have defaults set
    try:
        # Get a project.
        api_response = api_instance.get_project(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->get_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects**
> [ProjectResponse] get_projects()

Get list of projects.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    organization_id = 1 # int | The optional organization ID. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get list of projects.
        api_response = api_instance.get_projects(organization_id=organization_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->get_projects: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization_id** | **int**| The optional organization ID. | [optional]

### Return type

[**[ProjectResponse]**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_project**
> ProjectResponse update_project(id, project_request)

Update project .

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_request import ProjectRequest
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.
    project_request = ProjectRequest(
        dataset_length=1,
        heads=[
            ModelHead(
                losses=[
                    "losses_example",
                ],
                name="name_example",
            ),
        ],
        message="message_example",
        name="name_example",
        settings=ProjectSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            class_mapping_estimation=True,
            class_mapping_params={},
            dataset_id=1,
            eps_exploration=True,
            eps_exploration_params={},
            head_settings=[
                HeadSetting(
                    head=ModelHead(
                        losses=[
                            "losses_example",
                        ],
                        name="name_example",
                    ),
                    metrics=[
                        Metric(
                            enabled=True,
                            name="name_example",
                            params={},
                            uid="uid_example",
                        ),
                    ],
                ),
            ],
            hpo_id=1,
            hpo_params={},
            optimal_parameterization=True,
            source_model_id=1,
            store_composite_images=True,
            store_intermediate_data=True,
            tasks=[
                "tasks_example",
            ],
            transforms=[
                Transform(
                    id=1,
                    name="name_example",
                    params={},
                ),
            ],
            use_class_names_from_dataset=True,
        ),
        valid=True,
    ) # ProjectRequest | projectRequest

    # example passing only required values which don't have defaults set
    try:
        # Update project .
        api_response = api_instance.update_project(id, project_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->update_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |
 **project_request** | [**ProjectRequest**](ProjectRequest.md)| projectRequest |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_project_data**
> ProjectResponse upload_project_data(data_type, id)

Upload project data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    data_type = "Model" # str | dataType
    id = 1 # int | The project ID.
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload project data.
        api_response = api_instance.upload_project_data(data_type, id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->upload_project_data: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload project data.
        api_response = api_instance.upload_project_data(data_type, id, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->upload_project_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| The project ID. |
 **file** | **file_type**|  | [optional]

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_project_file**
> str upload_project_file(id, type)

Upload a file to the project and return a reference.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.
    type = "type_example" # str | Upload type - 'transform' for transform parameters
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload a file to the project and return a reference.
        api_response = api_instance.upload_project_file(id, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->upload_project_file: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload a file to the project and return a reference.
        api_response = api_instance.upload_project_file(id, type, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->upload_project_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |
 **type** | **str**| Upload type - &#39;transform&#39; for transform parameters |
 **file** | **file_type**|  | [optional]

### Return type

**str**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **use_model**
> ProjectResponse use_model(id, model_id)

Use an existing model to configure the project.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.
    model_id = 1 # int | The model ID.

    # example passing only required values which don't have defaults set
    try:
        # Use an existing model to configure the project.
        api_response = api_instance.use_model(id, model_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->use_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |
 **model_id** | **int**| The model ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_project**
> ProjectResponse verify_project(id)

Start the model verification process.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import project_api
from guardai_api.model.project_response import ProjectResponse
from pprint import pprint
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
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | The project ID.

    # example passing only required values which don't have defaults set
    try:
        # Start the model verification process.
        api_response = api_instance.verify_project(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ProjectApi->verify_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The project ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

