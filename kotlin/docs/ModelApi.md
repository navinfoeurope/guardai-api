# ModelApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addModel**](ModelApi.md#addModel) | **POST** /api/v1/models | Add a model to an organization.
[**copyModel**](ModelApi.md#copyModel) | **POST** /api/v1/models/{id}/copy | Make a copy of a model. To copy to a different organization, extra permissions are required.
[**deleteModel**](ModelApi.md#deleteModel) | **DELETE** /api/v1/models/{id} | Delete a model by ID.
[**downloadModelData**](ModelApi.md#downloadModelData) | **GET** /api/v1/models/{id}/data | Download model data.
[**getModel**](ModelApi.md#getModel) | **GET** /api/v1/models/{id} | Get a model by ID.
[**getModels**](ModelApi.md#getModels) | **GET** /api/v1/models | Get the models available for this user.
[**updateModel**](ModelApi.md#updateModel) | **PUT** /api/v1/models/{id} | Update model by ID.
[**uploadModelData**](ModelApi.md#uploadModelData) | **POST** /api/v1/models/{modelId}/modeldata | Upload model data.


<a name="addModel"></a>
# **addModel**
> ModelResponse addModel(id, name)

Add a model to an organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val name : kotlin.String = name_example // kotlin.String | The model name.
try {
    val result : ModelResponse = apiInstance.addModel(id, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#addModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#addModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **name** | **kotlin.String**| The model name. |

### Return type

[**ModelResponse**](ModelResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="copyModel"></a>
# **copyModel**
> ModelResponse copyModel(id, orgId)

Make a copy of a model. To copy to a different organization, extra permissions are required.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val id : kotlin.Long = 789 // kotlin.Long | The model ID.
val orgId : kotlin.Long = 789 // kotlin.Long | Optional destination organization ID to copy to.
try {
    val result : ModelResponse = apiInstance.copyModel(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#copyModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#copyModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The model ID. |
 **orgId** | **kotlin.Long**| Optional destination organization ID to copy to. | [optional]

### Return type

[**ModelResponse**](ModelResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> deleteModel(id)

Delete a model by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val id : kotlin.Long = 789 // kotlin.Long | The model ID.
try {
    apiInstance.deleteModel(id)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#deleteModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#deleteModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The model ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadModelData"></a>
# **downloadModelData**
> java.io.File downloadModelData(id, dataType)

Download model data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val id : kotlin.Long = 789 // kotlin.Long | The model ID.
val dataType : kotlin.String = dataType_example // kotlin.String | The data type.
try {
    val result : java.io.File = apiInstance.downloadModelData(id, dataType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#downloadModelData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#downloadModelData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The model ID. |
 **dataType** | **kotlin.String**| The data type. | [enum: Model, WrapperScript]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModel"></a>
# **getModel**
> ModelResponse getModel(id)

Get a model by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val id : kotlin.Long = 789 // kotlin.Long | The model ID.
try {
    val result : ModelResponse = apiInstance.getModel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#getModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#getModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The model ID. |

### Return type

[**ModelResponse**](ModelResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModels"></a>
# **getModels**
> kotlin.collections.List&lt;ModelResponse&gt; getModels()

Get the models available for this user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
try {
    val result : kotlin.collections.List<ModelResponse> = apiInstance.getModels()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#getModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#getModels")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;ModelResponse&gt;**](ModelResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateModel"></a>
# **updateModel**
> ModelResponse updateModel(id, model)

Update model by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val id : kotlin.Long = 789 // kotlin.Long | The model ID.
val model : ModelRequest =  // ModelRequest | The model update request.
try {
    val result : ModelResponse = apiInstance.updateModel(id, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#updateModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#updateModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The model ID. |
 **model** | [**ModelRequest**](ModelRequest.md)| The model update request. |

### Return type

[**ModelResponse**](ModelResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadModelData"></a>
# **uploadModelData**
> ModelResponse uploadModelData(modelId, dataType, file)

Upload model data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ModelApi()
val modelId : kotlin.Long = 789 // kotlin.Long | The model ID.
val dataType : kotlin.String = dataType_example // kotlin.String | dataType
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : ModelResponse = apiInstance.uploadModelData(modelId, dataType, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelApi#uploadModelData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelApi#uploadModelData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **kotlin.Long**| The model ID. |
 **dataType** | **kotlin.String**| dataType | [enum: Model, WrapperScript]
 **file** | **java.io.File**|  | [optional]

### Return type

[**ModelResponse**](ModelResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

