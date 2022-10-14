# DefensesApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDefense**](DefensesApi.md#getDefense) | **GET** /api/v1/defenses/{id} | Get a defense.
[**updateDefense**](DefensesApi.md#updateDefense) | **PUT** /api/v1/defenses/{id} | Update defense.


<a name="getDefense"></a>
# **getDefense**
> DefenseResponse getDefense(id)

Get a defense.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DefensesApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : DefenseResponse = apiInstance.getDefense(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefensesApi#getDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefensesApi#getDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**DefenseResponse**](DefenseResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDefense"></a>
# **updateDefense**
> DefenseResponse updateDefense(id, request)

Update defense.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DefensesApi()
val id : kotlin.Long = 789 // kotlin.Long | id
val request : DefenseRequest =  // DefenseRequest | request
try {
    val result : DefenseResponse = apiInstance.updateDefense(id, request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefensesApi#updateDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefensesApi#updateDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |
 **request** | [**DefenseRequest**](DefenseRequest.md)| request |

### Return type

[**DefenseResponse**](DefenseResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

