# guardai_api.WebhooksApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_webhook**](WebhooksApi.md#create_webhook) | **POST** /api/v1/webhooks/test/{testId} | Create a webhook for a test.
[**delete_webhook**](WebhooksApi.md#delete_webhook) | **DELETE** /api/v1/webhooks/{hookId} | Delete a webhook.
[**get_webhook**](WebhooksApi.md#get_webhook) | **GET** /api/v1/webhooks/{webhookId} | Get a webhook.
[**get_webhooks**](WebhooksApi.md#get_webhooks) | **GET** /api/v1/webhooks/test/{testId} | Get all webhooks defined for a test.
[**update_webhook**](WebhooksApi.md#update_webhook) | **PUT** /api/v1/webhooks/{hookId} | Update a webhook.


# **create_webhook**
> WebhookResponse create_webhook(test_id, hook)

Create a webhook for a test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import webhooks_api
from guardai_api.model.webhook_request import WebhookRequest
from guardai_api.model.webhook_response import WebhookResponse
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
    api_instance = webhooks_api.WebhooksApi(api_client)
    test_id = 1 # int | The test ID.
    hook = WebhookRequest(
        enabled=True,
        secret="secret_example",
        settings=WebHookSettings(
            content_type="application/json",
            events=[
                "events_example",
            ],
        ),
        url="url_example",
    ) # WebhookRequest | The test hook object.

    # example passing only required values which don't have defaults set
    try:
        # Create a webhook for a test.
        api_response = api_instance.create_webhook(test_id, hook)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling WebhooksApi->create_webhook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| The test ID. |
 **hook** | [**WebhookRequest**](WebhookRequest.md)| The test hook object. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

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

# **delete_webhook**
> delete_webhook(hook_id)

Delete a webhook.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import webhooks_api
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
    api_instance = webhooks_api.WebhooksApi(api_client)
    hook_id = 1 # int | The hook ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a webhook.
        api_instance.delete_webhook(hook_id)
    except guardai_api.ApiException as e:
        print("Exception when calling WebhooksApi->delete_webhook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook_id** | **int**| The hook ID. |

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

# **get_webhook**
> WebhookResponse get_webhook(webhook_id)

Get a webhook.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import webhooks_api
from guardai_api.model.webhook_response import WebhookResponse
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
    api_instance = webhooks_api.WebhooksApi(api_client)
    webhook_id = 1 # int | The Webhook ID.

    # example passing only required values which don't have defaults set
    try:
        # Get a webhook.
        api_response = api_instance.get_webhook(webhook_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling WebhooksApi->get_webhook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | **int**| The Webhook ID. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

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

# **get_webhooks**
> [WebhookResponse] get_webhooks(test_id)

Get all webhooks defined for a test.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import webhooks_api
from guardai_api.model.webhook_response import WebhookResponse
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
    api_instance = webhooks_api.WebhooksApi(api_client)
    test_id = 1 # int | The test ID.

    # example passing only required values which don't have defaults set
    try:
        # Get all webhooks defined for a test.
        api_response = api_instance.get_webhooks(test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling WebhooksApi->get_webhooks: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test_id** | **int**| The test ID. |

### Return type

[**[WebhookResponse]**](WebhookResponse.md)

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

# **update_webhook**
> WebhookResponse update_webhook(hook_id, hook)

Update a webhook.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import webhooks_api
from guardai_api.model.webhook_request import WebhookRequest
from guardai_api.model.webhook_response import WebhookResponse
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
    api_instance = webhooks_api.WebhooksApi(api_client)
    hook_id = 1 # int | The hook ID.
    hook = WebhookRequest(
        enabled=True,
        secret="secret_example",
        settings=WebHookSettings(
            content_type="application/json",
            events=[
                "events_example",
            ],
        ),
        url="url_example",
    ) # WebhookRequest | The test hook object.

    # example passing only required values which don't have defaults set
    try:
        # Update a webhook.
        api_response = api_instance.update_webhook(hook_id, hook)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling WebhooksApi->update_webhook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook_id** | **int**| The hook ID. |
 **hook** | [**WebhookRequest**](WebhookRequest.md)| The test hook object. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

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

