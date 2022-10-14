# ProjectApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProject**](ProjectApi.md#addProject) | **POST** /api/v1/projects | Add a project to an organization.
[**copyProject**](ProjectApi.md#copyProject) | **POST** /api/v1/projects/{id}/copy | Make a copy of the project available to (optionally) another organization.
[**copyProjectModel**](ProjectApi.md#copyProjectModel) | **POST** /api/v1/projects/{id}/copymodel | Make a copy of the project model available to the organization.
[**deleteData**](ProjectApi.md#deleteData) | **DELETE** /api/v1/projects/{id}/modeldata | Delete project model data.
[**deleteProject**](ProjectApi.md#deleteProject) | **DELETE** /api/v1/projects/{id} | Delete a project.
[**downloadProjectData**](ProjectApi.md#downloadProjectData) | **GET** /api/v1/projects/{id}/data | Download project data.
[**getProject**](ProjectApi.md#getProject) | **GET** /api/v1/projects/{id} | Get a project.
[**getProjects**](ProjectApi.md#getProjects) | **GET** /api/v1/projects | Get list of projects.
[**updateProject**](ProjectApi.md#updateProject) | **PUT** /api/v1/projects/{id} | Update project .
[**uploadProjectData**](ProjectApi.md#uploadProjectData) | **POST** /api/v1/projects/{id}/modeldata | Upload project data.
[**uploadProjectFile**](ProjectApi.md#uploadProjectFile) | **POST** /api/v1/projects/{id}/files | Upload a file to the project and return a reference.
[**useModel**](ProjectApi.md#useModel) | **GET** /api/v1/projects/{id}/usemodel | Use an existing model to configure the project.
[**verifyProject**](ProjectApi.md#verifyProject) | **PUT** /api/v1/projects/{id}/verify | Start the model verification process.


<a name="addProject"></a>
# **addProject**
> ProjectResponse addProject(organizationId, project)

Add a project to an organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val organizationId : kotlin.Long = 789 // kotlin.Long | The organization ID.
val project : ProjectRequest =  // ProjectRequest | project
try {
    val result : ProjectResponse = apiInstance.addProject(organizationId, project)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#addProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#addProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **kotlin.Long**| The organization ID. |
 **project** | [**ProjectRequest**](ProjectRequest.md)| project |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyProject"></a>
# **copyProject**
> ProjectResponse copyProject(id, newProject, destOrgId)

Make a copy of the project available to (optionally) another organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val newProject : ProjectRequest =  // ProjectRequest | Optional new project information.
val destOrgId : kotlin.Long = 789 // kotlin.Long | The optional destination organization id.
try {
    val result : ProjectResponse = apiInstance.copyProject(id, newProject, destOrgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#copyProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#copyProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **newProject** | [**ProjectRequest**](ProjectRequest.md)| Optional new project information. |
 **destOrgId** | **kotlin.Long**| The optional destination organization id. | [optional]

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyProjectModel"></a>
# **copyProjectModel**
> copyProjectModel(id, model, destModelId)

Make a copy of the project model available to the organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val model : ModelRequest =  // ModelRequest | New model information.
val destModelId : kotlin.Long = 789 // kotlin.Long | The optional destination model id.
try {
    apiInstance.copyProjectModel(id, model, destModelId)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#copyProjectModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#copyProjectModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **model** | [**ModelRequest**](ModelRequest.md)| New model information. |
 **destModelId** | **kotlin.Long**| The optional destination model id. | [optional]

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteData"></a>
# **deleteData**
> ProjectResponse deleteData(id, dataType)

Delete project model data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val dataType : kotlin.String = dataType_example // kotlin.String | dataType
try {
    val result : ProjectResponse = apiInstance.deleteData(id, dataType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#deleteData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#deleteData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **dataType** | **kotlin.String**| dataType | [enum: Model, WrapperScript]

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(id)

Delete a project.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
try {
    apiInstance.deleteProject(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#deleteProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#deleteProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadProjectData"></a>
# **downloadProjectData**
> java.io.File downloadProjectData(id, dataType)

Download project data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val dataType : kotlin.String = dataType_example // kotlin.String | dataType
try {
    val result : java.io.File = apiInstance.downloadProjectData(id, dataType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#downloadProjectData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#downloadProjectData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **dataType** | **kotlin.String**| dataType | [enum: Model, WrapperScript]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> ProjectResponse getProject(id)

Get a project.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
try {
    val result : ProjectResponse = apiInstance.getProject(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> kotlin.collections.List&lt;ProjectResponse&gt; getProjects(organizationId)

Get list of projects.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val organizationId : kotlin.Long = 789 // kotlin.Long | The optional organization ID.
try {
    val result : kotlin.collections.List<ProjectResponse> = apiInstance.getProjects(organizationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProjects")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **kotlin.Long**| The optional organization ID. | [optional]

### Return type

[**kotlin.collections.List&lt;ProjectResponse&gt;**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> ProjectResponse updateProject(id, projectRequest)

Update project .

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val projectRequest : ProjectRequest =  // ProjectRequest | projectRequest
try {
    val result : ProjectResponse = apiInstance.updateProject(id, projectRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#updateProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#updateProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **projectRequest** | [**ProjectRequest**](ProjectRequest.md)| projectRequest |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadProjectData"></a>
# **uploadProjectData**
> ProjectResponse uploadProjectData(id, dataType, file)

Upload project data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val dataType : kotlin.String = dataType_example // kotlin.String | dataType
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : ProjectResponse = apiInstance.uploadProjectData(id, dataType, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#uploadProjectData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#uploadProjectData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **dataType** | **kotlin.String**| dataType | [enum: Model, WrapperScript]
 **file** | **java.io.File**|  | [optional]

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadProjectFile"></a>
# **uploadProjectFile**
> kotlin.String uploadProjectFile(id, type, file)

Upload a file to the project and return a reference.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val type : kotlin.String = type_example // kotlin.String | Upload type - 'transform' for transform parameters
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.uploadProjectFile(id, type, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#uploadProjectFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#uploadProjectFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **type** | **kotlin.String**| Upload type - &#39;transform&#39; for transform parameters |
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

<a name="useModel"></a>
# **useModel**
> ProjectResponse useModel(id, modelId)

Use an existing model to configure the project.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
val modelId : kotlin.Long = 789 // kotlin.Long | The model ID.
try {
    val result : ProjectResponse = apiInstance.useModel(id, modelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#useModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#useModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |
 **modelId** | **kotlin.Long**| The model ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyProject"></a>
# **verifyProject**
> ProjectResponse verifyProject(id)

Start the model verification process.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ProjectApi()
val id : kotlin.Long = 789 // kotlin.Long | The project ID.
try {
    val result : ProjectResponse = apiInstance.verifyProject(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#verifyProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#verifyProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The project ID. |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

