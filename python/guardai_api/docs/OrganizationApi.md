# guardai_api.OrganizationApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_organization**](OrganizationApi.md#add_organization) | **POST** /api/v1/organizations | Add organization.
[**copy_organization**](OrganizationApi.md#copy_organization) | **POST** /api/v1/organizations/{id}/copy | Make a copy of the organization to another organization (requires admin permissions).
[**delete_organization**](OrganizationApi.md#delete_organization) | **DELETE** /api/v1/organizations/{id} | Delete an organization.
[**delete_organization_file**](OrganizationApi.md#delete_organization_file) | **DELETE** /api/v1/organizations/{id}/file | Delete organization file.
[**download_organization_file**](OrganizationApi.md#download_organization_file) | **GET** /api/v1/organizations/{id}/file | Download organization file.
[**get_asset_definitions**](OrganizationApi.md#get_asset_definitions) | **GET** /api/v1/organizations/{id}/assets | Get the assets defined for this organization.
[**get_defined_hpo**](OrganizationApi.md#get_defined_hpo) | **GET** /api/v1/organizations/{id}/hpo | Get the hyper-parameter optimization methods defined for this organization.
[**get_defined_transforms**](OrganizationApi.md#get_defined_transforms) | **GET** /api/v1/organizations/{id}/transforms | Get the transforms defined for this organization.
[**get_members**](OrganizationApi.md#get_members) | **GET** /api/v1/organizations/{id}/members | Get all members (admin access rights required).
[**get_organization**](OrganizationApi.md#get_organization) | **GET** /api/v1/organizations/{id} | Get organization by id.
[**get_organization_file_usage**](OrganizationApi.md#get_organization_file_usage) | **GET** /api/v1/organizations/{id}/file/usage | Get organization file project usage.
[**get_organizations**](OrganizationApi.md#get_organizations) | **GET** /api/v1/organizations | Get all organizations - (requires admin permissions).
[**rename_organization_file**](OrganizationApi.md#rename_organization_file) | **PUT** /api/v1/organizations/{id}/file | Rename organization file.
[**update_org_stats**](OrganizationApi.md#update_org_stats) | **GET** /api/v1/organizations/{id}/stat | Update storage and accounting information for this organization (admin rights).
[**update_organization**](OrganizationApi.md#update_organization) | **PUT** /api/v1/organizations/{id} | Update organization.
[**upload_organization_file**](OrganizationApi.md#upload_organization_file) | **POST** /api/v1/organizations/{id}/file | Upload a file to the organization and return a reference.


# **add_organization**
> OrganizationResponse add_organization(organization)

Add organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.organization_request import OrganizationRequest
from guardai_api.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    organization = OrganizationRequest(
        name="name_example",
        settings=OrganizationSettings(
            class_mapping_files=[
                ClassMappingFileRef(
                    content_type="content_type_example",
                    dataset_id=1,
                    file_name="file_name_example",
                    ref="ref_example",
                ),
            ],
            disabled_features=[
                "ADV_CRAFTING",
            ],
            max_item_count=1,
            max_time_allocated=1,
            max_time_per_task=1,
        ),
    ) # OrganizationRequest | organization

    # example passing only required values which don't have defaults set
    try:
        # Add organization.
        api_response = api_instance.add_organization(organization)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->add_organization: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**OrganizationRequest**](OrganizationRequest.md)| organization |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

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

# **copy_organization**
> OrganizationResponse copy_organization(id, organization_request)

Make a copy of the organization to another organization (requires admin permissions).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.organization_request import OrganizationRequest
from guardai_api.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.
    organization_request = OrganizationRequest(
        name="name_example",
        settings=OrganizationSettings(
            class_mapping_files=[
                ClassMappingFileRef(
                    content_type="content_type_example",
                    dataset_id=1,
                    file_name="file_name_example",
                    ref="ref_example",
                ),
            ],
            disabled_features=[
                "ADV_CRAFTING",
            ],
            max_item_count=1,
            max_time_allocated=1,
            max_time_per_task=1,
        ),
    ) # OrganizationRequest | Optional new organization information.

    # example passing only required values which don't have defaults set
    try:
        # Make a copy of the organization to another organization (requires admin permissions).
        api_response = api_instance.copy_organization(id, organization_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->copy_organization: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **organization_request** | [**OrganizationRequest**](OrganizationRequest.md)| Optional new organization information. |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

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

# **delete_organization**
> delete_organization(id)

Delete an organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete an organization.
        api_instance.delete_organization(id)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->delete_organization: %s\n" % e)
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

# **delete_organization_file**
> delete_organization_file(id, ref, type)

Delete organization file.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.
    ref = "ref_example" # str | File reference
    type = "type_example" # str | File type - i.e. 'classmapping'

    # example passing only required values which don't have defaults set
    try:
        # Delete organization file.
        api_instance.delete_organization_file(id, ref, type)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->delete_organization_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **ref** | **str**| File reference |
 **type** | **str**| File type - i.e. &#39;classmapping&#39; |

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

# **download_organization_file**
> file_type download_organization_file(id, ref, type)

Download organization file.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.
    ref = "ref_example" # str | File reference
    type = "type_example" # str | Download type - i.e. 'classmapping'

    # example passing only required values which don't have defaults set
    try:
        # Download organization file.
        api_response = api_instance.download_organization_file(id, ref, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->download_organization_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **ref** | **str**| File reference |
 **type** | **str**| Download type - i.e. &#39;classmapping&#39; |

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

# **get_asset_definitions**
> AssetsResponse get_asset_definitions(id)

Get the assets defined for this organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.assets_response import AssetsResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Get the assets defined for this organization.
        api_response = api_instance.get_asset_definitions(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_asset_definitions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |

### Return type

[**AssetsResponse**](AssetsResponse.md)

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

# **get_defined_hpo**
> [HPODefinition] get_defined_hpo(id)

Get the hyper-parameter optimization methods defined for this organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.hpo_definition import HPODefinition
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the hyper-parameter optimization methods defined for this organization.
        api_response = api_instance.get_defined_hpo(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_defined_hpo: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**[HPODefinition]**](HPODefinition.md)

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

# **get_defined_transforms**
> [TransformDefinition] get_defined_transforms(id)

Get the transforms defined for this organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.transform_definition import TransformDefinition
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the transforms defined for this organization.
        api_response = api_instance.get_defined_transforms(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_defined_transforms: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**[TransformDefinition]**](TransformDefinition.md)

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

# **get_members**
> [UserResponse] get_members(id)

Get all members (admin access rights required).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.user_response import UserResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get all members (admin access rights required).
        api_response = api_instance.get_members(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_members: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**[UserResponse]**](UserResponse.md)

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

# **get_organization**
> OrganizationResponse get_organization(id)

Get organization by id.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get organization by id.
        api_response = api_instance.get_organization(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_organization: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

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

# **get_organization_file_usage**
> [int] get_organization_file_usage(id, ref, type)

Get organization file project usage.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.
    ref = "ref_example" # str | File reference
    type = "type_example" # str | File type - i.e. 'classmapping'

    # example passing only required values which don't have defaults set
    try:
        # Get organization file project usage.
        api_response = api_instance.get_organization_file_usage(id, ref, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_organization_file_usage: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **ref** | **str**| File reference |
 **type** | **str**| File type - i.e. &#39;classmapping&#39; |

### Return type

**[int]**

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

# **get_organizations**
> [OrganizationResponse] get_organizations()

Get all organizations - (requires admin permissions).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get all organizations - (requires admin permissions).
        api_response = api_instance.get_organizations()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->get_organizations: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[OrganizationResponse]**](OrganizationResponse.md)

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

# **rename_organization_file**
> rename_organization_file(id, name, ref, type)

Rename organization file.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.
    name = "name_example" # str | File name
    ref = "ref_example" # str | File reference
    type = "type_example" # str | File type - i.e. 'classmapping'

    # example passing only required values which don't have defaults set
    try:
        # Rename organization file.
        api_instance.rename_organization_file(id, name, ref, type)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->rename_organization_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **name** | **str**| File name |
 **ref** | **str**| File reference |
 **type** | **str**| File type - i.e. &#39;classmapping&#39; |

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
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_org_stats**
> update_org_stats(id)

Update storage and accounting information for this organization (admin rights).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Update storage and accounting information for this organization (admin rights).
        api_instance.update_org_stats(id)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->update_org_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_organization**
> OrganizationResponse update_organization(id, request)

Update organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
from guardai_api.model.organization_request import OrganizationRequest
from guardai_api.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id
    request = OrganizationRequest(
        name="name_example",
        settings=OrganizationSettings(
            class_mapping_files=[
                ClassMappingFileRef(
                    content_type="content_type_example",
                    dataset_id=1,
                    file_name="file_name_example",
                    ref="ref_example",
                ),
            ],
            disabled_features=[
                "ADV_CRAFTING",
            ],
            max_item_count=1,
            max_time_allocated=1,
            max_time_per_task=1,
        ),
    ) # OrganizationRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Update organization.
        api_response = api_instance.update_organization(id, request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->update_organization: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |
 **request** | [**OrganizationRequest**](OrganizationRequest.md)| request |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

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

# **upload_organization_file**
> str upload_organization_file(id, type)

Upload a file to the organization and return a reference.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | The organization ID.
    type = "type_example" # str | Upload type - i.e. 'classmapping'
    dataset_id = 1 # int | The dataset ID. (optional)
    ref = "ref_example" # str | Reference (supplied when updating) (optional)
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload a file to the organization and return a reference.
        api_response = api_instance.upload_organization_file(id, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->upload_organization_file: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload a file to the organization and return a reference.
        api_response = api_instance.upload_organization_file(id, type, dataset_id=dataset_id, ref=ref, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling OrganizationApi->upload_organization_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **type** | **str**| Upload type - i.e. &#39;classmapping&#39; |
 **dataset_id** | **int**| The dataset ID. | [optional]
 **ref** | **str**| Reference (supplied when updating) | [optional]
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

