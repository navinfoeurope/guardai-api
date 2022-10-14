# BenchmarkApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBenchmark**](BenchmarkApi.md#addBenchmark) | **POST** /api/v1/benchmarks | Add a benchmark to an organization.
[**addBenchmarkTest**](BenchmarkApi.md#addBenchmarkTest) | **POST** /api/v1/benchmarks/{id}/addtest | Add new test.
[**addBenchmarkTestDefense**](BenchmarkApi.md#addBenchmarkTestDefense) | **POST** /api/v1/benchmarks/{id}/{testId}/defense | Add defense to benchmark test.
[**addBenchmarkTestFilter**](BenchmarkApi.md#addBenchmarkTestFilter) | **POST** /api/v1/benchmarks/{id}/{testId}/filter | Add filter to benchmark test.
[**deleteBenchmark**](BenchmarkApi.md#deleteBenchmark) | **DELETE** /api/v1/benchmarks/{id} | Delete a benchmark.
[**deleteBenchmarkTest**](BenchmarkApi.md#deleteBenchmarkTest) | **DELETE** /api/v1/benchmarks/{id}/{testId} | Delete a benchmark test.
[**getBenchmark**](BenchmarkApi.md#getBenchmark) | **GET** /api/v1/benchmarks/{id} | Get a benchmark.
[**getBenchmarkTestStatus**](BenchmarkApi.md#getBenchmarkTestStatus) | **GET** /api/v1/benchmarks/{id}/{testId}/status | Get benchmark test status.
[**getBenchmarks**](BenchmarkApi.md#getBenchmarks) | **GET** /api/v1/benchmarks | Get list of benchmarks.
[**removeBenchmarkFilter**](BenchmarkApi.md#removeBenchmarkFilter) | **DELETE** /api/v1/benchmarks/{id}/{testId}/{filterId} | Remove filter from benchmark test.
[**removeBenchmarkTestDefense**](BenchmarkApi.md#removeBenchmarkTestDefense) | **DELETE** /api/v1/benchmarks/{id}/{testId}/defense/{defenseId} | Remove defense from benchmark test.
[**startBenchmarkTest**](BenchmarkApi.md#startBenchmarkTest) | **GET** /api/v1/benchmarks/{id}/{testId}/start | Start a benchmark test.
[**stopBenchmarkTest**](BenchmarkApi.md#stopBenchmarkTest) | **GET** /api/v1/benchmarks/{id}/{testId}/stop | Stop a benchmark test.
[**updateBenchmark**](BenchmarkApi.md#updateBenchmark) | **PUT** /api/v1/benchmarks/{id} | Update benchmark.
[**updateBenchmarkTest**](BenchmarkApi.md#updateBenchmarkTest) | **PUT** /api/v1/benchmarks/{id}/{testId} | Update test.


<a name="addBenchmark"></a>
# **addBenchmark**
> BenchmarkResponse addBenchmark(organizationId, benchmarkRequest)

Add a benchmark to an organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val organizationId : kotlin.Long = 789 // kotlin.Long | The organization ID.
val benchmarkRequest : BenchmarkRequest =  // BenchmarkRequest | benchmarkRequest
try {
    val result : BenchmarkResponse = apiInstance.addBenchmark(organizationId, benchmarkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#addBenchmark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#addBenchmark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **kotlin.Long**| The organization ID. |
 **benchmarkRequest** | [**BenchmarkRequest**](BenchmarkRequest.md)| benchmarkRequest |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBenchmarkTest"></a>
# **addBenchmarkTest**
> BenchmarkResponse addBenchmarkTest(id, name)

Add new test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val name : kotlin.String = name_example // kotlin.String | name
try {
    val result : BenchmarkResponse = apiInstance.addBenchmarkTest(id, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#addBenchmarkTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#addBenchmarkTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **name** | **kotlin.String**| name |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addBenchmarkTestDefense"></a>
# **addBenchmarkTestDefense**
> BenchmarkTest addBenchmarkTestDefense(id, testId, defense)

Add defense to benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
val defense : DefenseRequest =  // DefenseRequest | The defense.
try {
    val result : BenchmarkTest = apiInstance.addBenchmarkTestDefense(id, testId, defense)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#addBenchmarkTestDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#addBenchmarkTestDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |
 **defense** | [**DefenseRequest**](DefenseRequest.md)| The defense. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBenchmarkTestFilter"></a>
# **addBenchmarkTestFilter**
> BenchmarkTest addBenchmarkTestFilter(id, testId, filterRequest)

Add filter to benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
val filterRequest : FilterRequest =  // FilterRequest | filterRequest
try {
    val result : BenchmarkTest = apiInstance.addBenchmarkTestFilter(id, testId, filterRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#addBenchmarkTestFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#addBenchmarkTestFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |
 **filterRequest** | [**FilterRequest**](FilterRequest.md)| filterRequest |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBenchmark"></a>
# **deleteBenchmark**
> deleteBenchmark(id)

Delete a benchmark.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
try {
    apiInstance.deleteBenchmark(id)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#deleteBenchmark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#deleteBenchmark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBenchmarkTest"></a>
# **deleteBenchmarkTest**
> BenchmarkResponse deleteBenchmarkTest(id, testId)

Delete a benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
try {
    val result : BenchmarkResponse = apiInstance.deleteBenchmarkTest(id, testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#deleteBenchmarkTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#deleteBenchmarkTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBenchmark"></a>
# **getBenchmark**
> BenchmarkResponse getBenchmark(id)

Get a benchmark.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
try {
    val result : BenchmarkResponse = apiInstance.getBenchmark(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#getBenchmark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#getBenchmark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBenchmarkTestStatus"></a>
# **getBenchmarkTestStatus**
> BenchmarkTestStatusResponse getBenchmarkTestStatus(id, testId)

Get benchmark test status.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
try {
    val result : BenchmarkTestStatusResponse = apiInstance.getBenchmarkTestStatus(id, testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#getBenchmarkTestStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#getBenchmarkTestStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |

### Return type

[**BenchmarkTestStatusResponse**](BenchmarkTestStatusResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBenchmarks"></a>
# **getBenchmarks**
> kotlin.collections.List&lt;BenchmarkResponse&gt; getBenchmarks()

Get list of benchmarks.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
try {
    val result : kotlin.collections.List<BenchmarkResponse> = apiInstance.getBenchmarks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#getBenchmarks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#getBenchmarks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;BenchmarkResponse&gt;**](BenchmarkResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeBenchmarkFilter"></a>
# **removeBenchmarkFilter**
> BenchmarkTest removeBenchmarkFilter(filterId, id, testId)

Remove filter from benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val filterId : kotlin.Long = 789 // kotlin.Long | The filter ID.
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
try {
    val result : BenchmarkTest = apiInstance.removeBenchmarkFilter(filterId, id, testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#removeBenchmarkFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#removeBenchmarkFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **kotlin.Long**| The filter ID. |
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeBenchmarkTestDefense"></a>
# **removeBenchmarkTestDefense**
> BenchmarkTest removeBenchmarkTestDefense(defenseId, id, testId)

Remove defense from benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val defenseId : kotlin.Long = 789 // kotlin.Long | The defense ID.
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
try {
    val result : BenchmarkTest = apiInstance.removeBenchmarkTestDefense(defenseId, id, testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#removeBenchmarkTestDefense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#removeBenchmarkTestDefense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defenseId** | **kotlin.Long**| The defense ID. |
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startBenchmarkTest"></a>
# **startBenchmarkTest**
> startBenchmarkTest(id, testId)

Start a benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
try {
    apiInstance.startBenchmarkTest(id, testId)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#startBenchmarkTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#startBenchmarkTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopBenchmarkTest"></a>
# **stopBenchmarkTest**
> stopBenchmarkTest(id, testId)

Stop a benchmark test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
try {
    apiInstance.stopBenchmarkTest(id, testId)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#stopBenchmarkTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#stopBenchmarkTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateBenchmark"></a>
# **updateBenchmark**
> BenchmarkResponse updateBenchmark(id, benchmarkRequest)

Update benchmark.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val benchmarkRequest : BenchmarkRequest =  // BenchmarkRequest | benchmarkRequest
try {
    val result : BenchmarkResponse = apiInstance.updateBenchmark(id, benchmarkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#updateBenchmark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#updateBenchmark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **benchmarkRequest** | [**BenchmarkRequest**](BenchmarkRequest.md)| benchmarkRequest |

### Return type

[**BenchmarkResponse**](BenchmarkResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBenchmarkTest"></a>
# **updateBenchmarkTest**
> BenchmarkTest updateBenchmarkTest(id, testId, testRequest)

Update test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = BenchmarkApi()
val id : kotlin.Long = 789 // kotlin.Long | The benchmark ID.
val testId : kotlin.Int = 56 // kotlin.Int | The test ID.
val testRequest : BenchmarkTestRequest =  // BenchmarkTestRequest | The test update request.
try {
    val result : BenchmarkTest = apiInstance.updateBenchmarkTest(id, testId, testRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarkApi#updateBenchmarkTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarkApi#updateBenchmarkTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The benchmark ID. |
 **testId** | **kotlin.Int**| The test ID. |
 **testRequest** | [**BenchmarkTestRequest**](BenchmarkTestRequest.md)| The test update request. |

### Return type

[**BenchmarkTest**](BenchmarkTest.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

