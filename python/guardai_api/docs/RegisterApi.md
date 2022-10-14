# guardai_api.RegisterApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register**](RegisterApi.md#register) | **POST** /api/v1/register | Register user
[**send_invite**](RegisterApi.md#send_invite) | **POST** /api/v1/register/invite | Send user invite - admin permissions required.


# **register**
> AuthorizedUserResponse register(request)

Register user

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import register_api
from guardai_api.model.register_request import RegisterRequest
from guardai_api.model.authorized_user_response import AuthorizedUserResponse
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
    api_instance = register_api.RegisterApi(api_client)
    request = RegisterRequest(
        token="token_example",
    ) # RegisterRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Register user
        api_response = api_instance.register(request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling RegisterApi->register: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RegisterRequest**](RegisterRequest.md)| request |

### Return type

[**AuthorizedUserResponse**](AuthorizedUserResponse.md)

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

# **send_invite**
> send_invite(request)

Send user invite - admin permissions required.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import register_api
from guardai_api.model.invite_request import InviteRequest
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
    api_instance = register_api.RegisterApi(api_client)
    request = InviteRequest(
        email="email_example",
        name="name_example",
    ) # InviteRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Send user invite - admin permissions required.
        api_instance.send_invite(request)
    except guardai_api.ApiException as e:
        print("Exception when calling RegisterApi->send_invite: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InviteRequest**](InviteRequest.md)| request |

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

