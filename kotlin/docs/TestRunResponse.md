
# TestRunResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completedCount** | **kotlin.Int** |  |  [optional]
**elapsed** | **kotlin.Int** |  |  [optional]
**eta** | **kotlin.Int** |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**initiator** | **kotlin.String** |  |  [optional]
**message** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**progress** | **kotlin.Int** |  |  [optional]
**projectId** | **kotlin.Long** |  |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**status** | [**inline**](#Status) |  |  [optional]
**submitCount** | **kotlin.Int** |  |  [optional]
**testId** | **kotlin.Long** |  |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | CANCELLED, DONE, ERR, IDLE, INITIALIZING, RUNNING, SUBMITTED



