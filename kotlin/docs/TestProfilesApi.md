# TestProfilesApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProfile**](TestProfilesApi.md#addProfile) | **POST** /api/v1/profiles/{testId} | Add a profile to an organization using the provided test id as a template.
[**addTestProfileDefense**](TestProfilesApi.md#addTestProfileDefense) | **PUT** /api/v1/profiles/{id}/adddefense | Add a defense to the profile
[**addTestProfileFilter**](TestProfilesApi.md#addTestProfileFilter) | **PUT** /api/v1/profiles/{id}/addfilter | Add a filter to the profile
[**copyProfile**](TestProfilesApi.md#copyProfile) | **POST** /api/v1/profiles/{id}/copy | Make a copy of a profile. To copy to a different organization, extra permissions are required.
[**createTestProfile**](TestProfilesApi.md#createTestProfile) | **POST** /api/v1/profiles | Create a new test profile
[**deleteProfile**](TestProfilesApi.md#deleteProfile) | **DELETE** /api/v1/profiles/{id} | Delete a profile by ID.
[**getTestProfile**](TestProfilesApi.md#getTestProfile) | **GET** /api/v1/profiles/{id} | Get the test profile.
[**getTestProfiles**](TestProfilesApi.md#getTestProfiles) | **GET** /api/v1/profiles | Get the profiles available for this user.
[**removeTestProfileDefense**](TestProfilesApi.md#removeTestProfileDefense) | **DELETE** /api/v1/profiles/{id}/defense/{defenseId} | Remove defense from test profile.
[**updateTestProfile**](TestProfilesApi.md#updateTestProfile) | **PUT** /api/v1/profiles/{id} | Update profile by ID.


<a name="addProfile"></a>
# **addProfile**
> TestProfileResponse addProfile(testId, id, name)

Add a profile to an organization using the provided test id as a template.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val testId : kotlin.Long = 789 // kotlin.Long | The test ID from which the settings will be copied.
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val name : kotlin.String = name_example // kotlin.String | The profile name.
try {
    val result : TestProfileResponse = apiInstance.addProfile(testId, id, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#addProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#addProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| The test ID from which the settings will be copied. |
 **id** | **kotlin.Long**| The organization ID. |
 **name** | **kotlin.String**| The profile name. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addTestProfileDefense"></a>
# **addTestProfileDefense**
> TestProfileResponse addTestProfileDefense(id, defense)

Add a defense to the profile

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
val defense : DefenseRequest =  // DefenseRequest | The defense object
try {
    val result : TestProfileResponse = apiInstance.addTestProfileDefense(id, defense)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#addTestProfileDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#addTestProfileDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The profile ID. |
 **defense** | [**DefenseRequest**](DefenseRequest.md)| The defense object |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTestProfileFilter"></a>
# **addTestProfileFilter**
> TestProfileResponse addTestProfileFilter(id, filter)

Add a filter to the profile

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
val filter : FilterRequest =  // FilterRequest | The filter to add.
try {
    val result : TestProfileResponse = apiInstance.addTestProfileFilter(id, filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#addTestProfileFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#addTestProfileFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The profile ID. |
 **filter** | [**FilterRequest**](FilterRequest.md)| The filter to add. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyProfile"></a>
# **copyProfile**
> TestProfileResponse copyProfile(id, orgId)

Make a copy of a profile. To copy to a different organization, extra permissions are required.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
val orgId : kotlin.Long = 789 // kotlin.Long | Optional destination organization ID to copy to.
try {
    val result : TestProfileResponse = apiInstance.copyProfile(id, orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#copyProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#copyProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The profile ID. |
 **orgId** | **kotlin.Long**| Optional destination organization ID to copy to. | [optional]

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTestProfile"></a>
# **createTestProfile**
> TestProfileResponse createTestProfile(orgId, profile)

Create a new test profile

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val orgId : kotlin.Long = 789 // kotlin.Long | The organization ID.
val profile : TestProfileRequest =  // TestProfileRequest | The profile object.
try {
    val result : TestProfileResponse = apiInstance.createTestProfile(orgId, profile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#createTestProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#createTestProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.Long**| The organization ID. |
 **profile** | [**TestProfileRequest**](TestProfileRequest.md)| The profile object. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProfile"></a>
# **deleteProfile**
> deleteProfile(id)

Delete a profile by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
try {
    apiInstance.deleteProfile(id)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#deleteProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#deleteProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The profile ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTestProfile"></a>
# **getTestProfile**
> TestProfileResponse getTestProfile(id)

Get the test profile.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
try {
    val result : TestProfileResponse = apiInstance.getTestProfile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#getTestProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#getTestProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The profile ID. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestProfiles"></a>
# **getTestProfiles**
> kotlin.collections.List&lt;TestProfileResponse&gt; getTestProfiles()

Get the profiles available for this user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
try {
    val result : kotlin.collections.List<TestProfileResponse> = apiInstance.getTestProfiles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#getTestProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#getTestProfiles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TestProfileResponse&gt;**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeTestProfileDefense"></a>
# **removeTestProfileDefense**
> TestProfileResponse removeTestProfileDefense(defenseId, id)

Remove defense from test profile.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val defenseId : kotlin.Long = 789 // kotlin.Long | The defense ID.
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
try {
    val result : TestProfileResponse = apiInstance.removeTestProfileDefense(defenseId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#removeTestProfileDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#removeTestProfileDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defenseId** | **kotlin.Long**| The defense ID. |
 **id** | **kotlin.Long**| The profile ID. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTestProfile"></a>
# **updateTestProfile**
> TestProfileResponse updateTestProfile(id, profile)

Update profile by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestProfilesApi()
val id : kotlin.Long = 789 // kotlin.Long | The profile ID.
val profile : TestProfileRequest =  // TestProfileRequest | The profile update request.
try {
    val result : TestProfileResponse = apiInstance.updateTestProfile(id, profile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestProfilesApi#updateTestProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestProfilesApi#updateTestProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The profile ID. |
 **profile** | [**TestProfileRequest**](TestProfileRequest.md)| The profile update request. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

