# UsersApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /api/v1/users/{id} | Delete a user.
[**getLoggedInUser**](UsersApi.md#getLoggedInUser) | **GET** /api/v1/users/me | Get the currently logged-in user.
[**getUser**](UsersApi.md#getUser) | **GET** /api/v1/users/{id} | Get a user.
[**getUserLogs**](UsersApi.md#getUserLogs) | **GET** /api/v1/users/{id}/logs | Get user logs.
[**getUsers**](UsersApi.md#getUsers) | **GET** /api/v1/users | Get all users (access rights required).
[**sendFeedback**](UsersApi.md#sendFeedback) | **POST** /api/v1/users/feedback | Send user feedback.
[**updateProfile**](UsersApi.md#updateProfile) | **PUT** /api/v1/users | Update profile of currently authenticated user.
[**updateUser**](UsersApi.md#updateUser) | **PUT** /api/v1/users/{id} | Update user by user id - (admin permission required)


<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(id)

Delete a user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteUser(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteUser")
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

<a name="getLoggedInUser"></a>
# **getLoggedInUser**
> UserResponse getLoggedInUser()

Get the currently logged-in user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
try {
    val result : UserResponse = apiInstance.getLoggedInUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getLoggedInUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getLoggedInUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResponse**](UserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(id)

Get a user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : UserResponse = apiInstance.getUser(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserLogs"></a>
# **getUserLogs**
> kotlin.collections.List&lt;LogEntryResponse&gt; getUserLogs(id)

Get user logs.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.collections.List<LogEntryResponse> = apiInstance.getUserLogs(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.collections.List&lt;LogEntryResponse&gt;**](LogEntryResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> kotlin.collections.List&lt;UserResponse&gt; getUsers()

Get all users (access rights required).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
try {
    val result : kotlin.collections.List<UserResponse> = apiInstance.getUsers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUsers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;UserResponse&gt;**](UserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendFeedback"></a>
# **sendFeedback**
> sendFeedback(userRequest)

Send user feedback.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
val userRequest : UserRequest =  // UserRequest | The user request.
try {
    apiInstance.sendFeedback(userRequest)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#sendFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#sendFeedback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRequest** | [**UserRequest**](UserRequest.md)| The user request. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateProfile"></a>
# **updateProfile**
> UserResponse updateProfile(userRequest)

Update profile of currently authenticated user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
val userRequest : UserRequest =  // UserRequest | The user update request.
try {
    val result : UserResponse = apiInstance.updateProfile(userRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRequest** | [**UserRequest**](UserRequest.md)| The user update request. |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserResponse updateUser(id, userRequest)

Update user by user id - (admin permission required)

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = UsersApi()
val id : kotlin.Long = 789 // kotlin.Long | The user ID.
val userRequest : UserRequest =  // UserRequest | userRequest
try {
    val result : UserResponse = apiInstance.updateUser(id, userRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The user ID. |
 **userRequest** | [**UserRequest**](UserRequest.md)| userRequest |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

