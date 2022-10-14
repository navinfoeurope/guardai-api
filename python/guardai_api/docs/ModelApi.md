# guardai_api.ModelApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_model**](ModelApi.md#add_model) | **POST** /api/v1/models | Add a model to an organization.
[**copy_model**](ModelApi.md#copy_model) | **POST** /api/v1/models/{id}/copy | Make a copy of a model. To copy to a different organization, extra permissions are required.
[**delete_model**](ModelApi.md#delete_model) | **DELETE** /api/v1/models/{id} | Delete a model by ID.
[**download_model_data**](ModelApi.md#download_model_data) | **GET** /api/v1/models/{id}/data | Download model data.
[**get_model**](ModelApi.md#get_model) | **GET** /api/v1/models/{id} | Get a model by ID.
[**get_models**](ModelApi.md#get_models) | **GET** /api/v1/models | Get the models available for this user.
[**update_model**](ModelApi.md#update_model) | **PUT** /api/v1/models/{id} | Update model by ID.
[**upload_model_data**](ModelApi.md#upload_model_data) | **POST** /api/v1/models/{modelId}/modeldata | Upload model data.


# **add_model**
> ModelResponse add_model(id, name)

Add a model to an organization.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
from guardai_api.model.model_response import ModelResponse
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
    api_instance = model_api.ModelApi(api_client)
    id = 1 # int | The organization ID.
    name = "name_example" # str | The model name.

    # example passing only required values which don't have defaults set
    try:
        # Add a model to an organization.
        api_response = api_instance.add_model(id, name)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->add_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **name** | **str**| The model name. |

### Return type

[**ModelResponse**](ModelResponse.md)

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

# **copy_model**
> ModelResponse copy_model(id)

Make a copy of a model. To copy to a different organization, extra permissions are required.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
from guardai_api.model.model_response import ModelResponse
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
    api_instance = model_api.ModelApi(api_client)
    id = 1 # int | The model ID.
    org_id = 1 # int | Optional destination organization ID to copy to. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Make a copy of a model. To copy to a different organization, extra permissions are required.
        api_response = api_instance.copy_model(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->copy_model: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Make a copy of a model. To copy to a different organization, extra permissions are required.
        api_response = api_instance.copy_model(id, org_id=org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->copy_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The model ID. |
 **org_id** | **int**| Optional destination organization ID to copy to. | [optional]

### Return type

[**ModelResponse**](ModelResponse.md)

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

# **delete_model**
> delete_model(id)

Delete a model by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
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
    api_instance = model_api.ModelApi(api_client)
    id = 1 # int | The model ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a model by ID.
        api_instance.delete_model(id)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->delete_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The model ID. |

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

# **download_model_data**
> file_type download_model_data(data_type, id)

Download model data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
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
    api_instance = model_api.ModelApi(api_client)
    data_type = "Model" # str | The data type.
    id = 1 # int | The model ID.

    # example passing only required values which don't have defaults set
    try:
        # Download model data.
        api_response = api_instance.download_model_data(data_type, id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->download_model_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| The data type. |
 **id** | **int**| The model ID. |

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

# **get_model**
> ModelResponse get_model(id)

Get a model by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
from guardai_api.model.model_response import ModelResponse
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
    api_instance = model_api.ModelApi(api_client)
    id = 1 # int | The model ID.

    # example passing only required values which don't have defaults set
    try:
        # Get a model by ID.
        api_response = api_instance.get_model(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->get_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The model ID. |

### Return type

[**ModelResponse**](ModelResponse.md)

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

# **get_models**
> [ModelResponse] get_models()

Get the models available for this user.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
from guardai_api.model.model_response import ModelResponse
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
    api_instance = model_api.ModelApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the models available for this user.
        api_response = api_instance.get_models()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->get_models: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[ModelResponse]**](ModelResponse.md)

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

# **update_model**
> ModelResponse update_model(id, model)

Update model by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
from guardai_api.model.model_request import ModelRequest
from guardai_api.model.model_response import ModelResponse
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
    api_instance = model_api.ModelApi(api_client)
    id = 1 # int | The model ID.
    model = ModelRequest(
        dataset_id=1,
        description="description_example",
        environment="environment_example",
        framework_type="Keras",
        name="name_example",
        tasks=[
            "tasks_example",
        ],
        transforms=[
            Transform(
                id=1,
                name="name_example",
                params={},
            ),
        ],
    ) # ModelRequest | The model update request.

    # example passing only required values which don't have defaults set
    try:
        # Update model by ID.
        api_response = api_instance.update_model(id, model)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->update_model: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The model ID. |
 **model** | [**ModelRequest**](ModelRequest.md)| The model update request. |

### Return type

[**ModelResponse**](ModelResponse.md)

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

# **upload_model_data**
> ModelResponse upload_model_data(data_type, model_id)

Upload model data.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import model_api
from guardai_api.model.model_response import ModelResponse
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
    api_instance = model_api.ModelApi(api_client)
    data_type = "Model" # str | dataType
    model_id = 1 # int | The model ID.
    file = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Upload model data.
        api_response = api_instance.upload_model_data(data_type, model_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->upload_model_data: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Upload model data.
        api_response = api_instance.upload_model_data(data_type, model_id, file=file)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling ModelApi->upload_model_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType |
 **model_id** | **int**| The model ID. |
 **file** | **file_type**|  | [optional]

### Return type

[**ModelResponse**](ModelResponse.md)

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

