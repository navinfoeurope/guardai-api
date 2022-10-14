# guardai_api.ReportsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_report**](ReportsApi.md#add_report) | **POST** /api/v1/reports | Add report.
[**delete_report**](ReportsApi.md#delete_report) | **DELETE** /api/v1/reports/{id} | Delete a report.
[**download_report_data**](ReportsApi.md#download_report_data) | **GET** /api/v1/reports/{id}/download | Download report data.
[**get_report**](ReportsApi.md#get_report) | **GET** /api/v1/reports/{reportId} | Get a report.
[**get_report_file**](ReportsApi.md#get_report_file) | **GET** /api/v1/reports/{id}/file | Get file from report.
[**get_report_meta_data**](ReportsApi.md#get_report_meta_data) | **GET** /api/v1/reports/{id}/meta | Get meta data.
[**get_reports**](ReportsApi.md#get_reports) | **GET** /api/v1/reports | Get reports for a test.
[**view_data**](ReportsApi.md#view_data) | **GET** /api/v1/reports/{id}/{didx}/{aidx}/{idx}/{tag} | View report data.


# **add_report**
> ReportResponse add_report(report)

Add report.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
from guardai_api.model.report_request import ReportRequest
from guardai_api.model.report_response import ReportResponse
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
    api_instance = reports_api.ReportsApi(api_client)
    report = ReportRequest(
        data_ref="data_ref_example",
        json_report="json_report_example",
        project_id=1,
        run_id=1,
        test_id=1,
    ) # ReportRequest | report

    # example passing only required values which don't have defaults set
    try:
        # Add report.
        api_response = api_instance.add_report(report)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->add_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report** | [**ReportRequest**](ReportRequest.md)| report |

### Return type

[**ReportResponse**](ReportResponse.md)

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

# **delete_report**
> delete_report(id)

Delete a report.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
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
    api_instance = reports_api.ReportsApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Delete a report.
        api_instance.delete_report(id)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->delete_report: %s\n" % e)
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

# **download_report_data**
> file_type download_report_data(id)

Download report data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
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
    api_instance = reports_api.ReportsApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Download report data.
        api_response = api_instance.download_report_data(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->download_report_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

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

# **get_report**
> ReportResponse get_report(report_id)

Get a report.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
from guardai_api.model.report_response import ReportResponse
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
    api_instance = reports_api.ReportsApi(api_client)
    report_id = 1 # int | reportId

    # example passing only required values which don't have defaults set
    try:
        # Get a report.
        api_response = api_instance.get_report(report_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->get_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **int**| reportId |

### Return type

[**ReportResponse**](ReportResponse.md)

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

# **get_report_file**
> file_type get_report_file(file_name, id)

Get file from report.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
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
    api_instance = reports_api.ReportsApi(api_client)
    file_name = "fileName_example" # str | fileName
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get file from report.
        api_response = api_instance.get_report_file(file_name, id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->get_report_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_name** | **str**| fileName |
 **id** | **int**| id |

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

# **get_report_meta_data**
> file_type get_report_meta_data(id)

Get meta data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
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
    api_instance = reports_api.ReportsApi(api_client)
    id = 1 # int | id

    # example passing only required values which don't have defaults set
    try:
        # Get meta data.
        api_response = api_instance.get_report_meta_data(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->get_report_meta_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| id |

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

# **get_reports**
> [ReportResponse] get_reports(test_id)

Get reports for a test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
from guardai_api.model.report_response import ReportResponse
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
    api_instance = reports_api.ReportsApi(api_client)
    test_id = 1 # int | testId

    # example passing only required values which don't have defaults set
    try:
        # Get reports for a test.
        api_response = api_instance.get_reports(test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->get_reports: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| testId |

### Return type

[**[ReportResponse]**](ReportResponse.md)

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

# **view_data**
> file_type view_data(aidx, didx, id, idx, tag)

View report data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import reports_api
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
    api_instance = reports_api.ReportsApi(api_client)
    aidx = 1 # int | aidx
    didx = 1 # int | didx
    id = 1 # int | id
    idx = 1 # int | idx
    tag = "tag_example" # str | tag

    # example passing only required values which don't have defaults set
    try:
        # View report data.
        api_response = api_instance.view_data(aidx, didx, id, idx, tag)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ReportsApi->view_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aidx** | **int**| aidx |
 **didx** | **int**| didx |
 **id** | **int**| id |
 **idx** | **int**| idx |
 **tag** | **str**| tag |

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

