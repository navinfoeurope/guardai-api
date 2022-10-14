# ReportsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReport**](ReportsApi.md#addReport) | **POST** /api/v1/reports | Add report.
[**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** /api/v1/reports/{id} | Delete a report.
[**downloadReportData**](ReportsApi.md#downloadReportData) | **GET** /api/v1/reports/{id}/download | Download report data.
[**getReport**](ReportsApi.md#getReport) | **GET** /api/v1/reports/{reportId} | Get a report.
[**getReportFile**](ReportsApi.md#getReportFile) | **GET** /api/v1/reports/{id}/file | Get file from report.
[**getReportMetaData**](ReportsApi.md#getReportMetaData) | **GET** /api/v1/reports/{id}/meta | Get meta data.
[**getReports**](ReportsApi.md#getReports) | **GET** /api/v1/reports | Get reports for a test.
[**viewData**](ReportsApi.md#viewData) | **GET** /api/v1/reports/{id}/{didx}/{aidx}/{idx}/{tag} | View report data.


<a name="addReport"></a>
# **addReport**
> ReportResponse addReport(report)

Add report.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val report : ReportRequest =  // ReportRequest | report
try {
    val result : ReportResponse = apiInstance.addReport(report)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#addReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#addReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report** | [**ReportRequest**](ReportRequest.md)| report |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReport"></a>
# **deleteReport**
> deleteReport(id)

Delete a report.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteReport(id)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#deleteReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#deleteReport")
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

<a name="downloadReportData"></a>
# **downloadReportData**
> java.io.File downloadReportData(id)

Download report data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : java.io.File = apiInstance.downloadReportData(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#downloadReportData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#downloadReportData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReport"></a>
# **getReport**
> ReportResponse getReport(reportId)

Get a report.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val reportId : kotlin.Long = 789 // kotlin.Long | reportId
try {
    val result : ReportResponse = apiInstance.getReport(reportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **kotlin.Long**| reportId |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportFile"></a>
# **getReportFile**
> java.io.File getReportFile(id, fileName)

Get file from report.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
val fileName : kotlin.String = fileName_example // kotlin.String | fileName
try {
    val result : java.io.File = apiInstance.getReportFile(id, fileName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getReportFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getReportFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |
 **fileName** | **kotlin.String**| fileName |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportMetaData"></a>
# **getReportMetaData**
> java.io.File getReportMetaData(id)

Get meta data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : java.io.File = apiInstance.getReportMetaData(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getReportMetaData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getReportMetaData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReports"></a>
# **getReports**
> kotlin.collections.List&lt;ReportResponse&gt; getReports(testId)

Get reports for a test.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val testId : kotlin.Long = 789 // kotlin.Long | testId
try {
    val result : kotlin.collections.List<ReportResponse> = apiInstance.getReports(testId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getReports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getReports")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testId** | **kotlin.Long**| testId |

### Return type

[**kotlin.collections.List&lt;ReportResponse&gt;**](ReportResponse.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewData"></a>
# **viewData**
> java.io.File viewData(aidx, didx, id, idx, tag)

View report data.

### Example
```kotlin
// Import classes:
//import com.navinfo.guardai.api.infrastructure.*
//import com.navinfo.guardai.api.models.*

val apiInstance = ReportsApi()
val aidx : kotlin.Int = 56 // kotlin.Int | aidx
val didx : kotlin.Int = 56 // kotlin.Int | didx
val id : kotlin.Long = 789 // kotlin.Long | id
val idx : kotlin.Int = 56 // kotlin.Int | idx
val tag : kotlin.String = tag_example // kotlin.String | tag
try {
    val result : java.io.File = apiInstance.viewData(aidx, didx, id, idx, tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#viewData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#viewData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aidx** | **kotlin.Int**| aidx |
 **didx** | **kotlin.Int**| didx |
 **id** | **kotlin.Long**| id |
 **idx** | **kotlin.Int**| idx |
 **tag** | **kotlin.String**| tag |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure JWT:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

