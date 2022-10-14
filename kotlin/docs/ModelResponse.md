
# ModelResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataRef** | **kotlin.String** |  |  [optional]
**datasetId** | **kotlin.Long** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**environment** | **kotlin.String** |  |  [optional]
**frameworkType** | [**inline**](#FrameworkType) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**organization** | [**OrganizationResponse**](OrganizationResponse.md) |  |  [optional]
**projectSource** | **kotlin.Long** |  |  [optional]
**tasks** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**transforms** | [**kotlin.collections.List&lt;Transform&gt;**](Transform.md) |  |  [optional]
**verified** | **kotlin.Boolean** |  |  [optional]
**wrapperRef** | **kotlin.String** |  |  [optional]


<a name="FrameworkType"></a>
## Enum: frameworkType
Name | Value
---- | -----
frameworkType | Keras, ONNX, PyTorch



