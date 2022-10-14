# LoginApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthUser**](LoginApi.md#getAuthUser) | **GET** /api/v1/login/token | Get the currently OAuth2 authenticated user platform token.
[**getOAuthClients**](LoginApi.md#getOAuthClients) | **GET** /api/v1/login/sso | Get the list of supported OAuth clients.
[**login**](LoginApi.md#login) | **POST** /api/v1/login | Retrieve an access token using API keys.


<a name="getAuthUser"></a>
# **getAuthUser**
> AuthorizedUserResponse getAuthUser()

Get the currently OAuth2 authenticated user platform token.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = LoginApi()
try {
    val result : AuthorizedUserResponse = apiInstance.getAuthUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApi#getAuthUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#getAuthUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthorizedUserResponse**](AuthorizedUserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOAuthClients"></a>
# **getOAuthClients**
> kotlin.collections.List&lt;kotlin.String&gt; getOAuthClients()

Get the list of supported OAuth clients.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = LoginApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.getOAuthClients()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApi#getOAuthClients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#getOAuthClients")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="login"></a>
# **login**
> AuthorizedUserResponse login(request)

Retrieve an access token using API keys.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = LoginApi()
val request : LoginRequest =  // LoginRequest | request
try {
    val result : AuthorizedUserResponse = apiInstance.login(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApi#login")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#login")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LoginRequest**](LoginRequest.md)| request |

### Return type

[**AuthorizedUserResponse**](AuthorizedUserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

