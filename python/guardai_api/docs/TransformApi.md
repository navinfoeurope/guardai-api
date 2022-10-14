# guardai_api.TransformApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_transform**](TransformApi.md#add_transform) | **POST** /api/v1/transforms | Add a transform to an organization.
[**delete_transform**](TransformApi.md#delete_transform) | **DELETE** /api/v1/transforms/{id} | Delete a transform by ID.
[**download_file**](TransformApi.md#download_file) | **GET** /api/v1/transforms/{id}/data | Download transform file.
[**get_transform**](TransformApi.md#get_transform) | **GET** /api/v1/transforms/{id} | Get a transform by ID.
[**get_transforms**](TransformApi.md#get_transforms) | **GET** /api/v1/transforms | Get the transforms available for this user.
[**update_transform**](TransformApi.md#update_transform) | **PUT** /api/v1/transforms/{id} | Update transform by ID.
[**upload_file**](TransformApi.md#upload_file) | **POST** /api/v1/transforms/{id} | Upload the data file for the transform.


# **add_transform**
> TransformDefinition add_transform(id, name)

Add a transform to an organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
from guardai_api.model.transform_definition import TransformDefinition
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
    api_instance = transform_api.TransformApi(api_client)
    id = 1 # int | The organization ID.
    name = "name_example" # str | The transform name.

    # example passing only required values which don't have defaults set
    try:
        # Add a transform to an organization.
        api_response = api_instance.add_transform(id, name)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->add_transform: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **name** | **str**| The transform name. |

### Return type

[**TransformDefinition**](TransformDefinition.md)

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

# **delete_transform**
> delete_transform(id)

Delete a transform by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
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
    api_instance = transform_api.TransformApi(api_client)
    id = 1 # int | The transform ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a transform by ID.
        api_instance.delete_transform(id)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->delete_transform: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The transform ID. |

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

# **download_file**
> file_type download_file(id)

Download transform file.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
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
    api_instance = transform_api.TransformApi(api_client)
    id = 1 # int | The transform ID.

    # example passing only required values which don't have defaults set
    try:
        # Download transform file.
        api_response = api_instance.download_file(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->download_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The transform ID. |

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

# **get_transform**
> TransformDefinition get_transform(id)

Get a transform by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
from guardai_api.model.transform_definition import TransformDefinition
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
    api_instance = transform_api.TransformApi(api_client)
    id = 1 # int | The transform ID.

    # example passing only required values which don't have defaults set
    try:
        # Get a transform by ID.
        api_response = api_instance.get_transform(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->get_transform: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The transform ID. |

### Return type

[**TransformDefinition**](TransformDefinition.md)

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

# **get_transforms**
> [TransformDefinition] get_transforms()

Get the transforms available for this user.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
from guardai_api.model.transform_definition import TransformDefinition
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
    api_instance = transform_api.TransformApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the transforms available for this user.
        api_response = api_instance.get_transforms()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->get_transforms: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[TransformDefinition]**](TransformDefinition.md)

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

# **update_transform**
> TransformDefinition update_transform(id, model)

Update transform by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
from guardai_api.model.transform_definition import TransformDefinition
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
    api_instance = transform_api.TransformApi(api_client)
    id = 1 # int | The transform ID.
    model = TransformDefinition(
        apply_mapping={
            "key": {
                "key": {},
            },
        },
        codebase_name="codebase_name_example",
        converted_target_format="converted_target_format_example",
        description="description_example",
        enabled=True,
        id=1,
        name="name_example",
        params=[
            {
                "key": {},
            },
        ],
        target_format=[
            "target_format_example",
        ],
        tasks=[
            "tasks_example",
        ],
    ) # TransformDefinition | The transform update request.

    # example passing only required values which don't have defaults set
    try:
        # Update transform by ID.
        api_response = api_instance.update_transform(id, model)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->update_transform: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The transform ID. |
 **model** | [**TransformDefinition**](TransformDefinition.md)| The transform update request. |

### Return type

[**TransformDefinition**](TransformDefinition.md)

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

# **upload_file**
> TransformDefinition upload_file(id)

Upload the data file for the transform.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import transform_api
from guardai_api.model.transform_definition import TransformDefinition
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
    api_instance = transform_api.TransformApi(api_client)
    id = 1 # int | The transform ID.
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload the data file for the transform.
        api_response = api_instance.upload_file(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->upload_file: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload the data file for the transform.
        api_response = api_instance.upload_file(id, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TransformApi->upload_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The transform ID. |
 **file** | **file_type**|  | [optional]

### Return type

[**TransformDefinition**](TransformDefinition.md)

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

