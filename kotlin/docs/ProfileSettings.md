
# ProfileSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approximateRobustness** | **kotlin.Boolean** |  |  [optional]
**arParams** | [**kotlin.Any**](.md) |  |  [optional]
**batchWiseHPO** | **kotlin.Boolean** |  |  [optional]
**configured** | **kotlin.Boolean** |  |  [optional]
**craftedSettings** | [**CraftedTestSettings**](CraftedTestSettings.md) |  |  [optional]
**datasetSetting** | [**DatasetSetting**](DatasetSetting.md) |  |  [optional]
**defenses** | [**kotlin.collections.List&lt;DefenseResponse&gt;**](DefenseResponse.md) |  |  [optional]
**detectionTestSettings** | [**DetectionTestSettings**](DetectionTestSettings.md) |  |  [optional]
**epsExploration** | **kotlin.Boolean** |  |  [optional]
**epsExplorationParams** | [**kotlin.Any**](.md) |  |  [optional]
**hpoId** | **kotlin.Int** |  |  [optional]
**hpoParams** | [**kotlin.Any**](.md) |  |  [optional]
**metrics** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;Metric&gt;&gt;** |  |  [optional]
**optimalParameterization** | **kotlin.Boolean** |  |  [optional]
**overlayImageOnSegMap** | **kotlin.Boolean** |  |  [optional]
**passFailCriteria** | [**kotlin.collections.List&lt;PassFailCriteria&gt;**](PassFailCriteria.md) |  |  [optional]
**passPercentage** | **kotlin.Float** |  |  [optional]
**storeCompositeImages** | **kotlin.Boolean** |  |  [optional]
**storeIntermediateData** | **kotlin.Boolean** |  |  [optional]
**tasks** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**testType** | [**inline**](#TestType) |  |  [optional]


<a name="TestType"></a>
## Enum: testType
Name | Value
---- | -----
testType | Crafted, Detection, Robustness



