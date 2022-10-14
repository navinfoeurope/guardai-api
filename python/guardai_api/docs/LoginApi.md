# guardai_api.LoginApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_auth_user**](LoginApi.md#get_auth_user) | **GET** /api/v1/login/token | Get the currently OAuth2 authenticated user platform token.
[**get_o_auth_clients**](LoginApi.md#get_o_auth_clients) | **GET** /api/v1/login/sso | Get the list of supported OAuth clients.
[**login**](LoginApi.md#login) | **POST** /api/v1/login | Retrieve an access token using API keys.


# **get_auth_user**
> AuthorizedUserResponse get_auth_user()

Get the currently OAuth2 authenticated user platform token.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import login_api
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
    api_instance = login_api.LoginApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the currently OAuth2 authenticated user platform token.
        api_response = api_instance.get_auth_user()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling LoginApi->get_auth_user: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthorizedUserResponse**](AuthorizedUserResponse.md)

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

# **get_o_auth_clients**
> [str] get_o_auth_clients()

Get the list of supported OAuth clients.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import login_api
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
    api_instance = login_api.LoginApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the list of supported OAuth clients.
        api_response = api_instance.get_o_auth_clients()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling LoginApi->get_o_auth_clients: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

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

# **login**
> AuthorizedUserResponse login(request)

Retrieve an access token using API keys.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import login_api
from guardai_api.model.authorized_user_response import AuthorizedUserResponse
from guardai_api.model.login_request import LoginRequest
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
    api_instance = login_api.LoginApi(api_client)
    request = LoginRequest(
        api_key="api_key_example",
        api_key_id="api_key_id_example",
    ) # LoginRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Retrieve an access token using API keys.
        api_response = api_instance.login(request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling LoginApi->login: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LoginRequest**](LoginRequest.md)| request |

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

