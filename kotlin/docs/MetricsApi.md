# MetricsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMetric**](MetricsApi.md#addMetric) | **POST** /api/v1/metrics | Add a metric to an organization.
[**deleteMetric**](MetricsApi.md#deleteMetric) | **DELETE** /api/v1/metrics/{id} | Delete a metric by ID.
[**downloadMetricFile**](MetricsApi.md#downloadMetricFile) | **GET** /api/v1/metrics/{id}/data | Download metric file.
[**getMetric**](MetricsApi.md#getMetric) | **GET** /api/v1/metrics/{id} | Get a metric by ID.
[**getMetrics**](MetricsApi.md#getMetrics) | **GET** /api/v1/metrics | Get the custom metrics available for this user.
[**updateMetric**](MetricsApi.md#updateMetric) | **PUT** /api/v1/metrics/{id} | Update metric by ID.
[**uploadMetricFile**](MetricsApi.md#uploadMetricFile) | **POST** /api/v1/metrics/{id} | Upload the metric implementation.


<a name="addMetric"></a>
# **addMetric**
> MetricDefinition addMetric(id, name)

Add a metric to an organization.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
val id : kotlin.Long = 789 // kotlin.Long | The organization ID.
val name : kotlin.String = name_example // kotlin.String | The metric name.
try {
    val result : MetricDefinition = apiInstance.addMetric(id, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#addMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#addMetric")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The organization ID. |
 **name** | **kotlin.String**| The metric name. |

### Return type

[**MetricDefinition**](MetricDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMetric"></a>
# **deleteMetric**
> deleteMetric(id)

Delete a metric by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
val id : kotlin.String = id_example // kotlin.String | The metric ID.
try {
    apiInstance.deleteMetric(id)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#deleteMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#deleteMetric")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The metric ID. |

### Return type

null (empty response body)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadMetricFile"></a>
# **downloadMetricFile**
> java.io.File downloadMetricFile(id)

Download metric file.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
val id : kotlin.String = id_example // kotlin.String | The metric ID.
try {
    val result : java.io.File = apiInstance.downloadMetricFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#downloadMetricFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#downloadMetricFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The metric ID. |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetric"></a>
# **getMetric**
> MetricDefinition getMetric(id)

Get a metric by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
val id : kotlin.String = id_example // kotlin.String | The metric ID.
try {
    val result : MetricDefinition = apiInstance.getMetric(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#getMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#getMetric")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The metric ID. |

### Return type

[**MetricDefinition**](MetricDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetrics"></a>
# **getMetrics**
> kotlin.collections.List&lt;MetricDefinition&gt; getMetrics()

Get the custom metrics available for this user.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
try {
    val result : kotlin.collections.List<MetricDefinition> = apiInstance.getMetrics()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#getMetrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#getMetrics")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;MetricDefinition&gt;**](MetricDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMetric"></a>
# **updateMetric**
> MetricDefinition updateMetric(id, metric)

Update metric by ID.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
val id : kotlin.String = id_example // kotlin.String | The metric ID.
val metric : MetricDefinition =  // MetricDefinition | The metric update request.
try {
    val result : MetricDefinition = apiInstance.updateMetric(id, metric)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#updateMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#updateMetric")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The metric ID. |
 **metric** | [**MetricDefinition**](MetricDefinition.md)| The metric update request. |

### Return type

[**MetricDefinition**](MetricDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadMetricFile"></a>
# **uploadMetricFile**
> MetricDefinition uploadMetricFile(id, file)

Upload the metric implementation.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = MetricsApi()
val id : kotlin.String = id_example // kotlin.String | The metric ID.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : MetricDefinition = apiInstance.uploadMetricFile(id, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#uploadMetricFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#uploadMetricFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The metric ID. |
 **file** | **java.io.File**|  | [optional]

### Return type

[**MetricDefinition**](MetricDefinition.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

