# guardai_api.BenchmarkApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_benchmark**](BenchmarkApi.md#add_benchmark) | **POST** /api/v1/benchmarks | Add a benchmark to an organization.
[**add_benchmark_test**](BenchmarkApi.md#add_benchmark_test) | **POST** /api/v1/benchmarks/{id}/addtest | Add new test.
[**add_benchmark_test_defense**](BenchmarkApi.md#add_benchmark_test_defense) | **POST** /api/v1/benchmarks/{id}/{testId}/defense | Add defense to benchmark test.
[**add_benchmark_test_filter**](BenchmarkApi.md#add_benchmark_test_filter) | **POST** /api/v1/benchmarks/{id}/{testId}/filter | Add filter to benchmark test.
[**delete_benchmark**](BenchmarkApi.md#delete_benchmark) | **DELETE** /api/v1/benchmarks/{id} | Delete a benchmark.
[**delete_benchmark_test**](BenchmarkApi.md#delete_benchmark_test) | **DELETE** /api/v1/benchmarks/{id}/{testId} | Delete a benchmark test.
[**get_benchmark**](BenchmarkApi.md#get_benchmark) | **GET** /api/v1/benchmarks/{id} | Get a benchmark.
[**get_benchmark_test_status**](BenchmarkApi.md#get_benchmark_test_status) | **GET** /api/v1/benchmarks/{id}/{testId}/status | Get benchmark test status.
[**get_benchmarks**](BenchmarkApi.md#get_benchmarks) | **GET** /api/v1/benchmarks | Get list of benchmarks.
[**remove_benchmark_filter**](BenchmarkApi.md#remove_benchmark_filter) | **DELETE** /api/v1/benchmarks/{id}/{testId}/{filterId} | Remove filter from benchmark test.
[**remove_benchmark_test_defense**](BenchmarkApi.md#remove_benchmark_test_defense) | **DELETE** /api/v1/benchmarks/{id}/{testId}/defense/{defenseId} | Remove defense from benchmark test.
[**start_benchmark_test**](BenchmarkApi.md#start_benchmark_test) | **GET** /api/v1/benchmarks/{id}/{testId}/start | Start a benchmark test.
[**stop_benchmark_test**](BenchmarkApi.md#stop_benchmark_test) | **GET** /api/v1/benchmarks/{id}/{testId}/stop | Stop a benchmark test.
[**update_benchmark**](BenchmarkApi.md#update_benchmark) | **PUT** /api/v1/benchmarks/{id} | Update benchmark.
[**update_benchmark_test**](BenchmarkApi.md#update_benchmark_test) | **PUT** /api/v1/benchmarks/{id}/{testId} | Update test.


# **add_benchmark**
> BenchmarkResponse add_benchmark(organization_id, benchmark_request)

Add a benchmark to an organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_response import BenchmarkResponse
from guardai_api.model.benchmark_request import BenchmarkRequest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    organization_id = 1 # int | The organization ID.
    benchmark_request = BenchmarkRequest(
        name="name_example",
        settings=BenchmarkSettings(
            projects=[
                BenchmarkProject(
                    enabled=True,
                    id=1,
                ),
            ],
            tasks=[
                "tasks_example",
            ],
            tests=[
                BenchmarkTest(
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
                    defenses=[
                        DefenseResponse(
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
                    ],
                    id=1,
                    name="name_example",
                    status="CANCELLED",
                ),
            ],
        ),
    ) # BenchmarkRequest | benchmarkRequest

    # example passing only required values which don't have defaults set
    try:
        # Add a benchmark to an organization.
        api_response = api_instance.add_benchmark(organization_id, benchmark_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->add_benchmark: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization_id** | **int**| The organization ID. |
 **benchmark_request** | [**BenchmarkRequest**](BenchmarkRequest.md)| benchmarkRequest |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

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

# **add_benchmark_test**
> BenchmarkResponse add_benchmark_test(id, name)

Add new test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_response import BenchmarkResponse
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    name = "name_example" # str | name

    # example passing only required values which don't have defaults set
    try:
        # Add new test.
        api_response = api_instance.add_benchmark_test(id, name)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->add_benchmark_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **name** | **str**| name |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

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

# **add_benchmark_test_defense**
> BenchmarkTest add_benchmark_test_defense(id, test_id, defense)

Add defense to benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_test import BenchmarkTest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.
    defense = DefenseRequest(
        name="name_example",
        parameters="parameters_example",
    ) # DefenseRequest | The defense.

    # example passing only required values which don't have defaults set
    try:
        # Add defense to benchmark test.
        api_response = api_instance.add_benchmark_test_defense(id, test_id, defense)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->add_benchmark_test_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |
 **defense** | [**DefenseRequest**](DefenseRequest.md)| The defense. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

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

# **add_benchmark_test_filter**
> BenchmarkTest add_benchmark_test_filter(id, test_id, filter_request)

Add filter to benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.filter_request import FilterRequest
from guardai_api.model.benchmark_test import BenchmarkTest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.
    filter_request = FilterRequest(
        enabled=True,
        name="name_example",
        parameters="parameters_example",
        type="adversarial_attacks",
    ) # FilterRequest | filterRequest

    # example passing only required values which don't have defaults set
    try:
        # Add filter to benchmark test.
        api_response = api_instance.add_benchmark_test_filter(id, test_id, filter_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->add_benchmark_test_filter: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |
 **filter_request** | [**FilterRequest**](FilterRequest.md)| filterRequest |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

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

# **delete_benchmark**
> delete_benchmark(id)

Delete a benchmark.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a benchmark.
        api_instance.delete_benchmark(id)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->delete_benchmark: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |

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

# **delete_benchmark_test**
> BenchmarkResponse delete_benchmark_test(id, test_id)

Delete a benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_response import BenchmarkResponse
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a benchmark test.
        api_response = api_instance.delete_benchmark_test(id, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->delete_benchmark_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

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

# **get_benchmark**
> BenchmarkResponse get_benchmark(id)

Get a benchmark.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_response import BenchmarkResponse
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.

    # example passing only required values which don't have defaults set
    try:
        # Get a benchmark.
        api_response = api_instance.get_benchmark(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->get_benchmark: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

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

# **get_benchmark_test_status**
> BenchmarkTestStatusResponse get_benchmark_test_status(id, test_id)

Get benchmark test status.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_test_status_response import BenchmarkTestStatusResponse
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Get benchmark test status.
        api_response = api_instance.get_benchmark_test_status(id, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->get_benchmark_test_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |

### Return type

[**BenchmarkTestStatusResponse**](BenchmarkTestStatusResponse.md)

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

# **get_benchmarks**
> [BenchmarkResponse] get_benchmarks()

Get list of benchmarks.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_response import BenchmarkResponse
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
    api_instance = benchmark_api.BenchmarkApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get list of benchmarks.
        api_response = api_instance.get_benchmarks()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->get_benchmarks: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[BenchmarkResponse]**](BenchmarkResponse.md)

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

# **remove_benchmark_filter**
> BenchmarkTest remove_benchmark_filter(filter_id, id, test_id)

Remove filter from benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_test import BenchmarkTest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    filter_id = 1 # int | The filter ID.
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Remove filter from benchmark test.
        api_response = api_instance.remove_benchmark_filter(filter_id, id, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->remove_benchmark_filter: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **int**| The filter ID. |
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

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

# **remove_benchmark_test_defense**
> BenchmarkTest remove_benchmark_test_defense(defense_id, id, test_id)

Remove defense from benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_test import BenchmarkTest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    defense_id = 1 # int | The defense ID.
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Remove defense from benchmark test.
        api_response = api_instance.remove_benchmark_test_defense(defense_id, id, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->remove_benchmark_test_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defense_id** | **int**| The defense ID. |
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

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

# **start_benchmark_test**
> start_benchmark_test(id, test_id)

Start a benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Start a benchmark test.
        api_instance.start_benchmark_test(id, test_id)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->start_benchmark_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |

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

# **stop_benchmark_test**
> stop_benchmark_test(id, test_id)

Stop a benchmark test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Stop a benchmark test.
        api_instance.stop_benchmark_test(id, test_id)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->stop_benchmark_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |

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

# **update_benchmark**
> BenchmarkResponse update_benchmark(id, benchmark_request)

Update benchmark.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_response import BenchmarkResponse
from guardai_api.model.benchmark_request import BenchmarkRequest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    benchmark_request = BenchmarkRequest(
        name="name_example",
        settings=BenchmarkSettings(
            projects=[
                BenchmarkProject(
                    enabled=True,
                    id=1,
                ),
            ],
            tasks=[
                "tasks_example",
            ],
            tests=[
                BenchmarkTest(
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
                    defenses=[
                        DefenseResponse(
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
                    ],
                    id=1,
                    name="name_example",
                    status="CANCELLED",
                ),
            ],
        ),
    ) # BenchmarkRequest | benchmarkRequest

    # example passing only required values which don't have defaults set
    try:
        # Update benchmark.
        api_response = api_instance.update_benchmark(id, benchmark_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->update_benchmark: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **benchmark_request** | [**BenchmarkRequest**](BenchmarkRequest.md)| benchmarkRequest |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

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

# **update_benchmark_test**
> BenchmarkTest update_benchmark_test(id, test_id, test_request)

Update test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import benchmark_api
from guardai_api.model.benchmark_test_request import BenchmarkTestRequest
from guardai_api.model.benchmark_test import BenchmarkTest
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
    api_instance = benchmark_api.BenchmarkApi(api_client)
    id = 1 # int | The benchmark ID.
    test_id = 1 # int | The test ID.
    test_request = BenchmarkTestRequest(
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
        name="name_example",
    ) # BenchmarkTestRequest | The test update request.

    # example passing only required values which don't have defaults set
    try:
        # Update test.
        api_response = api_instance.update_benchmark_test(id, test_id, test_request)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling BenchmarkApi->update_benchmark_test: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The benchmark ID. |
 **test_id** | **int**| The test ID. |
 **test_request** | [**BenchmarkTestRequest**](BenchmarkTestRequest.md)| The test update request. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

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

