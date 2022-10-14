# WebhooksApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /api/v1/webhooks/test/{testId} | Create a webhook for a test.
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /api/v1/webhooks/{hookId} | Delete a webhook.
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /api/v1/webhooks/{webhookId} | Get a webhook.
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /api/v1/webhooks/test/{testId} | Get all webhooks defined for a test.
[**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /api/v1/webhooks/{hookId} | Update a webhook.


<a name="createWebhook"></a>
# **createWebhook**
> WebhookResponse createWebhook(testId, hook)

Create a webhook for a test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = WebhooksApi()
val testId : kotlin.Long = 789 // kotlin.Long | The test ID.
val hook : WebhookRequest =  // WebhookRequest | The test hook object.
try {
    val result : WebhookResponse = apiInstance.createWebhook(testId, hook)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| The test ID. |
 **hook** | [**WebhookRequest**](WebhookRequest.md)| The test hook object. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(hookId)

Delete a webhook.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.Long = 789 // kotlin.Long | The hook ID.
try {
    apiInstance.deleteWebhook(hookId)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.Long**| The hook ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getWebhook"></a>
# **getWebhook**
> WebhookResponse getWebhook(webhookId)

Get a webhook.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = WebhooksApi()
val webhookId : kotlin.Long = 789 // kotlin.Long | The Webhook ID.
try {
    val result : WebhookResponse = apiInstance.getWebhook(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **kotlin.Long**| The Webhook ID. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> kotlin.collections.List&lt;WebhookResponse&gt; getWebhooks(testId)

Get all webhooks defined for a test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = WebhooksApi()
val testId : kotlin.Long = 789 // kotlin.Long | The test ID.
try {
    val result : kotlin.collections.List<WebhookResponse> = apiInstance.getWebhooks(testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| The test ID. |

### Return type

[**kotlin.collections.List&lt;WebhookResponse&gt;**](WebhookResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> WebhookResponse updateWebhook(hookId, hook)

Update a webhook.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.Long = 789 // kotlin.Long | The hook ID.
val hook : WebhookRequest =  // WebhookRequest | The test hook object.
try {
    val result : WebhookResponse = apiInstance.updateWebhook(hookId, hook)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.Long**| The hook ID. |
 **hook** | [**WebhookRequest**](WebhookRequest.md)| The test hook object. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

