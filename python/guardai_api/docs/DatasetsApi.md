# guardai_api.DatasetsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy_dataset**](DatasetsApi.md#copy_dataset) | **POST** /api/v1/datasets/{id}/copy | Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.
[**delete_custom_dataset**](DatasetsApi.md#delete_custom_dataset) | **DELETE** /api/v1/datasets/{id}/{orgId} | Delete dataset.
[**download_dataset**](DatasetsApi.md#download_dataset) | **GET** /api/v1/datasets/{id}/{orgId}/data | Download dataset data.
[**get_dataset**](DatasetsApi.md#get_dataset) | **GET** /api/v1/datasets/{id}/{orgId} | Get dataset.
[**get_dataset_classes**](DatasetsApi.md#get_dataset_classes) | **GET** /api/v1/datasets/{id}/{orgId}/classes | Retrieve dataset classes (coco dataset supported).
[**get_dataset_item**](DatasetsApi.md#get_dataset_item) | **GET** /api/v1/datasets/{id}/{idx}/item | Get an item from the dataset.
[**get_dataset_target**](DatasetsApi.md#get_dataset_target) | **GET** /api/v1/datasets/{id}/{idx}/target | Get a target from the dataset.
[**get_datasets**](DatasetsApi.md#get_datasets) | **GET** /api/v1/datasets/{orgId} | Get the datasets defined for this organization.
[**update_custom_dataset**](DatasetsApi.md#update_custom_dataset) | **PUT** /api/v1/datasets/{id}/{orgId} | Update dataset.
[**upload_dataset**](DatasetsApi.md#upload_dataset) | **POST** /api/v1/datasets/{orgId} | Upload dataset.
[**upload_dataset_file**](DatasetsApi.md#upload_dataset_file) | **POST** /api/v1/datasets/{id}/file | Upload a file to the dataset and return a reference.


# **copy_dataset**
> DataSet copy_dataset(id)

Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.data_set import DataSet
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    org_id = 1 # int | Optional organization ID to copy to. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.
        api_response = api_instance.copy_dataset(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->copy_dataset: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.
        api_response = api_instance.copy_dataset(id, org_id=org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->copy_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **org_id** | **int**| Optional organization ID to copy to. | [optional]

### Return type

[**DataSet**](DataSet.md)

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

# **delete_custom_dataset**
> [DataSet] delete_custom_dataset(id, org_id)

Delete dataset.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.data_set import DataSet
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    org_id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete dataset.
        api_response = api_instance.delete_custom_dataset(id, org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->delete_custom_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **org_id** | **int**| The organization ID. |

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

# **download_dataset**
> file_type download_dataset(id, org_id)

Download dataset data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    org_id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Download dataset data.
        api_response = api_instance.download_dataset(id, org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->download_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **org_id** | **int**| The organization ID. |

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

# **get_dataset**
> DataSet get_dataset(id, org_id)

Get dataset.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.data_set import DataSet
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    org_id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Get dataset.
        api_response = api_instance.get_dataset(id, org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->get_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **org_id** | **int**| The organization ID. |

### Return type

[**DataSet**](DataSet.md)

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

# **get_dataset_classes**
> [str] get_dataset_classes(id, org_id)

Retrieve dataset classes (coco dataset supported).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    org_id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Retrieve dataset classes (coco dataset supported).
        api_response = api_instance.get_dataset_classes(id, org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->get_dataset_classes: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **org_id** | **int**| The organization ID. |

### Return type

**[str]**

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

# **get_dataset_item**
> file_type get_dataset_item(id, idx)

Get an item from the dataset.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    idx = 1 # int | The item index.

    # example passing only required values which don't have defaults set
    try:
        # Get an item from the dataset.
        api_response = api_instance.get_dataset_item(id, idx)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->get_dataset_item: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **idx** | **int**| The item index. |

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

# **get_dataset_target**
> DatasetTarget get_dataset_target(id, idx)

Get a target from the dataset.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.dataset_target import DatasetTarget
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    idx = 1 # int | The item index.

    # example passing only required values which don't have defaults set
    try:
        # Get a target from the dataset.
        api_response = api_instance.get_dataset_target(id, idx)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->get_dataset_target: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **idx** | **int**| The item index. |

### Return type

[**DatasetTarget**](DatasetTarget.md)

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
> [DataSet] get_datasets(org_id)

Get the datasets defined for this organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.data_set import DataSet
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
    api_instance = datasets_api.DatasetsApi(api_client)
    org_id = 1 # int | The organization ID.

    # example passing only required values which don't have defaults set
    try:
        # Get the datasets defined for this organization.
        api_response = api_instance.get_datasets(org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->get_datasets: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_id** | **int**| The organization ID. |

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

# **update_custom_dataset**
> [DataSet] update_custom_dataset(id, org_id, dataset_request)

Update dataset.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.data_set import DataSet
from guardai_api.model.dataset_request import DatasetRequest
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    org_id = 1 # int | The organization ID.
    dataset_request = DatasetRequest(
        description="description_example",
        format="format_example",
        name="name_example",
        settings=DatasetSettings(
            params={},
        ),
        transforms=[
            Transform(
                id=1,
                name="name_example",
                params={},
            ),
        ],
    ) # DatasetRequest | The dataset update request.

    # example passing only required values which don't have defaults set
    try:
        # Update dataset.
        api_response = api_instance.update_custom_dataset(id, org_id, dataset_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->update_custom_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **org_id** | **int**| The organization ID. |
 **dataset_request** | [**DatasetRequest**](DatasetRequest.md)| The dataset update request. |

### Return type

[**[DataSet]**](DataSet.md)

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
> [DataSet] upload_dataset(description, format, name, org_id)

Upload dataset.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
from guardai_api.model.data_set import DataSet
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
    api_instance = datasets_api.DatasetsApi(api_client)
    description = "description_example" # str | description
    format = "format_example" # str | format
    name = "name_example" # str | name
    org_id = 1 # int | The organization ID.
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload dataset.
        api_response = api_instance.upload_dataset(description, format, name, org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->upload_dataset: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload dataset.
        api_response = api_instance.upload_dataset(description, format, name, org_id, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->upload_dataset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **str**| description |
 **format** | **str**| format |
 **name** | **str**| name |
 **org_id** | **int**| The organization ID. |
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

# **upload_dataset_file**
> str upload_dataset_file(id, type)

Upload a file to the dataset and return a reference.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import datasets_api
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
    api_instance = datasets_api.DatasetsApi(api_client)
    id = 1 # int | The dataset ID.
    type = "type_example" # str | Upload type - i.e. 'transform' for transform parameters
    org_id = 1 # int | The organization ID. (optional)
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload a file to the dataset and return a reference.
        api_response = api_instance.upload_dataset_file(id, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->upload_dataset_file: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload a file to the dataset and return a reference.
        api_response = api_instance.upload_dataset_file(id, type, org_id=org_id, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DatasetsApi->upload_dataset_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The dataset ID. |
 **type** | **str**| Upload type - i.e. &#39;transform&#39; for transform parameters |
 **org_id** | **int**| The organization ID. | [optional]
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

