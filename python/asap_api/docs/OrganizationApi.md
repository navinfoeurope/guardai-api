# asap_client.OrganizationApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_organization**](OrganizationApi.md#add_organization) | **POST** /api/v1/organizations | Add organization.
[**delete_custom_dataset**](OrganizationApi.md#delete_custom_dataset) | **DELETE** /api/v1/organizations/{id}/datasets/{datasetId} | Delete dataset.
[**delete_organization**](OrganizationApi.md#delete_organization) | **DELETE** /api/v1/organizations/{id} | Delete an organization.
[**download_dataset**](OrganizationApi.md#download_dataset) | **GET** /api/v1/organizations/{id}/datasets/{datasetId} | Download dataset data.
[**get_datasets**](OrganizationApi.md#get_datasets) | **GET** /api/v1/organizations/{id}/datasets | Get the datasets defined for this organization.
[**get_defined_attacks**](OrganizationApi.md#get_defined_attacks) | **GET** /api/v1/organizations/{id}/attacks | Get the attacks defined for this organization.
[**get_defined_defenses**](OrganizationApi.md#get_defined_defenses) | **GET** /api/v1/organizations/{id}/defenses | Get the defenses defined for this organization.
[**get_defined_metrics**](OrganizationApi.md#get_defined_metrics) | **GET** /api/v1/organizations/{id}/metrics | Get the metrics defined for this organization.
[**get_defined_noises**](OrganizationApi.md#get_defined_noises) | **GET** /api/v1/organizations/{id}/noises | Get the noises defined for this organization.
[**get_organization**](OrganizationApi.md#get_organization) | **GET** /api/v1/organizations/{id} | Get organization by id.
[**get_organizations**](OrganizationApi.md#get_organizations) | **GET** /api/v1/organizations | Get organizations.
[**update_custom_dataset**](OrganizationApi.md#update_custom_dataset) | **PUT** /api/v1/organizations/{id}/datasets/{datasetId} | Update dataset.
[**update_organization**](OrganizationApi.md#update_organization) | **PUT** /api/v1/organizations/{id} | Update organization.
[**upload_dataset**](OrganizationApi.md#upload_dataset) | **POST** /api/v1/organizations/{id}/datasets | Upload dataset.


# **add_organization**
> OrganizationResponse add_organization(organization)

Add organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.organization_request import OrganizationRequest
from asap_client.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    organization = OrganizationRequest(
        name="name_example",
        settings=OrganizationSettings(
            disabled_features=[
                "ADV_CRAFTING",
            ],
        ),
    ) # OrganizationRequest | organization

    # example passing only required values which don't have defaults set
    try:
        # Add organization.
        api_response = api_instance.add_organization(organization)
        pprint(api_response)
    except asap_client.ApiException as e:
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

# **delete_custom_dataset**
> [DataSet] delete_custom_dataset(dataset_id, id)

Delete dataset.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.data_set import DataSet
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
    api_instance = organization_api.OrganizationApi(api_client)
    dataset_id = 1 # int | The dataset ID.
    id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete dataset.
        api_response = api_instance.delete_custom_dataset(dataset_id, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->delete_custom_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**| The dataset ID. |
 **id** | **int**| The organization ID. |

### Return type

[**[DataSet]**](DataSet.md)

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

# **delete_organization**
> delete_organization(id)

Delete an organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete an organization.
        api_instance.delete_organization(id)
    except asap_client.ApiException as e:
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

# **download_dataset**
> file_type download_dataset(dataset_id, id)

Download dataset data.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    dataset_id = 1 # int | datasetId
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Download dataset data.
        api_response = api_instance.download_dataset(dataset_id, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->download_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**| datasetId |
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

# **get_datasets**
> [DataSet] get_datasets(id)

Get the datasets defined for this organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.data_set import DataSet
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the datasets defined for this organization.
        api_response = api_instance.get_datasets(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->get_datasets: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**[DataSet]**](DataSet.md)

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

# **get_defined_attacks**
> str get_defined_attacks(id)

Get the attacks defined for this organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the attacks defined for this organization.
        api_response = api_instance.get_defined_attacks(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->get_defined_attacks: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

**str**

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

# **get_defined_defenses**
> str get_defined_defenses(id)

Get the defenses defined for this organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the defenses defined for this organization.
        api_response = api_instance.get_defined_defenses(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->get_defined_defenses: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

**str**

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

# **get_defined_metrics**
> str get_defined_metrics(id)

Get the metrics defined for this organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the metrics defined for this organization.
        api_response = api_instance.get_defined_metrics(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->get_defined_metrics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

**str**

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

# **get_defined_noises**
> str get_defined_noises(id)

Get the noises defined for this organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get the noises defined for this organization.
        api_response = api_instance.get_defined_noises(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->get_defined_noises: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

**str**

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
import asap_client
from asap_api import organization_api
from asap_client.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get organization by id.
        api_response = api_instance.get_organization(id)
        pprint(api_response)
    except asap_client.ApiException as e:
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

# **get_organizations**
> [OrganizationResponse] get_organizations()

Get organizations.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get organizations.
        api_response = api_instance.get_organizations()
        pprint(api_response)
    except asap_client.ApiException as e:
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

# **update_custom_dataset**
> [DataSet] update_custom_dataset(dataset_id, id)

Update dataset.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.data_set import DataSet
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
    api_instance = organization_api.OrganizationApi(api_client)
    dataset_id = 1 # int | The dataset ID.
    id = 1 # int | The organization ID.
    description = "description_example" # str |  (optional)
    format = "Coco" # str |  (optional)
    name = "name_example" # str |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update dataset.
        api_response = api_instance.update_custom_dataset(dataset_id, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->update_custom_dataset: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update dataset.
        api_response = api_instance.update_custom_dataset(dataset_id, id, description=description, format=format, name=name)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->update_custom_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**| The dataset ID. |
 **id** | **int**| The organization ID. |
 **description** | **str**|  | [optional]
 **format** | **str**|  | [optional]
 **name** | **str**|  | [optional]

### Return type

[**[DataSet]**](DataSet.md)

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

# **update_organization**
> OrganizationResponse update_organization(id, request)

Update organization.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.organization_request import OrganizationRequest
from asap_client.model.organization_response import OrganizationResponse
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
    api_instance = organization_api.OrganizationApi(api_client)
    id = 1 # int | id
    request = OrganizationRequest(
        name="name_example",
        settings=OrganizationSettings(
            disabled_features=[
                "ADV_CRAFTING",
            ],
        ),
    ) # OrganizationRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Update organization.
        api_response = api_instance.update_organization(id, request)
        pprint(api_response)
    except asap_client.ApiException as e:
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

# **upload_dataset**
> [DataSet] upload_dataset(description, format, id, name)

Upload dataset.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import organization_api
from asap_client.model.data_set import DataSet
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
    api_instance = organization_api.OrganizationApi(api_client)
    description = "description_example" # str | description
    format = "Coco" # str | format
    id = 1 # int | The organization ID.
    name = "name_example" # str | name
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload dataset.
        api_response = api_instance.upload_dataset(description, format, id, name)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->upload_dataset: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload dataset.
        api_response = api_instance.upload_dataset(description, format, id, name, file=file)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling OrganizationApi->upload_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **str**| description |
 **format** | **str**| format |
 **id** | **int**| The organization ID. |
 **name** | **str**| name |
 **file** | **file_type**|  | [optional]

### Return type

[**[DataSet]**](DataSet.md)

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

