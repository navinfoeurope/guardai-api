# guardai_api.DefensesApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_defense**](DefensesApi.md#get_defense) | **GET** /api/v1/defenses/{id} | Get a defense.
[**update_defense**](DefensesApi.md#update_defense) | **PUT** /api/v1/defenses/{id} | Update defense.


# **get_defense**
> DefenseResponse get_defense(id)

Get a defense.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import defenses_api
from guardai_api.model.defense_response import DefenseResponse
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
    api_instance = defenses_api.DefensesApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get a defense.
        api_response = api_instance.get_defense(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DefensesApi->get_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

### Return type

[**DefenseResponse**](DefenseResponse.md)

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

# **update_defense**
> DefenseResponse update_defense(id, request)

Update defense.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import defenses_api
from guardai_api.model.defense_response import DefenseResponse
from guardai_api.model.defense_request import DefenseRequest
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
    api_instance = defenses_api.DefensesApi(api_client)
    id = 1 # int | id
    request = DefenseRequest(
        name="name_example",
        parameters="parameters_example",
    ) # DefenseRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Update defense.
        api_response = api_instance.update_defense(id, request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling DefensesApi->update_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |
 **request** | [**DefenseRequest**](DefenseRequest.md)| request |

### Return type

[**DefenseResponse**](DefenseResponse.md)

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

