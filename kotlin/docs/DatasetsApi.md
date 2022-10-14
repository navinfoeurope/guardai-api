# DatasetsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyDataset**](DatasetsApi.md#copyDataset) | **POST** /api/v1/datasets/{id}/copy | Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.
[**deleteCustomDataset**](DatasetsApi.md#deleteCustomDataset) | **DELETE** /api/v1/datasets/{id}/{orgId} | Delete dataset.
[**downloadDataset**](DatasetsApi.md#downloadDataset) | **GET** /api/v1/datasets/{id}/{orgId}/data | Download dataset data.
[**getDataset**](DatasetsApi.md#getDataset) | **GET** /api/v1/datasets/{id}/{orgId} | Get dataset.
[**getDatasetClasses**](DatasetsApi.md#getDatasetClasses) | **GET** /api/v1/datasets/{id}/{orgId}/classes | Retrieve dataset classes (coco dataset supported).
[**getDatasetItem**](DatasetsApi.md#getDatasetItem) | **GET** /api/v1/datasets/{id}/{idx}/item | Get an item from the dataset.
[**getDatasetTarget**](DatasetsApi.md#getDatasetTarget) | **GET** /api/v1/datasets/{id}/{idx}/target | Get a target from the dataset.
[**getDatasets**](DatasetsApi.md#getDatasets) | **GET** /api/v1/datasets/{orgId} | Get the datasets defined for this organization.
[**updateCustomDataset**](DatasetsApi.md#updateCustomDataset) | **PUT** /api/v1/datasets/{id}/{orgId} | Update dataset.
[**uploadDataset**](DatasetsApi.md#uploadDataset) | **POST** /api/v1/datasets/{orgId} | Upload dataset.
[**uploadDatasetFile**](DatasetsApi.md#uploadDatasetFile) | **POST** /api/v1/datasets/{id}/file | Upload a file to the dataset and return a reference.


<a name="copyDataset"></a>
# **copyDataset**
> DataSet copyDataset(id, orgId)

Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val orgId : kotlin.Long = 789 // kotlin.Long | Optional organization ID to copy to.
try {
    val result : DataSet = apiInstance.copyDataset(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#copyDataset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#copyDataset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **orgId** | **kotlin.Long**| Optional organization ID to copy to. | [optional]

### Return type

[**DataSet**](DataSet.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomDataset"></a>
# **deleteCustomDataset**
> kotlin.collections.List&lt;DataSet&gt; deleteCustomDataset(id, orgId)

Delete dataset.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    val result : kotlin.collections.List<DataSet> = apiInstance.deleteCustomDataset(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#deleteCustomDataset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#deleteCustomDataset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **orgId** | **kotlin.Long**| The organization ID. |

### Return type

[**kotlin.collections.List&lt;DataSet&gt;**](DataSet.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadDataset"></a>
# **downloadDataset**
> java.io.File downloadDataset(id, orgId)

Download dataset data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    val result : java.io.File = apiInstance.downloadDataset(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#downloadDataset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#downloadDataset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **orgId** | **kotlin.Long**| The organization ID. |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataset"></a>
# **getDataset**
> DataSet getDataset(id, orgId)

Get dataset.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    val result : DataSet = apiInstance.getDataset(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#getDataset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#getDataset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **orgId** | **kotlin.Long**| The organization ID. |

### Return type

[**DataSet**](DataSet.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetClasses"></a>
# **getDatasetClasses**
> kotlin.collections.List&lt;kotlin.String&gt; getDatasetClasses(id, orgId)

Retrieve dataset classes (coco dataset supported).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.getDatasetClasses(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#getDatasetClasses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#getDatasetClasses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **orgId** | **kotlin.Long**| The organization ID. |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetItem"></a>
# **getDatasetItem**
> java.io.File getDatasetItem(id, idx)

Get an item from the dataset.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val idx : kotlin.Long = 789 // kotlin.Long | The item index.
try {
    val result : java.io.File = apiInstance.getDatasetItem(id, idx)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#getDatasetItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#getDatasetItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **idx** | **kotlin.Long**| The item index. |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetTarget"></a>
# **getDatasetTarget**
> DatasetTarget getDatasetTarget(id, idx)

Get a target from the dataset.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val idx : kotlin.Long = 789 // kotlin.Long | The item index.
try {
    val result : DatasetTarget = apiInstance.getDatasetTarget(id, idx)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#getDatasetTarget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#getDatasetTarget")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **idx** | **kotlin.Long**| The item index. |

### Return type

[**DatasetTarget**](DatasetTarget.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasets"></a>
# **getDatasets**
> kotlin.collections.List&lt;DataSet&gt; getDatasets(orgId)

Get the datasets defined for this organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    val result : kotlin.collections.List<DataSet> = apiInstance.getDatasets(orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#getDatasets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#getDatasets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.Long**| The organization ID. |

### Return type

[**kotlin.collections.List&lt;DataSet&gt;**](DataSet.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomDataset"></a>
# **updateCustomDataset**
> kotlin.collections.List&lt;DataSet&gt; updateCustomDataset(id, orgId, datasetRequest)

Update dataset.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
val datasetRequest : DatasetRequest =  // DatasetRequest | The dataset update request.
try {
    val result : kotlin.collections.List<DataSet> = apiInstance.updateCustomDataset(id, orgId, datasetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#updateCustomDataset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#updateCustomDataset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **orgId** | **kotlin.Long**| The organization ID. |
 **datasetRequest** | [**DatasetRequest**](DatasetRequest.md)| The dataset update request. |

### Return type

[**kotlin.collections.List&lt;DataSet&gt;**](DataSet.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadDataset"></a>
# **uploadDataset**
> kotlin.collections.List&lt;DataSet&gt; uploadDataset(orgId, description, format, name, file)

Upload dataset.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
val description : kotlin.String = description_example // kotlin.String | description
val format : kotlin.String = format_example // kotlin.String | format
val name : kotlin.String = name_example // kotlin.String | name
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.collections.List<DataSet> = apiInstance.uploadDataset(orgId, description, format, name, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#uploadDataset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#uploadDataset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.Long**| The organization ID. |
 **description** | **kotlin.String**| description |
 **format** | **kotlin.String**| format |
 **name** | **kotlin.String**| name |
 **file** | **java.io.File**|  | [optional]

### Return type

[**kotlin.collections.List&lt;DataSet&gt;**](DataSet.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadDatasetFile"></a>
# **uploadDatasetFile**
> kotlin.String uploadDatasetFile(id, type, orgId, file)

Upload a file to the dataset and return a reference.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = DatasetsApi()
val id : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val type : kotlin.String = type_example // kotlin.String | Upload type - i.e. 'transform' for transform parameters
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.uploadDatasetFile(id, type, orgId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatasetsApi#uploadDatasetFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatasetsApi#uploadDatasetFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The dataset ID. |
 **type** | **kotlin.String**| Upload type - i.e. &#39;transform&#39; for transform parameters |
 **orgId** | **kotlin.Long**| The organization ID. | [optional]
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

