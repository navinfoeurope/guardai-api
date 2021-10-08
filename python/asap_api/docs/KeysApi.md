# asap_client.KeysApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_key**](KeysApi.md#create_key) | **POST** /api/v1/keys | Create API key.
[**delete_key**](KeysApi.md#delete_key) | **DELETE** /api/v1/keys/{id} | Delete a key.
[**get_key**](KeysApi.md#get_key) | **GET** /api/v1/keys/{id} | Get a key.
[**get_keys**](KeysApi.md#get_keys) | **GET** /api/v1/keys | Get all of a user&#39;s keys.


# **create_key**
> APIKeyResponse create_key()

Create API key.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import keys_api
from asap_client.model.api_key_response import APIKeyResponse
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
    api_instance = keys_api.KeysApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Create API key.
        api_response = api_instance.create_key()
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling KeysApi->create_key: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

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

# **delete_key**
> delete_key(id)

Delete a key.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import keys_api
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
    api_instance = keys_api.KeysApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete a key.
        api_instance.delete_key(id)
    except asap_client.ApiException as e:
        print("Exception when calling KeysApi->delete_key: %s\n" % e)
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

# **get_key**
> APIKeyResponse get_key(id)

Get a key.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import keys_api
from asap_client.model.api_key_response import APIKeyResponse
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
    api_instance = keys_api.KeysApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get a key.
        api_response = api_instance.get_key(id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling KeysApi->get_key: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

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

# **get_keys**
> [APIKeyResponse] get_keys()

Get all of a user's keys.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import keys_api
from asap_client.model.api_key_response import APIKeyResponse
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
    api_instance = keys_api.KeysApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get all of a user's keys.
        api_response = api_instance.get_keys()
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling KeysApi->get_keys: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[APIKeyResponse]**](APIKeyResponse.md)

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

