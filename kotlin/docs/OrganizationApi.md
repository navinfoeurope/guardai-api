# OrganizationApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrganization**](OrganizationApi.md#addOrganization) | **POST** /api/v1/organizations | Add organization.
[**copyOrganization**](OrganizationApi.md#copyOrganization) | **POST** /api/v1/organizations/{id}/copy | Make a copy of the organization to another organization (requires admin permissions).
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** /api/v1/organizations/{id} | Delete an organization.
[**deleteOrganizationFile**](OrganizationApi.md#deleteOrganizationFile) | **DELETE** /api/v1/organizations/{id}/file | Delete organization file.
[**downloadOrganizationFile**](OrganizationApi.md#downloadOrganizationFile) | **GET** /api/v1/organizations/{id}/file | Download organization file.
[**getAssetDefinitions**](OrganizationApi.md#getAssetDefinitions) | **GET** /api/v1/organizations/{id}/assets | Get the assets defined for this organization.
[**getDefinedHPO**](OrganizationApi.md#getDefinedHPO) | **GET** /api/v1/organizations/{id}/hpo | Get the hyper-parameter optimization methods defined for this organization.
[**getDefinedTransforms**](OrganizationApi.md#getDefinedTransforms) | **GET** /api/v1/organizations/{id}/transforms | Get the transforms defined for this organization.
[**getMembers**](OrganizationApi.md#getMembers) | **GET** /api/v1/organizations/{id}/members | Get all members (admin access rights required).
[**getOrganization**](OrganizationApi.md#getOrganization) | **GET** /api/v1/organizations/{id} | Get organization by id.
[**getOrganizationFileUsage**](OrganizationApi.md#getOrganizationFileUsage) | **GET** /api/v1/organizations/{id}/file/usage | Get organization file project usage.
[**getOrganizations**](OrganizationApi.md#getOrganizations) | **GET** /api/v1/organizations | Get all organizations - (requires admin permissions).
[**renameOrganizationFile**](OrganizationApi.md#renameOrganizationFile) | **PUT** /api/v1/organizations/{id}/file | Rename organization file.
[**updateOrgStats**](OrganizationApi.md#updateOrgStats) | **GET** /api/v1/organizations/{id}/stat | Update storage and accounting information for this organization (admin rights).
[**updateOrganization**](OrganizationApi.md#updateOrganization) | **PUT** /api/v1/organizations/{id} | Update organization.
[**uploadOrganizationFile**](OrganizationApi.md#uploadOrganizationFile) | **POST** /api/v1/organizations/{id}/file | Upload a file to the organization and return a reference.


<a name="addOrganization"></a>
# **addOrganization**
> OrganizationResponse addOrganization(organization)

Add organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val organization : OrganizationRequest =  // OrganizationRequest | organization
try {
    val result : OrganizationResponse = apiInstance.addOrganization(organization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#addOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#addOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**OrganizationRequest**](OrganizationRequest.md)| organization |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyOrganization"></a>
# **copyOrganization**
> OrganizationResponse copyOrganization(id, organizationRequest)

Make a copy of the organization to another organization (requires admin permissions).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val organizationRequest : OrganizationRequest =  // OrganizationRequest | Optional new organization information.
try {
    val result : OrganizationResponse = apiInstance.copyOrganization(id, organizationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#copyOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#copyOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **organizationRequest** | [**OrganizationRequest**](OrganizationRequest.md)| Optional new organization information. |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(id)

Delete an organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteOrganization(id)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#deleteOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#deleteOrganization")
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

<a name="deleteOrganizationFile"></a>
# **deleteOrganizationFile**
> deleteOrganizationFile(id, ref, type)

Delete organization file.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | File type - i.e. 'classmapping'
try {
    apiInstance.deleteOrganizationFile(id, ref, type)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#deleteOrganizationFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#deleteOrganizationFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| File type - i.e. &#39;classmapping&#39; |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadOrganizationFile"></a>
# **downloadOrganizationFile**
> java.io.File downloadOrganizationFile(id, ref, type)

Download organization file.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | Download type - i.e. 'classmapping'
try {
    val result : java.io.File = apiInstance.downloadOrganizationFile(id, ref, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#downloadOrganizationFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#downloadOrganizationFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| Download type - i.e. &#39;classmapping&#39; |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetDefinitions"></a>
# **getAssetDefinitions**
> AssetsResponse getAssetDefinitions(id)

Get the assets defined for this organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    val result : AssetsResponse = apiInstance.getAssetDefinitions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getAssetDefinitions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getAssetDefinitions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |

### Return type

[**AssetsResponse**](AssetsResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDefinedHPO"></a>
# **getDefinedHPO**
> kotlin.collections.List&lt;HPODefinition&gt; getDefinedHPO(id)

Get the hyper-parameter optimization methods defined for this organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.collections.List<HPODefinition> = apiInstance.getDefinedHPO(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getDefinedHPO")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getDefinedHPO")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.collections.List&lt;HPODefinition&gt;**](HPODefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDefinedTransforms"></a>
# **getDefinedTransforms**
> kotlin.collections.List&lt;TransformDefinition&gt; getDefinedTransforms(id)

Get the transforms defined for this organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.collections.List<TransformDefinition> = apiInstance.getDefinedTransforms(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getDefinedTransforms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getDefinedTransforms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.collections.List&lt;TransformDefinition&gt;**](TransformDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMembers"></a>
# **getMembers**
> kotlin.collections.List&lt;UserResponse&gt; getMembers(id)

Get all members (admin access rights required).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.collections.List<UserResponse> = apiInstance.getMembers(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.collections.List&lt;UserResponse&gt;**](UserResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganization"></a>
# **getOrganization**
> OrganizationResponse getOrganization(id)

Get organization by id.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : OrganizationResponse = apiInstance.getOrganization(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationFileUsage"></a>
# **getOrganizationFileUsage**
> kotlin.collections.List&lt;kotlin.Long&gt; getOrganizationFileUsage(id, ref, type)

Get organization file project usage.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | File type - i.e. 'classmapping'
try {
    val result : kotlin.collections.List<kotlin.Long> = apiInstance.getOrganizationFileUsage(id, ref, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getOrganizationFileUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getOrganizationFileUsage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| File type - i.e. &#39;classmapping&#39; |

### Return type

**kotlin.collections.List&lt;kotlin.Long&gt;**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizations"></a>
# **getOrganizations**
> kotlin.collections.List&lt;OrganizationResponse&gt; getOrganizations()

Get all organizations - (requires admin permissions).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
try {
    val result : kotlin.collections.List<OrganizationResponse> = apiInstance.getOrganizations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getOrganizations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getOrganizations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;OrganizationResponse&gt;**](OrganizationResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="renameOrganizationFile"></a>
# **renameOrganizationFile**
> renameOrganizationFile(id, name, ref, type)

Rename organization file.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val name : kotlin.String = name_example // kotlin.String | File name
val ref : kotlin.String = ref_example // kotlin.String | File reference
val type : kotlin.String = type_example // kotlin.String | File type - i.e. 'classmapping'
try {
    apiInstance.renameOrganizationFile(id, name, ref, type)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#renameOrganizationFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#renameOrganizationFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **name** | **kotlin.String**| File name |
 **ref** | **kotlin.String**| File reference |
 **type** | **kotlin.String**| File type - i.e. &#39;classmapping&#39; |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateOrgStats"></a>
# **updateOrgStats**
> updateOrgStats(id)

Update storage and accounting information for this organization (admin rights).

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
try {
    apiInstance.updateOrgStats(id)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#updateOrgStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#updateOrgStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateOrganization"></a>
# **updateOrganization**
> OrganizationResponse updateOrganization(id, request)

Update organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | id
val request : OrganizationRequest =  // OrganizationRequest | request
try {
    val result : OrganizationResponse = apiInstance.updateOrganization(id, request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#updateOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#updateOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |
 **request** | [**OrganizationRequest**](OrganizationRequest.md)| request |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadOrganizationFile"></a>
# **uploadOrganizationFile**
> kotlin.String uploadOrganizationFile(id, type, datasetId, ref, file)

Upload a file to the organization and return a reference.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = OrganizationApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val type : kotlin.String = type_example // kotlin.String | Upload type - i.e. 'classmapping'
val datasetId : kotlin.Long = 789 // kotlin.Long | The dataset ID.
val ref : kotlin.String = ref_example // kotlin.String | Reference (supplied when updating)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.uploadOrganizationFile(id, type, datasetId, ref, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#uploadOrganizationFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#uploadOrganizationFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **type** | **kotlin.String**| Upload type - i.e. &#39;classmapping&#39; |
 **datasetId** | **kotlin.Long**| The dataset ID. | [optional]
 **ref** | **kotlin.String**| Reference (supplied when updating) | [optional]
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

