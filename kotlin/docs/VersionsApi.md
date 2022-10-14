# VersionsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlatformVersion**](VersionsApi.md#getPlatformVersion) | **GET** /api/v1/versions | Get platform version


<a name="getPlatformVersion"></a>
# **getPlatformVersion**
> kotlin.String getPlatformVersion()

Get platform version

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = VersionsApi()
try {
    val result : kotlin.String = apiInstance.getPlatformVersion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionsApi#getPlatformVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionsApi#getPlatformVersion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

