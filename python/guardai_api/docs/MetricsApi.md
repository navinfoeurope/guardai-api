# guardai_api.MetricsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_metric**](MetricsApi.md#add_metric) | **POST** /api/v1/metrics | Add a metric to an organization.
[**delete_metric**](MetricsApi.md#delete_metric) | **DELETE** /api/v1/metrics/{id} | Delete a metric by ID.
[**download_metric_file**](MetricsApi.md#download_metric_file) | **GET** /api/v1/metrics/{id}/data | Download metric file.
[**get_metric**](MetricsApi.md#get_metric) | **GET** /api/v1/metrics/{id} | Get a metric by ID.
[**get_metrics**](MetricsApi.md#get_metrics) | **GET** /api/v1/metrics | Get the custom metrics available for this user.
[**update_metric**](MetricsApi.md#update_metric) | **PUT** /api/v1/metrics/{id} | Update metric by ID.
[**upload_metric_file**](MetricsApi.md#upload_metric_file) | **POST** /api/v1/metrics/{id} | Upload the metric implementation.


# **add_metric**
> MetricDefinition add_metric(id, name)

Add a metric to an organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
from guardai_api.model.metric_definition import MetricDefinition
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
    api_instance = metrics_api.MetricsApi(api_client)
    id = 1 # int | The organization ID.
    name = "name_example" # str | The metric name.

    # example passing only required values which don't have defaults set
    try:
        # Add a metric to an organization.
        api_response = api_instance.add_metric(id, name)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->add_metric: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **name** | **str**| The metric name. |

### Return type

[**MetricDefinition**](MetricDefinition.md)

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

# **delete_metric**
> delete_metric(id)

Delete a metric by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
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
    api_instance = metrics_api.MetricsApi(api_client)
    id = "id_example" # str | The metric ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a metric by ID.
        api_instance.delete_metric(id)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->delete_metric: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The metric ID. |

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

# **download_metric_file**
> file_type download_metric_file(id)

Download metric file.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
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
    api_instance = metrics_api.MetricsApi(api_client)
    id = "id_example" # str | The metric ID.

    # example passing only required values which don't have defaults set
    try:
        # Download metric file.
        api_response = api_instance.download_metric_file(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->download_metric_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The metric ID. |

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

# **get_metric**
> MetricDefinition get_metric(id)

Get a metric by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
from guardai_api.model.metric_definition import MetricDefinition
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
    api_instance = metrics_api.MetricsApi(api_client)
    id = "id_example" # str | The metric ID.

    # example passing only required values which don't have defaults set
    try:
        # Get a metric by ID.
        api_response = api_instance.get_metric(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->get_metric: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The metric ID. |

### Return type

[**MetricDefinition**](MetricDefinition.md)

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

# **get_metrics**
> [MetricDefinition] get_metrics()

Get the custom metrics available for this user.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
from guardai_api.model.metric_definition import MetricDefinition
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
    api_instance = metrics_api.MetricsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the custom metrics available for this user.
        api_response = api_instance.get_metrics()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->get_metrics: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[MetricDefinition]**](MetricDefinition.md)

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

# **update_metric**
> MetricDefinition update_metric(id, metric)

Update metric by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
from guardai_api.model.metric_definition import MetricDefinition
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
    api_instance = metrics_api.MetricsApi(api_client)
    id = "id_example" # str | The metric ID.
    metric = MetricDefinition(
        codebase_name="codebase_name_example",
        description="description_example",
        enabled=True,
        metric_type="metric_type_example",
        name="name_example",
        params=[
            {},
        ],
        tasks=[
            "tasks_example",
        ],
        uid="uid_example",
    ) # MetricDefinition | The metric update request.

    # example passing only required values which don't have defaults set
    try:
        # Update metric by ID.
        api_response = api_instance.update_metric(id, metric)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->update_metric: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The metric ID. |
 **metric** | [**MetricDefinition**](MetricDefinition.md)| The metric update request. |

### Return type

[**MetricDefinition**](MetricDefinition.md)

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

# **upload_metric_file**
> MetricDefinition upload_metric_file(id)

Upload the metric implementation.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import metrics_api
from guardai_api.model.metric_definition import MetricDefinition
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
    api_instance = metrics_api.MetricsApi(api_client)
    id = "id_example" # str | The metric ID.
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload the metric implementation.
        api_response = api_instance.upload_metric_file(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->upload_metric_file: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload the metric implementation.
        api_response = api_instance.upload_metric_file(id, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling MetricsApi->upload_metric_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The metric ID. |
 **file** | **file_type**|  | [optional]

### Return type

[**MetricDefinition**](MetricDefinition.md)

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

