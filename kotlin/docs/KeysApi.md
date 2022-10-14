# KeysApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKey**](KeysApi.md#createKey) | **POST** /api/v1/keys | Create API key.
[**deleteKey**](KeysApi.md#deleteKey) | **DELETE** /api/v1/keys/{id} | Delete a key.
[**getKey**](KeysApi.md#getKey) | **GET** /api/v1/keys/{id} | Get a key.
[**getKeys**](KeysApi.md#getKeys) | **GET** /api/v1/keys | Get all of a user&#39;s keys.


<a name="createKey"></a>
# **createKey**
> APIKeyResponse createKey()

Create API key.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = KeysApi()
try {
    val result : APIKeyResponse = apiInstance.createKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#createKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#createKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteKey"></a>
# **deleteKey**
> deleteKey(id)

Delete a key.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = KeysApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteKey(id)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#deleteKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#deleteKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getKey"></a>
# **getKey**
> APIKeyResponse getKey(id)

Get a key.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = KeysApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : APIKeyResponse = apiInstance.getKey(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#getKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#getKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**APIKeyResponse**](APIKeyResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeys"></a>
# **getKeys**
> kotlin.collections.List&lt;APIKeyResponse&gt; getKeys()

Get all of a user&#39;s keys.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = KeysApi()
try {
    val result : kotlin.collections.List<APIKeyResponse> = apiInstance.getKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeysApi#getKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeysApi#getKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;APIKeyResponse&gt;**](APIKeyResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

