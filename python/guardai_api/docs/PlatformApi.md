# guardai_api.PlatformApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_worker**](PlatformApi.md#cancel_worker) | **GET** /api/v1/platform/cancel | Administrative call to cancel a worker job (admin rights required)
[**delete_platform_file**](PlatformApi.md#delete_platform_file) | **DELETE** /api/v1/platform/file | Delete platform file (only admins).
[**download_platform_file**](PlatformApi.md#download_platform_file) | **GET** /api/v1/platform/file | Download platform file.
[**get_environments**](PlatformApi.md#get_environments) | **GET** /api/v1/platform/environments | Get the list of environments.
[**get_queue_info**](PlatformApi.md#get_queue_info) | **GET** /api/v1/platform/workerqueue | Get worker queue information.
[**stat_platform_file**](PlatformApi.md#stat_platform_file) | **GET** /api/v1/platform/file/stat | Stat platform file (only admins).
[**upload_file_part**](PlatformApi.md#upload_file_part) | **POST** /api/v1/platform/filepart | Upload a file part to the platform.
[**upload_platform_file**](PlatformApi.md#upload_platform_file) | **POST** /api/v1/platform/file | Upload a file to the platform and return a reference (only admins).
[**worker_heartbeat**](PlatformApi.md#worker_heartbeat) | **PUT** /api/v1/platform/heartbeat | Worker heartbeat - can only be called by a worker instance.


# **cancel_worker**
> cancel_worker(id)

Administrative call to cancel a worker job (admin rights required)

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
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
    api_instance = platform_api.PlatformApi(api_client)
    id = "id_example" # str | id

    # example passing only required values which don't have defaults set
    try:
        # Administrative call to cancel a worker job (admin rights required)
        api_instance.cancel_worker(id)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->cancel_worker: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| id |

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

# **delete_platform_file**
> delete_platform_file(ref, type)

Delete platform file (only admins).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
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
    api_instance = platform_api.PlatformApi(api_client)
    ref = "ref_example" # str | File reference
    type = "type_example" # str | File type - i.e. 'asset'

    # example passing only required values which don't have defaults set
    try:
        # Delete platform file (only admins).
        api_instance.delete_platform_file(ref, type)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->delete_platform_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **str**| File reference |
 **type** | **str**| File type - i.e. &#39;asset&#39; |

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

# **download_platform_file**
> file_type download_platform_file(ref, type)

Download platform file.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
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
    api_instance = platform_api.PlatformApi(api_client)
    ref = "ref_example" # str | File reference
    type = "type_example" # str | Download type - i.e. 'asset'

    # example passing only required values which don't have defaults set
    try:
        # Download platform file.
        api_response = api_instance.download_platform_file(ref, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->download_platform_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **str**| File reference |
 **type** | **str**| Download type - i.e. &#39;asset&#39; |

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

# **get_environments**
> [EnvironmentResponse] get_environments()

Get the list of environments.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
from guardai_api.model.environment_response import EnvironmentResponse
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
    api_instance = platform_api.PlatformApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the list of environments.
        api_response = api_instance.get_environments()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->get_environments: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[EnvironmentResponse]**](EnvironmentResponse.md)

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

# **get_queue_info**
> QueueInfoResponse get_queue_info()

Get worker queue information.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
from guardai_api.model.queue_info_response import QueueInfoResponse
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
    api_instance = platform_api.PlatformApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get worker queue information.
        api_response = api_instance.get_queue_info()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->get_queue_info: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**QueueInfoResponse**](QueueInfoResponse.md)

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

# **stat_platform_file**
> FileStatResponse stat_platform_file(ref, type)

Stat platform file (only admins).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
from guardai_api.model.file_stat_response import FileStatResponse
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
    api_instance = platform_api.PlatformApi(api_client)
    ref = "ref_example" # str | File reference
    type = "type_example" # str | File type - i.e. 'asset'

    # example passing only required values which don't have defaults set
    try:
        # Stat platform file (only admins).
        api_response = api_instance.stat_platform_file(ref, type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->stat_platform_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **str**| File reference |
 **type** | **str**| File type - i.e. &#39;asset&#39; |

### Return type

[**FileStatResponse**](FileStatResponse.md)

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

# **upload_file_part**
> str upload_file_part(ref, state)

Upload a file part to the platform.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
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
    api_instance = platform_api.PlatformApi(api_client)
    ref = "ref_example" # str | File reference
    state = 1 # int | File upload state: 1 - part, 2 - done.
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload a file part to the platform.
        api_response = api_instance.upload_file_part(ref, state)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->upload_file_part: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload a file part to the platform.
        api_response = api_instance.upload_file_part(ref, state, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->upload_file_part: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **str**| File reference |
 **state** | **int**| File upload state: 1 - part, 2 - done. |
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

# **upload_platform_file**
> str upload_platform_file(type)

Upload a file to the platform and return a reference (only admins).

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
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
    api_instance = platform_api.PlatformApi(api_client)
    type = "type_example" # str | Upload type - i.e. 'asset'
    chunked = True # bool | Chunked upload (optional)
    description = "description_example" # str | File description (optional)
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload a file to the platform and return a reference (only admins).
        api_response = api_instance.upload_platform_file(type)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->upload_platform_file: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload a file to the platform and return a reference (only admins).
        api_response = api_instance.upload_platform_file(type, chunked=chunked, description=description, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->upload_platform_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| Upload type - i.e. &#39;asset&#39; |
 **chunked** | **bool**| Chunked upload | [optional]
 **description** | **str**| File description | [optional]
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

# **worker_heartbeat**
> bool worker_heartbeat(request)

Worker heartbeat - can only be called by a worker instance.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import platform_api
from guardai_api.model.worker_heartbeat_request import WorkerHeartbeatRequest
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
    api_instance = platform_api.PlatformApi(api_client)
    request = WorkerHeartbeatRequest(
        status="CANCELLED",
        worker_id="worker_id_example",
    ) # WorkerHeartbeatRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Worker heartbeat - can only be called by a worker instance.
        api_response = api_instance.worker_heartbeat(request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling PlatformApi->worker_heartbeat: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**WorkerHeartbeatRequest**](WorkerHeartbeatRequest.md)| request |

### Return type

**bool**

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

