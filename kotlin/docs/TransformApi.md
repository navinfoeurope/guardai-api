# TransformApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTransform**](TransformApi.md#addTransform) | **POST** /api/v1/transforms | Add a transform to an organization.
[**deleteTransform**](TransformApi.md#deleteTransform) | **DELETE** /api/v1/transforms/{id} | Delete a transform by ID.
[**downloadFile**](TransformApi.md#downloadFile) | **GET** /api/v1/transforms/{id}/data | Download transform file.
[**getTransform**](TransformApi.md#getTransform) | **GET** /api/v1/transforms/{id} | Get a transform by ID.
[**getTransforms**](TransformApi.md#getTransforms) | **GET** /api/v1/transforms | Get the transforms available for this user.
[**updateTransform**](TransformApi.md#updateTransform) | **PUT** /api/v1/transforms/{id} | Update transform by ID.
[**uploadFile**](TransformApi.md#uploadFile) | **POST** /api/v1/transforms/{id} | Upload the data file for the transform.


<a name="addTransform"></a>
# **addTransform**
> TransformDefinition addTransform(id, name)

Add a transform to an organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val name : kotlin.String = name_example // kotlin.String | The transform name.
try {
    val result : TransformDefinition = apiInstance.addTransform(id, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#addTransform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#addTransform")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **name** | **kotlin.String**| The transform name. |

### Return type

[**TransformDefinition**](TransformDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTransform"></a>
# **deleteTransform**
> deleteTransform(id)

Delete a transform by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
val id : kotlin.Long = 789 // kotlin.Long | The transform ID.
try {
    apiInstance.deleteTransform(id)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#deleteTransform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#deleteTransform")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The transform ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFile"></a>
# **downloadFile**
> java.io.File downloadFile(id)

Download transform file.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
val id : kotlin.Long = 789 // kotlin.Long | The transform ID.
try {
    val result : java.io.File = apiInstance.downloadFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#downloadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#downloadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The transform ID. |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransform"></a>
# **getTransform**
> TransformDefinition getTransform(id)

Get a transform by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
val id : kotlin.Long = 789 // kotlin.Long | The transform ID.
try {
    val result : TransformDefinition = apiInstance.getTransform(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#getTransform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#getTransform")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The transform ID. |

### Return type

[**TransformDefinition**](TransformDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransforms"></a>
# **getTransforms**
> kotlin.collections.List&lt;TransformDefinition&gt; getTransforms()

Get the transforms available for this user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
try {
    val result : kotlin.collections.List<TransformDefinition> = apiInstance.getTransforms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#getTransforms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#getTransforms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TransformDefinition&gt;**](TransformDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransform"></a>
# **updateTransform**
> TransformDefinition updateTransform(id, model)

Update transform by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
val id : kotlin.Long = 789 // kotlin.Long | The transform ID.
val model : TransformDefinition =  // TransformDefinition | The transform update request.
try {
    val result : TransformDefinition = apiInstance.updateTransform(id, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#updateTransform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#updateTransform")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The transform ID. |
 **model** | [**TransformDefinition**](TransformDefinition.md)| The transform update request. |

### Return type

[**TransformDefinition**](TransformDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> TransformDefinition uploadFile(id, file)

Upload the data file for the transform.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TransformApi()
val id : kotlin.Long = 789 // kotlin.Long | The transform ID.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : TransformDefinition = apiInstance.uploadFile(id, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransformApi#uploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransformApi#uploadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The transform ID. |
 **file** | **java.io.File**|  | [optional]

### Return type

[**TransformDefinition**](TransformDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

