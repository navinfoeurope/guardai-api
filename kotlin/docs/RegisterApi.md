# RegisterApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register**](RegisterApi.md#register) | **POST** /api/v1/register | Register user
[**sendInvite**](RegisterApi.md#sendInvite) | **POST** /api/v1/register/invite | Send user invite - admin permissions required.


<a name="register"></a>
# **register**
> AuthorizedUserResponse register(request)

Register user

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = RegisterApi()
val request : RegisterRequest =  // RegisterRequest | request
try {
    val result : AuthorizedUserResponse = apiInstance.register(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegisterApi#register")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegisterApi#register")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RegisterRequest**](RegisterRequest.md)| request |

### Return type

[**AuthorizedUserResponse**](AuthorizedUserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendInvite"></a>
# **sendInvite**
> sendInvite(request)

Send user invite - admin permissions required.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = RegisterApi()
val request : InviteRequest =  // InviteRequest | request
try {
    apiInstance.sendInvite(request)
} catch (e: ClientException) {
    println("4xx response calling RegisterApi#sendInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegisterApi#sendInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InviteRequest**](InviteRequest.md)| request |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

