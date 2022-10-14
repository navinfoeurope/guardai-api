# com.navinfo.guardai.api - Kotlin client library for GuardAI Platform API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8082*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BenchmarkApi* | [**addBenchmark**](docs/BenchmarkApi.md#addbenchmark) | **POST** /api/v1/benchmarks | Add a benchmark to an organization.
*BenchmarkApi* | [**addBenchmarkTest**](docs/BenchmarkApi.md#addbenchmarktest) | **POST** /api/v1/benchmarks/{id}/addtest | Add new test.
*BenchmarkApi* | [**addBenchmarkTestDefense**](docs/BenchmarkApi.md#addbenchmarktestdefense) | **POST** /api/v1/benchmarks/{id}/{testId}/defense | Add defense to benchmark test.
*BenchmarkApi* | [**addBenchmarkTestFilter**](docs/BenchmarkApi.md#addbenchmarktestfilter) | **POST** /api/v1/benchmarks/{id}/{testId}/filter | Add filter to benchmark test.
*BenchmarkApi* | [**deleteBenchmark**](docs/BenchmarkApi.md#deletebenchmark) | **DELETE** /api/v1/benchmarks/{id} | Delete a benchmark.
*BenchmarkApi* | [**deleteBenchmarkTest**](docs/BenchmarkApi.md#deletebenchmarktest) | **DELETE** /api/v1/benchmarks/{id}/{testId} | Delete a benchmark test.
*BenchmarkApi* | [**getBenchmark**](docs/BenchmarkApi.md#getbenchmark) | **GET** /api/v1/benchmarks/{id} | Get a benchmark.
*BenchmarkApi* | [**getBenchmarkTestStatus**](docs/BenchmarkApi.md#getbenchmarkteststatus) | **GET** /api/v1/benchmarks/{id}/{testId}/status | Get benchmark test status.
*BenchmarkApi* | [**getBenchmarks**](docs/BenchmarkApi.md#getbenchmarks) | **GET** /api/v1/benchmarks | Get list of benchmarks.
*BenchmarkApi* | [**removeBenchmarkFilter**](docs/BenchmarkApi.md#removebenchmarkfilter) | **DELETE** /api/v1/benchmarks/{id}/{testId}/{filterId} | Remove filter from benchmark test.
*BenchmarkApi* | [**removeBenchmarkTestDefense**](docs/BenchmarkApi.md#removebenchmarktestdefense) | **DELETE** /api/v1/benchmarks/{id}/{testId}/defense/{defenseId} | Remove defense from benchmark test.
*BenchmarkApi* | [**startBenchmarkTest**](docs/BenchmarkApi.md#startbenchmarktest) | **GET** /api/v1/benchmarks/{id}/{testId}/start | Start a benchmark test.
*BenchmarkApi* | [**stopBenchmarkTest**](docs/BenchmarkApi.md#stopbenchmarktest) | **GET** /api/v1/benchmarks/{id}/{testId}/stop | Stop a benchmark test.
*BenchmarkApi* | [**updateBenchmark**](docs/BenchmarkApi.md#updatebenchmark) | **PUT** /api/v1/benchmarks/{id} | Update benchmark.
*BenchmarkApi* | [**updateBenchmarkTest**](docs/BenchmarkApi.md#updatebenchmarktest) | **PUT** /api/v1/benchmarks/{id}/{testId} | Update test.
*DatasetsApi* | [**copyDataset**](docs/DatasetsApi.md#copydataset) | **POST** /api/v1/datasets/{id}/copy | Make a copy of a custom dataset. To copy to a different organization, extra permissions are required.
*DatasetsApi* | [**deleteCustomDataset**](docs/DatasetsApi.md#deletecustomdataset) | **DELETE** /api/v1/datasets/{id}/{orgId} | Delete dataset.
*DatasetsApi* | [**downloadDataset**](docs/DatasetsApi.md#downloaddataset) | **GET** /api/v1/datasets/{id}/{orgId}/data | Download dataset data.
*DatasetsApi* | [**getDataset**](docs/DatasetsApi.md#getdataset) | **GET** /api/v1/datasets/{id}/{orgId} | Get dataset.
*DatasetsApi* | [**getDatasetClasses**](docs/DatasetsApi.md#getdatasetclasses) | **GET** /api/v1/datasets/{id}/{orgId}/classes | Retrieve dataset classes (coco dataset supported).
*DatasetsApi* | [**getDatasetItem**](docs/DatasetsApi.md#getdatasetitem) | **GET** /api/v1/datasets/{id}/{idx}/item | Get an item from the dataset.
*DatasetsApi* | [**getDatasetTarget**](docs/DatasetsApi.md#getdatasettarget) | **GET** /api/v1/datasets/{id}/{idx}/target | Get a target from the dataset.
*DatasetsApi* | [**getDatasets**](docs/DatasetsApi.md#getdatasets) | **GET** /api/v1/datasets/{orgId} | Get the datasets defined for this organization.
*DatasetsApi* | [**updateCustomDataset**](docs/DatasetsApi.md#updatecustomdataset) | **PUT** /api/v1/datasets/{id}/{orgId} | Update dataset.
*DatasetsApi* | [**uploadDataset**](docs/DatasetsApi.md#uploaddataset) | **POST** /api/v1/datasets/{orgId} | Upload dataset.
*DatasetsApi* | [**uploadDatasetFile**](docs/DatasetsApi.md#uploaddatasetfile) | **POST** /api/v1/datasets/{id}/file | Upload a file to the dataset and return a reference.
*DefensesApi* | [**getDefense**](docs/DefensesApi.md#getdefense) | **GET** /api/v1/defenses/{id} | Get a defense.
*DefensesApi* | [**updateDefense**](docs/DefensesApi.md#updatedefense) | **PUT** /api/v1/defenses/{id} | Update defense.
*KeysApi* | [**createKey**](docs/KeysApi.md#createkey) | **POST** /api/v1/keys | Create API key.
*KeysApi* | [**deleteKey**](docs/KeysApi.md#deletekey) | **DELETE** /api/v1/keys/{id} | Delete a key.
*KeysApi* | [**getKey**](docs/KeysApi.md#getkey) | **GET** /api/v1/keys/{id} | Get a key.
*KeysApi* | [**getKeys**](docs/KeysApi.md#getkeys) | **GET** /api/v1/keys | Get all of a user's keys.
*LoginApi* | [**getAuthUser**](docs/LoginApi.md#getauthuser) | **GET** /api/v1/login/token | Get the currently OAuth2 authenticated user platform token.
*LoginApi* | [**getOAuthClients**](docs/LoginApi.md#getoauthclients) | **GET** /api/v1/login/sso | Get the list of supported OAuth clients.
*LoginApi* | [**login**](docs/LoginApi.md#login) | **POST** /api/v1/login | Retrieve an access token using API keys.
*MetricsApi* | [**addMetric**](docs/MetricsApi.md#addmetric) | **POST** /api/v1/metrics | Add a metric to an organization.
*MetricsApi* | [**deleteMetric**](docs/MetricsApi.md#deletemetric) | **DELETE** /api/v1/metrics/{id} | Delete a metric by ID.
*MetricsApi* | [**downloadMetricFile**](docs/MetricsApi.md#downloadmetricfile) | **GET** /api/v1/metrics/{id}/data | Download metric file.
*MetricsApi* | [**getMetric**](docs/MetricsApi.md#getmetric) | **GET** /api/v1/metrics/{id} | Get a metric by ID.
*MetricsApi* | [**getMetrics**](docs/MetricsApi.md#getmetrics) | **GET** /api/v1/metrics | Get the custom metrics available for this user.
*MetricsApi* | [**updateMetric**](docs/MetricsApi.md#updatemetric) | **PUT** /api/v1/metrics/{id} | Update metric by ID.
*MetricsApi* | [**uploadMetricFile**](docs/MetricsApi.md#uploadmetricfile) | **POST** /api/v1/metrics/{id} | Upload the metric implementation.
*ModelApi* | [**addModel**](docs/ModelApi.md#addmodel) | **POST** /api/v1/models | Add a model to an organization.
*ModelApi* | [**copyModel**](docs/ModelApi.md#copymodel) | **POST** /api/v1/models/{id}/copy | Make a copy of a model. To copy to a different organization, extra permissions are required.
*ModelApi* | [**deleteModel**](docs/ModelApi.md#deletemodel) | **DELETE** /api/v1/models/{id} | Delete a model by ID.
*ModelApi* | [**downloadModelData**](docs/ModelApi.md#downloadmodeldata) | **GET** /api/v1/models/{id}/data | Download model data.
*ModelApi* | [**getModel**](docs/ModelApi.md#getmodel) | **GET** /api/v1/models/{id} | Get a model by ID.
*ModelApi* | [**getModels**](docs/ModelApi.md#getmodels) | **GET** /api/v1/models | Get the models available for this user.
*ModelApi* | [**updateModel**](docs/ModelApi.md#updatemodel) | **PUT** /api/v1/models/{id} | Update model by ID.
*ModelApi* | [**uploadModelData**](docs/ModelApi.md#uploadmodeldata) | **POST** /api/v1/models/{modelId}/modeldata | Upload model data.
*OrganizationApi* | [**addOrganization**](docs/OrganizationApi.md#addorganization) | **POST** /api/v1/organizations | Add organization.
*OrganizationApi* | [**copyOrganization**](docs/OrganizationApi.md#copyorganization) | **POST** /api/v1/organizations/{id}/copy | Make a copy of the organization to another organization (requires admin permissions).
*OrganizationApi* | [**deleteOrganization**](docs/OrganizationApi.md#deleteorganization) | **DELETE** /api/v1/organizations/{id} | Delete an organization.
*OrganizationApi* | [**deleteOrganizationFile**](docs/OrganizationApi.md#deleteorganizationfile) | **DELETE** /api/v1/organizations/{id}/file | Delete organization file.
*OrganizationApi* | [**downloadOrganizationFile**](docs/OrganizationApi.md#downloadorganizationfile) | **GET** /api/v1/organizations/{id}/file | Download organization file.
*OrganizationApi* | [**getAssetDefinitions**](docs/OrganizationApi.md#getassetdefinitions) | **GET** /api/v1/organizations/{id}/assets | Get the assets defined for this organization.
*OrganizationApi* | [**getDefinedHPO**](docs/OrganizationApi.md#getdefinedhpo) | **GET** /api/v1/organizations/{id}/hpo | Get the hyper-parameter optimization methods defined for this organization.
*OrganizationApi* | [**getDefinedTransforms**](docs/OrganizationApi.md#getdefinedtransforms) | **GET** /api/v1/organizations/{id}/transforms | Get the transforms defined for this organization.
*OrganizationApi* | [**getMembers**](docs/OrganizationApi.md#getmembers) | **GET** /api/v1/organizations/{id}/members | Get all members (admin access rights required).
*OrganizationApi* | [**getOrganization**](docs/OrganizationApi.md#getorganization) | **GET** /api/v1/organizations/{id} | Get organization by id.
*OrganizationApi* | [**getOrganizationFileUsage**](docs/OrganizationApi.md#getorganizationfileusage) | **GET** /api/v1/organizations/{id}/file/usage | Get organization file project usage.
*OrganizationApi* | [**getOrganizations**](docs/OrganizationApi.md#getorganizations) | **GET** /api/v1/organizations | Get all organizations - (requires admin permissions).
*OrganizationApi* | [**renameOrganizationFile**](docs/OrganizationApi.md#renameorganizationfile) | **PUT** /api/v1/organizations/{id}/file | Rename organization file.
*OrganizationApi* | [**updateOrgStats**](docs/OrganizationApi.md#updateorgstats) | **GET** /api/v1/organizations/{id}/stat | Update storage and accounting information for this organization (admin rights).
*OrganizationApi* | [**updateOrganization**](docs/OrganizationApi.md#updateorganization) | **PUT** /api/v1/organizations/{id} | Update organization.
*OrganizationApi* | [**uploadOrganizationFile**](docs/OrganizationApi.md#uploadorganizationfile) | **POST** /api/v1/organizations/{id}/file | Upload a file to the organization and return a reference.
*PlatformApi* | [**cancelWorker**](docs/PlatformApi.md#cancelworker) | **GET** /api/v1/platform/cancel | Administrative call to cancel a worker job (admin rights required)
*PlatformApi* | [**deletePlatformFile**](docs/PlatformApi.md#deleteplatformfile) | **DELETE** /api/v1/platform/file | Delete platform file (only admins).
*PlatformApi* | [**downloadPlatformFile**](docs/PlatformApi.md#downloadplatformfile) | **GET** /api/v1/platform/file | Download platform file.
*PlatformApi* | [**getEnvironments**](docs/PlatformApi.md#getenvironments) | **GET** /api/v1/platform/environments | Get the list of environments.
*PlatformApi* | [**getQueueInfo**](docs/PlatformApi.md#getqueueinfo) | **GET** /api/v1/platform/workerqueue | Get worker queue information.
*PlatformApi* | [**statPlatformFile**](docs/PlatformApi.md#statplatformfile) | **GET** /api/v1/platform/file/stat | Stat platform file (only admins).
*PlatformApi* | [**uploadFilePart**](docs/PlatformApi.md#uploadfilepart) | **POST** /api/v1/platform/filepart | Upload a file part to the platform.
*PlatformApi* | [**uploadPlatformFile**](docs/PlatformApi.md#uploadplatformfile) | **POST** /api/v1/platform/file | Upload a file to the platform and return a reference (only admins).
*PlatformApi* | [**workerHeartbeat**](docs/PlatformApi.md#workerheartbeat) | **PUT** /api/v1/platform/heartbeat | Worker heartbeat - can only be called by a worker instance.
*ProjectApi* | [**addProject**](docs/ProjectApi.md#addproject) | **POST** /api/v1/projects | Add a project to an organization.
*ProjectApi* | [**copyProject**](docs/ProjectApi.md#copyproject) | **POST** /api/v1/projects/{id}/copy | Make a copy of the project available to (optionally) another organization.
*ProjectApi* | [**copyProjectModel**](docs/ProjectApi.md#copyprojectmodel) | **POST** /api/v1/projects/{id}/copymodel | Make a copy of the project model available to the organization.
*ProjectApi* | [**deleteData**](docs/ProjectApi.md#deletedata) | **DELETE** /api/v1/projects/{id}/modeldata | Delete project model data.
*ProjectApi* | [**deleteProject**](docs/ProjectApi.md#deleteproject) | **DELETE** /api/v1/projects/{id} | Delete a project.
*ProjectApi* | [**downloadProjectData**](docs/ProjectApi.md#downloadprojectdata) | **GET** /api/v1/projects/{id}/data | Download project data.
*ProjectApi* | [**getProject**](docs/ProjectApi.md#getproject) | **GET** /api/v1/projects/{id} | Get a project.
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getprojects) | **GET** /api/v1/projects | Get list of projects.
*ProjectApi* | [**updateProject**](docs/ProjectApi.md#updateproject) | **PUT** /api/v1/projects/{id} | Update project .
*ProjectApi* | [**uploadProjectData**](docs/ProjectApi.md#uploadprojectdata) | **POST** /api/v1/projects/{id}/modeldata | Upload project data.
*ProjectApi* | [**uploadProjectFile**](docs/ProjectApi.md#uploadprojectfile) | **POST** /api/v1/projects/{id}/files | Upload a file to the project and return a reference.
*ProjectApi* | [**useModel**](docs/ProjectApi.md#usemodel) | **GET** /api/v1/projects/{id}/usemodel | Use an existing model to configure the project.
*ProjectApi* | [**verifyProject**](docs/ProjectApi.md#verifyproject) | **PUT** /api/v1/projects/{id}/verify | Start the model verification process.
*RegisterApi* | [**register**](docs/RegisterApi.md#register) | **POST** /api/v1/register | Register user
*RegisterApi* | [**sendInvite**](docs/RegisterApi.md#sendinvite) | **POST** /api/v1/register/invite | Send user invite - admin permissions required.
*ReportsApi* | [**addReport**](docs/ReportsApi.md#addreport) | **POST** /api/v1/reports | Add report.
*ReportsApi* | [**deleteReport**](docs/ReportsApi.md#deletereport) | **DELETE** /api/v1/reports/{id} | Delete a report.
*ReportsApi* | [**downloadReportData**](docs/ReportsApi.md#downloadreportdata) | **GET** /api/v1/reports/{id}/download | Download report data.
*ReportsApi* | [**getReport**](docs/ReportsApi.md#getreport) | **GET** /api/v1/reports/{reportId} | Get a report.
*ReportsApi* | [**getReportFile**](docs/ReportsApi.md#getreportfile) | **GET** /api/v1/reports/{id}/file | Get file from report.
*ReportsApi* | [**getReportMetaData**](docs/ReportsApi.md#getreportmetadata) | **GET** /api/v1/reports/{id}/meta | Get meta data.
*ReportsApi* | [**getReports**](docs/ReportsApi.md#getreports) | **GET** /api/v1/reports | Get reports for a test.
*ReportsApi* | [**viewData**](docs/ReportsApi.md#viewdata) | **GET** /api/v1/reports/{id}/{didx}/{aidx}/{idx}/{tag} | View report data.
*TestApi* | [**addDefense**](docs/TestApi.md#adddefense) | **POST** /api/v1/tests/{testId}/defense | Add defense.
*TestApi* | [**addFilter**](docs/TestApi.md#addfilter) | **POST** /api/v1/tests/{id}/filter | Add a filter.
*TestApi* | [**addTest**](docs/TestApi.md#addtest) | **POST** /api/v1/tests | Add a new test.
*TestApi* | [**deleteTest**](docs/TestApi.md#deletetest) | **DELETE** /api/v1/tests/{id} | Delete a test.
*TestApi* | [**getDefenses**](docs/TestApi.md#getdefenses) | **GET** /api/v1/tests/{testId}/defenses | Get defenses.
*TestApi* | [**getStatus**](docs/TestApi.md#getstatus) | **GET** /api/v1/tests/{testId}/status | Get test status.
*TestApi* | [**getTests**](docs/TestApi.md#gettests) | **GET** /api/v1/tests | Get tests for a project.
*TestApi* | [**removeDefense**](docs/TestApi.md#removedefense) | **DELETE** /api/v1/tests/{testId}/defense/{id} | Remove defense.
*TestApi* | [**removeFilter**](docs/TestApi.md#removefilter) | **DELETE** /api/v1/tests/{testId}/filter/{id} | Remove a filter.
*TestApi* | [**startTest**](docs/TestApi.md#starttest) | **GET** /api/v1/tests/{testId}/start | Start a test.
*TestApi* | [**stopTest**](docs/TestApi.md#stoptest) | **GET** /api/v1/tests/{id}/stop | Stop all the running jobs in a test.
*TestApi* | [**updateStatus**](docs/TestApi.md#updatestatus) | **PUT** /api/v1/tests/{testId}/status | Update test status - can only be called by worker instance.
*TestApi* | [**updateTest**](docs/TestApi.md#updatetest) | **PUT** /api/v1/tests/{id} | Update test.
*TestApi* | [**updateTestRun**](docs/TestApi.md#updatetestrun) | **PUT** /api/v1/tests/testrun/{id} | Update test run.
*TestProfilesApi* | [**addProfile**](docs/TestProfilesApi.md#addprofile) | **POST** /api/v1/profiles/{testId} | Add a profile to an organization using the provided test id as a template.
*TestProfilesApi* | [**addTestProfileDefense**](docs/TestProfilesApi.md#addtestprofiledefense) | **PUT** /api/v1/profiles/{id}/adddefense | Add a defense to the profile
*TestProfilesApi* | [**addTestProfileFilter**](docs/TestProfilesApi.md#addtestprofilefilter) | **PUT** /api/v1/profiles/{id}/addfilter | Add a filter to the profile
*TestProfilesApi* | [**copyProfile**](docs/TestProfilesApi.md#copyprofile) | **POST** /api/v1/profiles/{id}/copy | Make a copy of a profile. To copy to a different organization, extra permissions are required.
*TestProfilesApi* | [**createTestProfile**](docs/TestProfilesApi.md#createtestprofile) | **POST** /api/v1/profiles | Create a new test profile
*TestProfilesApi* | [**deleteProfile**](docs/TestProfilesApi.md#deleteprofile) | **DELETE** /api/v1/profiles/{id} | Delete a profile by ID.
*TestProfilesApi* | [**getTestProfile**](docs/TestProfilesApi.md#gettestprofile) | **GET** /api/v1/profiles/{id} | Get the test profile.
*TestProfilesApi* | [**getTestProfiles**](docs/TestProfilesApi.md#gettestprofiles) | **GET** /api/v1/profiles | Get the profiles available for this user.
*TestProfilesApi* | [**removeTestProfileDefense**](docs/TestProfilesApi.md#removetestprofiledefense) | **DELETE** /api/v1/profiles/{id}/defense/{defenseId} | Remove defense from test profile.
*TestProfilesApi* | [**updateTestProfile**](docs/TestProfilesApi.md#updatetestprofile) | **PUT** /api/v1/profiles/{id} | Update profile by ID.
*TransformApi* | [**addTransform**](docs/TransformApi.md#addtransform) | **POST** /api/v1/transforms | Add a transform to an organization.
*TransformApi* | [**deleteTransform**](docs/TransformApi.md#deletetransform) | **DELETE** /api/v1/transforms/{id} | Delete a transform by ID.
*TransformApi* | [**downloadFile**](docs/TransformApi.md#downloadfile) | **GET** /api/v1/transforms/{id}/data | Download transform file.
*TransformApi* | [**getTransform**](docs/TransformApi.md#gettransform) | **GET** /api/v1/transforms/{id} | Get a transform by ID.
*TransformApi* | [**getTransforms**](docs/TransformApi.md#gettransforms) | **GET** /api/v1/transforms | Get the transforms available for this user.
*TransformApi* | [**updateTransform**](docs/TransformApi.md#updatetransform) | **PUT** /api/v1/transforms/{id} | Update transform by ID.
*TransformApi* | [**uploadFile**](docs/TransformApi.md#uploadfile) | **POST** /api/v1/transforms/{id} | Upload the data file for the transform.
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteuser) | **DELETE** /api/v1/users/{id} | Delete a user.
*UsersApi* | [**getLoggedInUser**](docs/UsersApi.md#getloggedinuser) | **GET** /api/v1/users/me | Get the currently logged-in user.
*UsersApi* | [**getUser**](docs/UsersApi.md#getuser) | **GET** /api/v1/users/{id} | Get a user.
*UsersApi* | [**getUserLogs**](docs/UsersApi.md#getuserlogs) | **GET** /api/v1/users/{id}/logs | Get user logs.
*UsersApi* | [**getUsers**](docs/UsersApi.md#getusers) | **GET** /api/v1/users | Get all users (access rights required).
*UsersApi* | [**sendFeedback**](docs/UsersApi.md#sendfeedback) | **POST** /api/v1/users/feedback | Send user feedback.
*UsersApi* | [**updateProfile**](docs/UsersApi.md#updateprofile) | **PUT** /api/v1/users | Update profile of currently authenticated user.
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateuser) | **PUT** /api/v1/users/{id} | Update user by user id - (admin permission required)
*VersionsApi* | [**getPlatformVersion**](docs/VersionsApi.md#getplatformversion) | **GET** /api/v1/versions | Get platform version
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createwebhook) | **POST** /api/v1/webhooks/test/{testId} | Create a webhook for a test.
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deletewebhook) | **DELETE** /api/v1/webhooks/{hookId} | Delete a webhook.
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getwebhook) | **GET** /api/v1/webhooks/{webhookId} | Get a webhook.
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getwebhooks) | **GET** /api/v1/webhooks/test/{testId} | Get all webhooks defined for a test.
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updatewebhook) | **PUT** /api/v1/webhooks/{hookId} | Update a webhook.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.navinfo.guardai.api.models.AIFilter](docs/AIFilter.md)
 - [com.navinfo.guardai.api.models.APIKeyResponse](docs/APIKeyResponse.md)
 - [com.navinfo.guardai.api.models.Annotation](docs/Annotation.md)
 - [com.navinfo.guardai.api.models.AssetsResponse](docs/AssetsResponse.md)
 - [com.navinfo.guardai.api.models.AuthorizedUserResponse](docs/AuthorizedUserResponse.md)
 - [com.navinfo.guardai.api.models.BenchmarkProject](docs/BenchmarkProject.md)
 - [com.navinfo.guardai.api.models.BenchmarkRequest](docs/BenchmarkRequest.md)
 - [com.navinfo.guardai.api.models.BenchmarkResponse](docs/BenchmarkResponse.md)
 - [com.navinfo.guardai.api.models.BenchmarkSettings](docs/BenchmarkSettings.md)
 - [com.navinfo.guardai.api.models.BenchmarkTest](docs/BenchmarkTest.md)
 - [com.navinfo.guardai.api.models.BenchmarkTestRequest](docs/BenchmarkTestRequest.md)
 - [com.navinfo.guardai.api.models.BenchmarkTestStatusResponse](docs/BenchmarkTestStatusResponse.md)
 - [com.navinfo.guardai.api.models.BoundingBox](docs/BoundingBox.md)
 - [com.navinfo.guardai.api.models.ClassMappingFileRef](docs/ClassMappingFileRef.md)
 - [com.navinfo.guardai.api.models.CraftedTestSettings](docs/CraftedTestSettings.md)
 - [com.navinfo.guardai.api.models.DataSet](docs/DataSet.md)
 - [com.navinfo.guardai.api.models.DatasetRequest](docs/DatasetRequest.md)
 - [com.navinfo.guardai.api.models.DatasetSetting](docs/DatasetSetting.md)
 - [com.navinfo.guardai.api.models.DatasetSettings](docs/DatasetSettings.md)
 - [com.navinfo.guardai.api.models.DatasetTarget](docs/DatasetTarget.md)
 - [com.navinfo.guardai.api.models.DefenseRequest](docs/DefenseRequest.md)
 - [com.navinfo.guardai.api.models.DefenseResponse](docs/DefenseResponse.md)
 - [com.navinfo.guardai.api.models.DetectionTestSettings](docs/DetectionTestSettings.md)
 - [com.navinfo.guardai.api.models.EnvironmentResponse](docs/EnvironmentResponse.md)
 - [com.navinfo.guardai.api.models.FileStatResponse](docs/FileStatResponse.md)
 - [com.navinfo.guardai.api.models.FilterRequest](docs/FilterRequest.md)
 - [com.navinfo.guardai.api.models.HPODefinition](docs/HPODefinition.md)
 - [com.navinfo.guardai.api.models.HeadSetting](docs/HeadSetting.md)
 - [com.navinfo.guardai.api.models.InviteRequest](docs/InviteRequest.md)
 - [com.navinfo.guardai.api.models.LogEntryResponse](docs/LogEntryResponse.md)
 - [com.navinfo.guardai.api.models.LoginRequest](docs/LoginRequest.md)
 - [com.navinfo.guardai.api.models.Metric](docs/Metric.md)
 - [com.navinfo.guardai.api.models.MetricDefinition](docs/MetricDefinition.md)
 - [com.navinfo.guardai.api.models.ModelHead](docs/ModelHead.md)
 - [com.navinfo.guardai.api.models.ModelRequest](docs/ModelRequest.md)
 - [com.navinfo.guardai.api.models.ModelResponse](docs/ModelResponse.md)
 - [com.navinfo.guardai.api.models.OrganizationRequest](docs/OrganizationRequest.md)
 - [com.navinfo.guardai.api.models.OrganizationResponse](docs/OrganizationResponse.md)
 - [com.navinfo.guardai.api.models.OrganizationSettings](docs/OrganizationSettings.md)
 - [com.navinfo.guardai.api.models.OrganizationStatsResponse](docs/OrganizationStatsResponse.md)
 - [com.navinfo.guardai.api.models.PassFailCriteria](docs/PassFailCriteria.md)
 - [com.navinfo.guardai.api.models.PipelineResponse](docs/PipelineResponse.md)
 - [com.navinfo.guardai.api.models.ProfileSettings](docs/ProfileSettings.md)
 - [com.navinfo.guardai.api.models.ProjectRequest](docs/ProjectRequest.md)
 - [com.navinfo.guardai.api.models.ProjectResponse](docs/ProjectResponse.md)
 - [com.navinfo.guardai.api.models.ProjectSettings](docs/ProjectSettings.md)
 - [com.navinfo.guardai.api.models.QueueInfoResponse](docs/QueueInfoResponse.md)
 - [com.navinfo.guardai.api.models.Rectangle](docs/Rectangle.md)
 - [com.navinfo.guardai.api.models.RegisterRequest](docs/RegisterRequest.md)
 - [com.navinfo.guardai.api.models.ReportRequest](docs/ReportRequest.md)
 - [com.navinfo.guardai.api.models.ReportResponse](docs/ReportResponse.md)
 - [com.navinfo.guardai.api.models.Resource](docs/Resource.md)
 - [com.navinfo.guardai.api.models.Segmentation](docs/Segmentation.md)
 - [com.navinfo.guardai.api.models.StatusRequest](docs/StatusRequest.md)
 - [com.navinfo.guardai.api.models.TestProfileRequest](docs/TestProfileRequest.md)
 - [com.navinfo.guardai.api.models.TestProfileResponse](docs/TestProfileResponse.md)
 - [com.navinfo.guardai.api.models.TestRequest](docs/TestRequest.md)
 - [com.navinfo.guardai.api.models.TestResponse](docs/TestResponse.md)
 - [com.navinfo.guardai.api.models.TestRunRequest](docs/TestRunRequest.md)
 - [com.navinfo.guardai.api.models.TestRunResponse](docs/TestRunResponse.md)
 - [com.navinfo.guardai.api.models.TestSettings](docs/TestSettings.md)
 - [com.navinfo.guardai.api.models.Transform](docs/Transform.md)
 - [com.navinfo.guardai.api.models.TransformDefinition](docs/TransformDefinition.md)
 - [com.navinfo.guardai.api.models.UserRequest](docs/UserRequest.md)
 - [com.navinfo.guardai.api.models.UserResponse](docs/UserResponse.md)
 - [com.navinfo.guardai.api.models.UserSettings](docs/UserSettings.md)
 - [com.navinfo.guardai.api.models.WebHookSettings](docs/WebHookSettings.md)
 - [com.navinfo.guardai.api.models.WebhookRequest](docs/WebhookRequest.md)
 - [com.navinfo.guardai.api.models.WebhookResponse](docs/WebhookResponse.md)
 - [com.navinfo.guardai.api.models.WorkerHeartbeatEntry](docs/WorkerHeartbeatEntry.md)
 - [com.navinfo.guardai.api.models.WorkerHeartbeatRequest](docs/WorkerHeartbeatRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="JWT"></a>
### JWT

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

