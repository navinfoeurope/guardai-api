# TestApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDefense**](TestApi.md#addDefense) | **POST** /api/v1/tests/{testId}/defense | Add defense.
[**addFilter**](TestApi.md#addFilter) | **POST** /api/v1/tests/{id}/filter | Add a filter.
[**addTest**](TestApi.md#addTest) | **POST** /api/v1/tests | Add a new test.
[**deleteTest**](TestApi.md#deleteTest) | **DELETE** /api/v1/tests/{id} | Delete a test.
[**getDefenses**](TestApi.md#getDefenses) | **GET** /api/v1/tests/{testId}/defenses | Get defenses.
[**getStatus**](TestApi.md#getStatus) | **GET** /api/v1/tests/{testId}/status | Get test status.
[**getTests**](TestApi.md#getTests) | **GET** /api/v1/tests | Get tests for a project.
[**removeDefense**](TestApi.md#removeDefense) | **DELETE** /api/v1/tests/{testId}/defense/{id} | Remove defense.
[**removeFilter**](TestApi.md#removeFilter) | **DELETE** /api/v1/tests/{testId}/filter/{id} | Remove a filter.
[**startTest**](TestApi.md#startTest) | **GET** /api/v1/tests/{testId}/start | Start a test.
[**stopTest**](TestApi.md#stopTest) | **GET** /api/v1/tests/{id}/stop | Stop all the running jobs in a test.
[**updateStatus**](TestApi.md#updateStatus) | **PUT** /api/v1/tests/{testId}/status | Update test status - can only be called by worker instance.
[**updateTest**](TestApi.md#updateTest) | **PUT** /api/v1/tests/{id} | Update test.
[**updateTestRun**](TestApi.md#updateTestRun) | **PUT** /api/v1/tests/testrun/{id} | Update test run.


<a name="addDefense"></a>
# **addDefense**
> TestResponse addDefense(testId, defenseRequest)

Add defense.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val testId : kotlin.Long = 789 // kotlin.Long | The test id.
val defenseRequest : DefenseRequest =  // DefenseRequest | The defense object
try {
    val result : TestResponse = apiInstance.addDefense(testId, defenseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#addDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#addDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| The test id. |
 **defenseRequest** | [**DefenseRequest**](DefenseRequest.md)| The defense object |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFilter"></a>
# **addFilter**
> TestResponse addFilter(id, attackRequest)

Add a filter.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | The test id.
val attackRequest : FilterRequest =  // FilterRequest | attackRequest
try {
    val result : TestResponse = apiInstance.addFilter(id, attackRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#addFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#addFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The test id. |
 **attackRequest** | [**FilterRequest**](FilterRequest.md)| attackRequest |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTest"></a>
# **addTest**
> TestResponse addTest(test)

Add a new test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val test : TestRequest =  // TestRequest | test
try {
    val result : TestResponse = apiInstance.addTest(test)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#addTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#addTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test** | [**TestRequest**](TestRequest.md)| test |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTest"></a>
# **deleteTest**
> deleteTest(id)

Delete a test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteTest(id)
} catch (e: ClientException) {
    println("4xx response calling TestApi#deleteTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#deleteTest")
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

<a name="getDefenses"></a>
# **getDefenses**
> kotlin.collections.List&lt;DefenseResponse&gt; getDefenses(testId)

Get defenses.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val testId : kotlin.Long = 789 // kotlin.Long | testId
try {
    val result : kotlin.collections.List<DefenseResponse> = apiInstance.getDefenses(testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#getDefenses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#getDefenses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| testId |

### Return type

[**kotlin.collections.List&lt;DefenseResponse&gt;**](DefenseResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> TestResponse getStatus(testId)

Get test status.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val testId : kotlin.Long = 789 // kotlin.Long | testId
try {
    val result : TestResponse = apiInstance.getStatus(testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#getStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#getStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| testId |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTests"></a>
# **getTests**
> kotlin.collections.List&lt;TestResponse&gt; getTests(projectId)

Get tests for a project.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val projectId : kotlin.Long = 789 // kotlin.Long | The project id.
try {
    val result : kotlin.collections.List<TestResponse> = apiInstance.getTests(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#getTests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#getTests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Long**| The project id. |

### Return type

[**kotlin.collections.List&lt;TestResponse&gt;**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDefense"></a>
# **removeDefense**
> TestResponse removeDefense(id, testId)

Remove defense.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | The defense id.
val testId : kotlin.Long = 789 // kotlin.Long | The test id.
try {
    val result : TestResponse = apiInstance.removeDefense(id, testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#removeDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#removeDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The defense id. |
 **testId** | **kotlin.Long**| The test id. |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeFilter"></a>
# **removeFilter**
> TestResponse removeFilter(id, testId)

Remove a filter.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | The filter id.
val testId : kotlin.Long = 789 // kotlin.Long | The test id.
try {
    val result : TestResponse = apiInstance.removeFilter(id, testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#removeFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#removeFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The filter id. |
 **testId** | **kotlin.Long**| The test id. |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startTest"></a>
# **startTest**
> startTest(testId)

Start a test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val testId : kotlin.Long = 789 // kotlin.Long | The test id.
try {
    apiInstance.startTest(testId)
} catch (e: ClientException) {
    println("4xx response calling TestApi#startTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#startTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| The test id. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopTest"></a>
# **stopTest**
> stopTest(id)

Stop all the running jobs in a test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.stopTest(id)
} catch (e: ClientException) {
    println("4xx response calling TestApi#stopTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#stopTest")
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

<a name="updateStatus"></a>
# **updateStatus**
> kotlin.Boolean updateStatus(testId, runId, taskId, status)

Update test status - can only be called by worker instance.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val testId : kotlin.Long = 789 // kotlin.Long | testId
val runId : kotlin.Long = 789 // kotlin.Long | runId
val taskId : kotlin.Long = 789 // kotlin.Long | taskId
val status : StatusRequest =  // StatusRequest | status
try {
    val result : kotlin.Boolean = apiInstance.updateStatus(testId, runId, taskId, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#updateStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#updateStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| testId |
 **runId** | **kotlin.Long**| runId |
 **taskId** | **kotlin.Long**| taskId |
 **status** | [**StatusRequest**](StatusRequest.md)| status |

### Return type

**kotlin.Boolean**

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTest"></a>
# **updateTest**
> TestResponse updateTest(id, testRequest)

Update test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | The test ID.
val testRequest : TestRequest =  // TestRequest | testRequest
try {
    val result : TestResponse = apiInstance.updateTest(id, testRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#updateTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#updateTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The test ID. |
 **testRequest** | [**TestRequest**](TestRequest.md)| testRequest |

### Return type

[**TestResponse**](TestResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTestRun"></a>
# **updateTestRun**
> TestRunResponse updateTestRun(id, request)

Update test run.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = TestApi()
val id : kotlin.Long = 789 // kotlin.Long | The test run ID.
val request : TestRunRequest =  // TestRunRequest | request
try {
    val result : TestRunResponse = apiInstance.updateTestRun(id, request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#updateTestRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#updateTestRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The test run ID. |
 **request** | [**TestRunRequest**](TestRunRequest.md)| request |

### Return type

[**TestRunResponse**](TestRunResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

