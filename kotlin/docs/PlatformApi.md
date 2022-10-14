# PlatformApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelWorker**](PlatformApi.md#cancelWorker) | **GET** /api/v1/platform/cancel | Administrative call to cancel a worker job (admin rights required)
[**deletePlatformFile**](PlatformApi.md#deletePlatformFile) | **DELETE** /api/v1/platform/file | Delete platform file (only admins).
[**downloadPlatformFile**](PlatformApi.md#downloadPlatformFile) | **GET** /api/v1/platform/file | Download platform file.
[**getEnvironments**](PlatformApi.md#getEnvironments) | **GET** /api/v1/platform/environments | Get the list of environments.
[**getQueueInfo**](PlatformApi.md#getQueueInfo) | **GET** /api/v1/platform/workerqueue | Get worker queue information.
[**statPlatformFile**](PlatformApi.md#statPlatformFile) | **GET** /api/v1/platform/file/stat | Stat platform file (only admins).
[**uploadFilePart**](PlatformApi.md#uploadFilePart) | **POST** /api/v1/platform/filepart | Upload a file part to the platform.
[**uploadPlatformFile**](PlatformApi.md#uploadPlatformFile) | **POST** /api/v1/platform/file | Upload a file to the platform and return a reference (only admins).
[**workerHeartbeat**](PlatformApi.md#workerHeartbeat) | **PUT** /api/v1/platform/heartbeat | Worker heartbeat - can only be called by a worker instance.


<a name="cancelWorker"></a>
# **cancelWorker**
> cancelWorker(id)

Administrative call to cancel a worker job (admin rights required)

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val id : kotlin.String = id_example // kotlin.String | id
try {
    apiInstance.cancelWorker(id)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#cancelWorker")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#cancelWorker")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePlatformFile"></a>
# **deletePlatformFile**
> deletePlatformFile(ref, type)

Delete platform file (only admins).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | File type - i.e. 'asset'
try {
    apiInstance.deletePlatformFile(ref, type)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#deletePlatformFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#deletePlatformFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| File type - i.e. &#39;asset&#39; |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadPlatformFile"></a>
# **downloadPlatformFile**
> java.io.File downloadPlatformFile(ref, type)

Download platform file.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | Download type - i.e. 'asset'
try {
    val result : java.io.File = apiInstance.downloadPlatformFile(ref, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#downloadPlatformFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#downloadPlatformFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| Download type - i.e. &#39;asset&#39; |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironments"></a>
# **getEnvironments**
> kotlin.collections.List&lt;EnvironmentResponse&gt; getEnvironments()

Get the list of environments.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
try {
    val result : kotlin.collections.List<EnvironmentResponse> = apiInstance.getEnvironments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#getEnvironments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#getEnvironments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;EnvironmentResponse&gt;**](EnvironmentResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQueueInfo"></a>
# **getQueueInfo**
> QueueInfoResponse getQueueInfo()

Get worker queue information.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
try {
    val result : QueueInfoResponse = apiInstance.getQueueInfo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#getQueueInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#getQueueInfo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QueueInfoResponse**](QueueInfoResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="statPlatformFile"></a>
# **statPlatformFile**
> FileStatResponse statPlatformFile(ref, type)

Stat platform file (only admins).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | File type - i.e. 'asset'
try {
    val result : FileStatResponse = apiInstance.statPlatformFile(ref, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#statPlatformFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#statPlatformFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| File type - i.e. &#39;asset&#39; |

### Return type

[**FileStatResponse**](FileStatResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadFilePart"></a>
# **uploadFilePart**
> kotlin.String uploadFilePart(ref, state, file)

Upload a file part to the platform.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val ref : kotlin.String = ref_example // kotlin.String | File reference
val state : kotlin.Int = 56 // kotlin.Int | File upload state: 1 - part, 2 - done.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.uploadFilePart(ref, state, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#uploadFilePart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#uploadFilePart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **kotlin.String**| File reference |
 **state** | **kotlin.Int**| File upload state: 1 - part, 2 - done. |
 **file** | **java.io.File**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadPlatformFile"></a>
# **uploadPlatformFile**
> kotlin.String uploadPlatformFile(type, chunked, description, file)

Upload a file to the platform and return a reference (only admins).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val type : kotlin.String = type_example // kotlin.String | Upload type - i.e. 'asset'
val chunked : kotlin.Boolean = true // kotlin.Boolean | Chunked upload
val description : kotlin.String = description_example // kotlin.String | File description
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.uploadPlatformFile(type, chunked, description, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#uploadPlatformFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#uploadPlatformFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| Upload type - i.e. &#39;asset&#39; |
 **chunked** | **kotlin.Boolean**| Chunked upload | [optional]
 **description** | **kotlin.String**| File description | [optional]
 **file** | **java.io.File**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="workerHeartbeat"></a>
# **workerHeartbeat**
> kotlin.Boolean workerHeartbeat(request)

Worker heartbeat - can only be called by a worker instance.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = PlatformApi()
val request : WorkerHeartbeatRequest =  // WorkerHeartbeatRequest | request
try {
    val result : kotlin.Boolean = apiInstance.workerHeartbeat(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#workerHeartbeat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#workerHeartbeat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**WorkerHeartbeatRequest**](WorkerHeartbeatRequest.md)| request |

### Return type

**kotlin.Boolean**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

