# asap_client.TestApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_attack**](TestApi.md#add_attack) | **POST** /api/v1/tests/{testId}/attack | Add attack.
[**add_defense**](TestApi.md#add_defense) | **POST** /api/v1/tests/{testId}/defense | Add defense.
[**add_noise**](TestApi.md#add_noise) | **POST** /api/v1/tests/{id}/noise | Add noise.
[**add_test**](TestApi.md#add_test) | **POST** /api/v1/tests | Add new test.
[**delete_test**](TestApi.md#delete_test) | **DELETE** /api/v1/tests/{id} | Delete a test.
[**get_defenses**](TestApi.md#get_defenses) | **GET** /api/v1/tests/{testId}/defenses | Get defenses.
[**get_status**](TestApi.md#get_status) | **GET** /api/v1/tests/{testId}/status | Get test status.
[**get_tests**](TestApi.md#get_tests) | **GET** /api/v1/tests | Get tests.
[**remove_defense**](TestApi.md#remove_defense) | **DELETE** /api/v1/tests/{testId}/defense/{id} | Remove defense.
[**remove_filter**](TestApi.md#remove_filter) | **DELETE** /api/v1/tests/{testId}/filter/{id} | Remove filter.
[**start_test**](TestApi.md#start_test) | **GET** /api/v1/tests/{testId}/start | Start a test.
[**stop_test**](TestApi.md#stop_test) | **GET** /api/v1/tests/{id}/stop | Stop a test.
[**update_status**](TestApi.md#update_status) | **PUT** /api/v1/tests/{testId}/status | Update test status.
[**update_test**](TestApi.md#update_test) | **PUT** /api/v1/tests/{id} | Update test.
[**upload_data**](TestApi.md#upload_data) | **POST** /api/v1/tests/{id}/data | Upload data.


# **add_attack**
> TestResponse add_attack(test_id, attack_request)

Add attack.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
from asap_client.model.filter_request import FilterRequest
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId
    attack_request = FilterRequest(
        enabled=True,
        name="name_example",
        parameters="parameters_example",
    ) # FilterRequest | attackRequest

    # example passing only required values which don't have defaults set
    try:
        # Add attack.
        api_response = api_instance.add_attack(test_id, attack_request)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->add_attack: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| testId |
 **attack_request** | [**FilterRequest**](FilterRequest.md)| attackRequest |

### Return type

[**TestResponse**](TestResponse.md)

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

# **add_defense**
> TestResponse add_defense(test_id, defense_request)

Add defense.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.defense_request import DefenseRequest
from asap_client.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | The test id.
    defense_request = DefenseRequest(
        name="name_example",
        parameters="parameters_example",
    ) # DefenseRequest | defenseRequest

    # example passing only required values which don't have defaults set
    try:
        # Add defense.
        api_response = api_instance.add_defense(test_id, defense_request)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->add_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| The test id. |
 **defense_request** | [**DefenseRequest**](DefenseRequest.md)| defenseRequest |

### Return type

[**TestResponse**](TestResponse.md)

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

# **add_noise**
> TestResponse add_noise(id, filter_request)

Add noise.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
from asap_client.model.filter_request import FilterRequest
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | id
    filter_request = FilterRequest(
        enabled=True,
        name="name_example",
        parameters="parameters_example",
    ) # FilterRequest | filterRequest

    # example passing only required values which don't have defaults set
    try:
        # Add noise.
        api_response = api_instance.add_noise(id, filter_request)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->add_noise: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |
 **filter_request** | [**FilterRequest**](FilterRequest.md)| filterRequest |

### Return type

[**TestResponse**](TestResponse.md)

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

# **add_test**
> TestResponse add_test(test)

Add new test.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
from asap_client.model.test_request import TestRequest
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
    api_instance = test_api.TestApi(api_client)
    test = TestRequest(
        dataset_id=1,
        defense=DefenseResponse(
            defense_parameters="defense_parameters_example",
            filters=[
                FilterResponse(
                    enabled=True,
                    id=1,
                    name="name_example",
                    parameters="parameters_example",
                    type="type_example",
                ),
            ],
            id=1,
            name="name_example",
            test_id=1,
        ),
        name="name_example",
        pipeline_id=1,
        project_id=1,
        test_settings=TestSettings(
            dataset_setting=DatasetSetting(
                end_idx=1,
                indexes=[
                    1,
                ],
                start_idx=1,
                use_range=True,
            ),
        ),
    ) # TestRequest | test

    # example passing only required values which don't have defaults set
    try:
        # Add new test.
        api_response = api_instance.add_test(test)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->add_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test** | [**TestRequest**](TestRequest.md)| test |

### Return type

[**TestResponse**](TestResponse.md)

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

# **delete_test**
> delete_test(id)

Delete a test.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete a test.
        api_instance.delete_test(id)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->delete_test: %s\n" % e)
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

# **get_defenses**
> [DefenseResponse] get_defenses(test_id)

Get defenses.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.defense_response import DefenseResponse
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId

    # example passing only required values which don't have defaults set
    try:
        # Get defenses.
        api_response = api_instance.get_defenses(test_id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->get_defenses: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| testId |

### Return type

[**[DefenseResponse]**](DefenseResponse.md)

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

# **get_status**
> TestResponse get_status(test_id)

Get test status.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId

    # example passing only required values which don't have defaults set
    try:
        # Get test status.
        api_response = api_instance.get_status(test_id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->get_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| testId |

### Return type

[**TestResponse**](TestResponse.md)

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

# **get_tests**
> [TestResponse] get_tests(project_id)

Get tests.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    project_id = 1 # int | projectId

    # example passing only required values which don't have defaults set
    try:
        # Get tests.
        api_response = api_instance.get_tests(project_id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->get_tests: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| projectId |

### Return type

[**[TestResponse]**](TestResponse.md)

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

# **remove_defense**
> TestResponse remove_defense(id, test_id)

Remove defense.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The defense id.
    test_id = 1 # int | The test id.

    # example passing only required values which don't have defaults set
    try:
        # Remove defense.
        api_response = api_instance.remove_defense(id, test_id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->remove_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The defense id. |
 **test_id** | **int**| The test id. |

### Return type

[**TestResponse**](TestResponse.md)

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

# **remove_filter**
> TestResponse remove_filter(id, test_id)

Remove filter.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The filter id.
    test_id = 1 # int | The test id.

    # example passing only required values which don't have defaults set
    try:
        # Remove filter.
        api_response = api_instance.remove_filter(id, test_id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->remove_filter: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The filter id. |
 **test_id** | **int**| The test id. |

### Return type

[**TestResponse**](TestResponse.md)

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

# **start_test**
> start_test(test_id)

Start a test.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId

    # example passing only required values which don't have defaults set
    try:
        # Start a test.
        api_instance.start_test(test_id)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->start_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| testId |

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

# **stop_test**
> stop_test(id)

Stop a test.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Stop a test.
        api_instance.stop_test(id)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->stop_test: %s\n" % e)
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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_status**
> bool update_status(test_id, status)

Update test status.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.status_request import StatusRequest
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId
    status = StatusRequest(
        max=1,
        message="message_example",
        progress=1,
        status="CANCELLED",
    ) # StatusRequest | status

    # example passing only required values which don't have defaults set
    try:
        # Update test status.
        api_response = api_instance.update_status(test_id, status)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->update_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| testId |
 **status** | [**StatusRequest**](StatusRequest.md)| status |

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

# **update_test**
> TestResponse update_test(id, test_request)

Update test.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
from asap_client.model.test_request import TestRequest
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The test ID.
    test_request = TestRequest(
        dataset_id=1,
        defense=DefenseResponse(
            defense_parameters="defense_parameters_example",
            filters=[
                FilterResponse(
                    enabled=True,
                    id=1,
                    name="name_example",
                    parameters="parameters_example",
                    type="type_example",
                ),
            ],
            id=1,
            name="name_example",
            test_id=1,
        ),
        name="name_example",
        pipeline_id=1,
        project_id=1,
        test_settings=TestSettings(
            dataset_setting=DatasetSetting(
                end_idx=1,
                indexes=[
                    1,
                ],
                start_idx=1,
                use_range=True,
            ),
        ),
    ) # TestRequest | testRequest

    # example passing only required values which don't have defaults set
    try:
        # Update test.
        api_response = api_instance.update_test(id, test_request)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->update_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The test ID. |
 **test_request** | [**TestRequest**](TestRequest.md)| testRequest |

### Return type

[**TestResponse**](TestResponse.md)

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

# **upload_data**
> TestResponse upload_data(data_type, id)

Upload data.

### Example

* Api Key Authentication (JWT):
```python
import time
import asap_client
from asap_api import test_api
from asap_client.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    data_type = "Dataset" # str | dataType
    id = 1 # int | id
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload data.
        api_response = api_instance.upload_data(data_type, id)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->upload_data: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload data.
        api_response = api_instance.upload_data(data_type, id, file=file)
        pprint(api_response)
    except asap_client.ApiException as e:
        print("Exception when calling TestApi->upload_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **id** | **int**| id |
 **file** | **file_type**|  | [optional]

### Return type

[**TestResponse**](TestResponse.md)

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

