# guardai_api.TestApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_defense**](TestApi.md#add_defense) | **POST** /api/v1/tests/{testId}/defense | Add defense.
[**add_filter**](TestApi.md#add_filter) | **POST** /api/v1/tests/{id}/filter | Add a filter.
[**add_test**](TestApi.md#add_test) | **POST** /api/v1/tests | Add a new test.
[**delete_test**](TestApi.md#delete_test) | **DELETE** /api/v1/tests/{id} | Delete a test.
[**get_defenses**](TestApi.md#get_defenses) | **GET** /api/v1/tests/{testId}/defenses | Get defenses.
[**get_status**](TestApi.md#get_status) | **GET** /api/v1/tests/{testId}/status | Get test status.
[**get_tests**](TestApi.md#get_tests) | **GET** /api/v1/tests | Get tests for a project.
[**remove_defense**](TestApi.md#remove_defense) | **DELETE** /api/v1/tests/{testId}/defense/{id} | Remove defense.
[**remove_filter**](TestApi.md#remove_filter) | **DELETE** /api/v1/tests/{testId}/filter/{id} | Remove a filter.
[**start_test**](TestApi.md#start_test) | **GET** /api/v1/tests/{testId}/start | Start a test.
[**stop_test**](TestApi.md#stop_test) | **GET** /api/v1/tests/{id}/stop | Stop all the running jobs in a test.
[**update_status**](TestApi.md#update_status) | **PUT** /api/v1/tests/{testId}/status | Update test status - can only be called by worker instance.
[**update_test**](TestApi.md#update_test) | **PUT** /api/v1/tests/{id} | Update test.
[**update_test_run**](TestApi.md#update_test_run) | **PUT** /api/v1/tests/testrun/{id} | Update test run.


# **add_defense**
> TestResponse add_defense(test_id, defense_request)

Add defense.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | The test id.
    defense_request = DefenseRequest(
        name="name_example",
        parameters="parameters_example",
    ) # DefenseRequest | The defense object

    # example passing only required values which don't have defaults set
    try:
        # Add defense.
        api_response = api_instance.add_defense(test_id, defense_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestApi->add_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| The test id. |
 **defense_request** | [**DefenseRequest**](DefenseRequest.md)| The defense object |

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

# **add_filter**
> TestResponse add_filter(id, attack_request)

Add a filter.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.filter_request import FilterRequest
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The test id.
    attack_request = FilterRequest(
        enabled=True,
        name="name_example",
        parameters="parameters_example",
        type="adversarial_attacks",
    ) # FilterRequest | attackRequest

    # example passing only required values which don't have defaults set
    try:
        # Add a filter.
        api_response = api_instance.add_filter(id, attack_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestApi->add_filter: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The test id. |
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

# **add_test**
> TestResponse add_test(test)

Add a new test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.test_request import TestRequest
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    test = TestRequest(
        defense=DefenseResponse(
            defense_parameters="defense_parameters_example",
            filters=[
                AIFilter(
                    codebase_name="codebase_name_example",
                    enabled=True,
                    group=[
                        "group_example",
                    ],
                    id=1,
                    name="name_example",
                    paper_link="paper_link_example",
                    parameters="parameters_example",
                    tasks=[
                        "tasks_example",
                    ],
                    type="type_example",
                ),
            ],
            id=1,
            name="name_example",
            test_id=1,
        ),
        description="description_example",
        name="name_example",
        pipeline_id=1,
        profile_id=1,
        project_id=1,
        test_settings=TestSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            configured=True,
            crafted_settings=CraftedTestSettings(
                from_class="from_class_example",
                item_idx=1,
                params={},
                regions=[
                    Rectangle(
                        x1=1,
                        x2=1,
                        y1=1,
                        y2=1,
                    ),
                ],
                to_class="to_class_example",
            ),
            dataset_setting=DatasetSetting(
                batch_size=1,
                end_idx=1,
                fraction=3.14,
                indexes=[
                    1,
                ],
                num_items=1,
                selection_type="COUNT",
                shuffle=True,
                start_idx=1,
                workers=1,
            ),
            detection_test_settings=DetectionTestSettings(
                id=1,
                params={},
                pass_deviations=3.14,
                poisoned_dataset_setting=DatasetSetting(
                    batch_size=1,
                    end_idx=1,
                    fraction=3.14,
                    indexes=[
                        1,
                    ],
                    num_items=1,
                    selection_type="COUNT",
                    shuffle=True,
                    start_idx=1,
                    workers=1,
                ),
            ),
            eps_exploration=True,
            eps_exploration_params={},
            hpo_id=1,
            hpo_params={},
            metrics={
                "key": [
                    Metric(
                        enabled=True,
                        name="name_example",
                        params={},
                        uid="uid_example",
                    ),
                ],
            },
            optimal_parameterization=True,
            overlay_image_on_seg_map=True,
            pass_fail_criteria=[
                PassFailCriteria(
                    above=True,
                    enabled=True,
                    metric_name="metric_name_example",
                    pass_val=3.14,
                ),
            ],
            pass_percentage=3.14,
            store_composite_images=True,
            store_intermediate_data=True,
            test_type="Crafted",
        ),
    ) # TestRequest | test

    # example passing only required values which don't have defaults set
    try:
        # Add a new test.
        api_response = api_instance.add_test(test)
        pprint(api_response)
    except guardai_api.ApiException as e:
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
import guardai_api
from api import test_api
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete a test.
        api_instance.delete_test(id)
    except guardai_api.ApiException as e:
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
import guardai_api
from api import test_api
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId

    # example passing only required values which don't have defaults set
    try:
        # Get defenses.
        api_response = api_instance.get_defenses(test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
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
import guardai_api
from api import test_api
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | testId

    # example passing only required values which don't have defaults set
    try:
        # Get test status.
        api_response = api_instance.get_status(test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
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

Get tests for a project.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    project_id = 1 # int | The project id.

    # example passing only required values which don't have defaults set
    try:
        # Get tests for a project.
        api_response = api_instance.get_tests(project_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestApi->get_tests: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| The project id. |

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
import guardai_api
from api import test_api
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The defense id.
    test_id = 1 # int | The test id.

    # example passing only required values which don't have defaults set
    try:
        # Remove defense.
        api_response = api_instance.remove_defense(id, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
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

Remove a filter.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The filter id.
    test_id = 1 # int | The test id.

    # example passing only required values which don't have defaults set
    try:
        # Remove a filter.
        api_response = api_instance.remove_filter(id, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
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
import guardai_api
from api import test_api
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
    api_instance = test_api.TestApi(api_client)
    test_id = 1 # int | The test id.

    # example passing only required values which don't have defaults set
    try:
        # Start a test.
        api_instance.start_test(test_id)
    except guardai_api.ApiException as e:
        print("Exception when calling TestApi->start_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| The test id. |

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

Stop all the running jobs in a test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Stop all the running jobs in a test.
        api_instance.stop_test(id)
    except guardai_api.ApiException as e:
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
> bool update_status(run_id, task_id, test_id, status)

Update test status - can only be called by worker instance.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.status_request import StatusRequest
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
    api_instance = test_api.TestApi(api_client)
    run_id = 1 # int | runId
    task_id = 1 # int | taskId
    test_id = 1 # int | testId
    status = StatusRequest(
        elapsed=1,
        eta=1,
        max=1,
        message="message_example",
        progress=1,
        status="CANCELLED",
        worker_id="worker_id_example",
    ) # StatusRequest | status

    # example passing only required values which don't have defaults set
    try:
        # Update test status - can only be called by worker instance.
        api_response = api_instance.update_status(run_id, task_id, test_id, status)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestApi->update_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_id** | **int**| runId |
 **task_id** | **int**| taskId |
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
import guardai_api
from api import test_api
from guardai_api.model.test_request import TestRequest
from guardai_api.model.test_response import TestResponse
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The test ID.
    test_request = TestRequest(
        defense=DefenseResponse(
            defense_parameters="defense_parameters_example",
            filters=[
                AIFilter(
                    codebase_name="codebase_name_example",
                    enabled=True,
                    group=[
                        "group_example",
                    ],
                    id=1,
                    name="name_example",
                    paper_link="paper_link_example",
                    parameters="parameters_example",
                    tasks=[
                        "tasks_example",
                    ],
                    type="type_example",
                ),
            ],
            id=1,
            name="name_example",
            test_id=1,
        ),
        description="description_example",
        name="name_example",
        pipeline_id=1,
        profile_id=1,
        project_id=1,
        test_settings=TestSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            configured=True,
            crafted_settings=CraftedTestSettings(
                from_class="from_class_example",
                item_idx=1,
                params={},
                regions=[
                    Rectangle(
                        x1=1,
                        x2=1,
                        y1=1,
                        y2=1,
                    ),
                ],
                to_class="to_class_example",
            ),
            dataset_setting=DatasetSetting(
                batch_size=1,
                end_idx=1,
                fraction=3.14,
                indexes=[
                    1,
                ],
                num_items=1,
                selection_type="COUNT",
                shuffle=True,
                start_idx=1,
                workers=1,
            ),
            detection_test_settings=DetectionTestSettings(
                id=1,
                params={},
                pass_deviations=3.14,
                poisoned_dataset_setting=DatasetSetting(
                    batch_size=1,
                    end_idx=1,
                    fraction=3.14,
                    indexes=[
                        1,
                    ],
                    num_items=1,
                    selection_type="COUNT",
                    shuffle=True,
                    start_idx=1,
                    workers=1,
                ),
            ),
            eps_exploration=True,
            eps_exploration_params={},
            hpo_id=1,
            hpo_params={},
            metrics={
                "key": [
                    Metric(
                        enabled=True,
                        name="name_example",
                        params={},
                        uid="uid_example",
                    ),
                ],
            },
            optimal_parameterization=True,
            overlay_image_on_seg_map=True,
            pass_fail_criteria=[
                PassFailCriteria(
                    above=True,
                    enabled=True,
                    metric_name="metric_name_example",
                    pass_val=3.14,
                ),
            ],
            pass_percentage=3.14,
            store_composite_images=True,
            store_intermediate_data=True,
            test_type="Crafted",
        ),
    ) # TestRequest | testRequest

    # example passing only required values which don't have defaults set
    try:
        # Update test.
        api_response = api_instance.update_test(id, test_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
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

# **update_test_run**
> TestRunResponse update_test_run(id, request)

Update test run.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_api
from guardai_api.model.test_run_response import TestRunResponse
from guardai_api.model.test_run_request import TestRunRequest
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
    api_instance = test_api.TestApi(api_client)
    id = 1 # int | The test run ID.
    request = TestRunRequest(
        name="name_example",
    ) # TestRunRequest | request

    # example passing only required values which don't have defaults set
    try:
        # Update test run.
        api_response = api_instance.update_test_run(id, request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestApi->update_test_run: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The test run ID. |
 **request** | [**TestRunRequest**](TestRunRequest.md)| request |

### Return type

[**TestRunResponse**](TestRunResponse.md)

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

