# asap_client.ProjectApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_project**](ProjectApi.md#add_project) | **POST** /api/v1/projects | Add a project to a organization.
[**delete_data**](ProjectApi.md#delete_data) | **DELETE** /api/v1/projects/{id}/modeldata | Delete project model data.
[**delete_project**](ProjectApi.md#delete_project) | **DELETE** /api/v1/projects/{id} | Delete a project.
[**download_project_data**](ProjectApi.md#download_project_data) | **GET** /api/v1/projects/{id}/data | Download project data.
[**get_project**](ProjectApi.md#get_project) | **GET** /api/v1/projects/{id} | Get a project.
[**get_projects**](ProjectApi.md#get_projects) | **GET** /api/v1/projects | Get list of projects.
[**update_project**](ProjectApi.md#update_project) | **PUT** /api/v1/projects/{id} | Update project .
[**upload_project_data**](ProjectApi.md#upload_project_data) | **POST** /api/v1/projects/{id}/modeldata | Upload project data.


# **add_project**
> ProjectResponse add_project(organization_id, project)

Add a project to a organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import project_api
from asap_client.model.project_request import ProjectRequest
from asap_client.model.project_response import ProjectResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    organization_id = 1 # int | organizationId
    project = ProjectRequest(
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
                        ),
                    ],
                ),
            ],
            store_intermediate_data=True,
        ),
        valid=True,
    ) # ProjectRequest | project

    # example passing only required values which don't have defaults set
    try:
        # Add a project to a organization.
        api_response = api_instance.add_project(organization_id, project)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->add_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization_id** | **int**| organizationId |
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

# **delete_data**
> ProjectResponse delete_data(data_type, id)

Delete project model data.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import project_api
from asap_client.model.project_response import ProjectResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    data_type = "Dataset" # str | dataType
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete project model data.
        api_response = api_instance.delete_data(data_type, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->delete_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| id |

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
import asap_client
from asap_api import project_api
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete a project.
        api_instance.delete_project(id)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->delete_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

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
import asap_client
from asap_api import project_api
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    data_type = "Dataset" # str | dataType
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Download project data.
        api_response = api_instance.download_project_data(data_type, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->download_project_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| id |

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
import asap_client
from asap_api import project_api
from asap_client.model.project_response import ProjectResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get a project.
        api_response = api_instance.get_project(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->get_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

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
import asap_client
from asap_api import project_api
from asap_client.model.project_response import ProjectResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get list of projects.
        api_response = api_instance.get_projects()
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->get_projects: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

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
import asap_client
from asap_api import project_api
from asap_client.model.project_request import ProjectRequest
from asap_client.model.project_response import ProjectResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    id = 1 # int | id
    project_request = ProjectRequest(
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
                        ),
                    ],
                ),
            ],
            store_intermediate_data=True,
        ),
        valid=True,
    ) # ProjectRequest | projectRequest

    # example passing only required values which don't have defaults set
    try:
        # Update project .
        api_response = api_instance.update_project(id, project_request)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->update_project: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |
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
import asap_client
from asap_api import project_api
from asap_client.model.project_response import ProjectResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = asap_client.Configuration(
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
with asap_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = project_api.ProjectApi(api_client)
    data_type = "Dataset" # str | dataType
    id = 1 # int | id
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload project data.
        api_response = api_instance.upload_project_data(data_type, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->upload_project_data: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload project data.
        api_response = api_instance.upload_project_data(data_type, id, file=file)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling ProjectApi->upload_project_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| id |
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

