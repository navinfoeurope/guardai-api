# guardai_api.TestProfilesApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_profile**](TestProfilesApi.md#add_profile) | **POST** /api/v1/profiles/{testId} | Add a profile to an organization using the provided test id as a template.
[**add_test_profile_defense**](TestProfilesApi.md#add_test_profile_defense) | **PUT** /api/v1/profiles/{id}/adddefense | Add a defense to the profile
[**add_test_profile_filter**](TestProfilesApi.md#add_test_profile_filter) | **PUT** /api/v1/profiles/{id}/addfilter | Add a filter to the profile
[**copy_profile**](TestProfilesApi.md#copy_profile) | **POST** /api/v1/profiles/{id}/copy | Make a copy of a profile. To copy to a different organization, extra permissions are required.
[**create_test_profile**](TestProfilesApi.md#create_test_profile) | **POST** /api/v1/profiles | Create a new test profile
[**delete_profile**](TestProfilesApi.md#delete_profile) | **DELETE** /api/v1/profiles/{id} | Delete a profile by ID.
[**get_test_profile**](TestProfilesApi.md#get_test_profile) | **GET** /api/v1/profiles/{id} | Get the test profile.
[**get_test_profiles**](TestProfilesApi.md#get_test_profiles) | **GET** /api/v1/profiles | Get the profiles available for this user.
[**remove_test_profile_defense**](TestProfilesApi.md#remove_test_profile_defense) | **DELETE** /api/v1/profiles/{id}/defense/{defenseId} | Remove defense from test profile.
[**update_test_profile**](TestProfilesApi.md#update_test_profile) | **PUT** /api/v1/profiles/{id} | Update profile by ID.


# **add_profile**
> TestProfileResponse add_profile(id, name, test_id)

Add a profile to an organization using the provided test id as a template.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The organization ID.
    name = "name_example" # str | The profile name.
    test_id = 1 # int | The test ID from which the settings will be copied.

    # example passing only required values which don't have defaults set
    try:
        # Add a profile to an organization using the provided test id as a template.
        api_response = api_instance.add_profile(id, name, test_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->add_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The organization ID. |
 **name** | **str**| The profile name. |
 **test_id** | **int**| The test ID from which the settings will be copied. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_test_profile_defense**
> TestProfileResponse add_test_profile_defense(id, defense)

Add a defense to the profile

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from guardai_api.model.defense_request import DefenseRequest
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The profile ID.
    defense = DefenseRequest(
        name="name_example",
        parameters="parameters_example",
    ) # DefenseRequest | The defense object

    # example passing only required values which don't have defaults set
    try:
        # Add a defense to the profile
        api_response = api_instance.add_test_profile_defense(id, defense)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->add_test_profile_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The profile ID. |
 **defense** | [**DefenseRequest**](DefenseRequest.md)| The defense object |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_test_profile_filter**
> TestProfileResponse add_test_profile_filter(id, filter)

Add a filter to the profile

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from guardai_api.model.filter_request import FilterRequest
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The profile ID.
    filter = FilterRequest(
        enabled=True,
        name="name_example",
        parameters="parameters_example",
        type="adversarial_attacks",
    ) # FilterRequest | The filter to add.

    # example passing only required values which don't have defaults set
    try:
        # Add a filter to the profile
        api_response = api_instance.add_test_profile_filter(id, filter)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->add_test_profile_filter: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The profile ID. |
 **filter** | [**FilterRequest**](FilterRequest.md)| The filter to add. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_profile**
> TestProfileResponse copy_profile(id)

Make a copy of a profile. To copy to a different organization, extra permissions are required.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The profile ID.
    org_id = 1 # int | Optional destination organization ID to copy to. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Make a copy of a profile. To copy to a different organization, extra permissions are required.
        api_response = api_instance.copy_profile(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->copy_profile: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Make a copy of a profile. To copy to a different organization, extra permissions are required.
        api_response = api_instance.copy_profile(id, org_id=org_id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->copy_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The profile ID. |
 **org_id** | **int**| Optional destination organization ID to copy to. | [optional]

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_test_profile**
> TestProfileResponse create_test_profile(org_id, profile)

Create a new test profile

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_request import TestProfileRequest
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    org_id = 1 # int | The organization ID.
    profile = TestProfileRequest(
        description="description_example",
        id=1,
        name="name_example",
        settings=ProfileSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            configured=True,
            crafted_settings=CraftedTestSettings(
                from_class="from_class_example",
                item_idx=1,
                params={},
                regions=[
                    Rectangle(
                        x1=1,
                        x2=1,
                        y1=1,
                        y2=1,
                    ),
                ],
                to_class="to_class_example",
            ),
            dataset_setting=DatasetSetting(
                batch_size=1,
                end_idx=1,
                fraction=3.14,
                indexes=[
                    1,
                ],
                num_items=1,
                selection_type="COUNT",
                shuffle=True,
                start_idx=1,
                workers=1,
            ),
            defenses=[
                DefenseResponse(
                    defense_parameters="defense_parameters_example",
                    filters=[
                        AIFilter(
                            codebase_name="codebase_name_example",
                            enabled=True,
                            group=[
                                "group_example",
                            ],
                            id=1,
                            name="name_example",
                            paper_link="paper_link_example",
                            parameters="parameters_example",
                            tasks=[
                                "tasks_example",
                            ],
                            type="type_example",
                        ),
                    ],
                    id=1,
                    name="name_example",
                    test_id=1,
                ),
            ],
            detection_test_settings=DetectionTestSettings(
                id=1,
                params={},
                pass_deviations=3.14,
                poisoned_dataset_setting=DatasetSetting(
                    batch_size=1,
                    end_idx=1,
                    fraction=3.14,
                    indexes=[
                        1,
                    ],
                    num_items=1,
                    selection_type="COUNT",
                    shuffle=True,
                    start_idx=1,
                    workers=1,
                ),
            ),
            eps_exploration=True,
            eps_exploration_params={},
            hpo_id=1,
            hpo_params={},
            metrics={
                "key": [
                    Metric(
                        enabled=True,
                        name="name_example",
                        params={},
                        uid="uid_example",
                    ),
                ],
            },
            optimal_parameterization=True,
            overlay_image_on_seg_map=True,
            pass_fail_criteria=[
                PassFailCriteria(
                    above=True,
                    enabled=True,
                    metric_name="metric_name_example",
                    pass_val=3.14,
                ),
            ],
            pass_percentage=3.14,
            store_composite_images=True,
            store_intermediate_data=True,
            tasks=[
                "tasks_example",
            ],
            test_type="Crafted",
        ),
    ) # TestProfileRequest | The profile object.

    # example passing only required values which don't have defaults set
    try:
        # Create a new test profile
        api_response = api_instance.create_test_profile(org_id, profile)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->create_test_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_id** | **int**| The organization ID. |
 **profile** | [**TestProfileRequest**](TestProfileRequest.md)| The profile object. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_profile**
> delete_profile(id)

Delete a profile by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The profile ID.

    # example passing only required values which don't have defaults set
    try:
        # Delete a profile by ID.
        api_instance.delete_profile(id)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->delete_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The profile ID. |

### Return type

void (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_test_profile**
> TestProfileResponse get_test_profile(id)

Get the test profile.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The profile ID.

    # example passing only required values which don't have defaults set
    try:
        # Get the test profile.
        api_response = api_instance.get_test_profile(id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->get_test_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The profile ID. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_test_profiles**
> [TestProfileResponse] get_test_profiles()

Get the profiles available for this user.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get the profiles available for this user.
        api_response = api_instance.get_test_profiles()
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->get_test_profiles: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[TestProfileResponse]**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_test_profile_defense**
> TestProfileResponse remove_test_profile_defense(defense_id, id)

Remove defense from test profile.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    defense_id = 1 # int | The defense ID.
    id = 1 # int | The profile ID.

    # example passing only required values which don't have defaults set
    try:
        # Remove defense from test profile.
        api_response = api_instance.remove_test_profile_defense(defense_id, id)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->remove_test_profile_defense: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defense_id** | **int**| The defense ID. |
 **id** | **int**| The profile ID. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_test_profile**
> TestProfileResponse update_test_profile(id, profile)

Update profile by ID.

### Example

* Api Key Authentication (JWT):

```python
import time
import guardai_api
from api import test_profiles_api
from guardai_api.model.test_profile_request import TestProfileRequest
from guardai_api.model.test_profile_response import TestProfileResponse
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:8082
# See configuration.py for a list of all supported configuration parameters.
configuration = guardai_api.Configuration(
    host = "http://localhost:8082"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: JWT
configuration.api_key['JWT'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['JWT'] = 'Bearer'

# Enter a context with an instance of the API client
with guardai_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = test_profiles_api.TestProfilesApi(api_client)
    id = 1 # int | The profile ID.
    profile = TestProfileRequest(
        description="description_example",
        id=1,
        name="name_example",
        settings=ProfileSettings(
            approximate_robustness=True,
            ar_params={},
            batch_wise_hpo=True,
            configured=True,
            crafted_settings=CraftedTestSettings(
                from_class="from_class_example",
                item_idx=1,
                params={},
                regions=[
                    Rectangle(
                        x1=1,
                        x2=1,
                        y1=1,
                        y2=1,
                    ),
                ],
                to_class="to_class_example",
            ),
            dataset_setting=DatasetSetting(
                batch_size=1,
                end_idx=1,
                fraction=3.14,
                indexes=[
                    1,
                ],
                num_items=1,
                selection_type="COUNT",
                shuffle=True,
                start_idx=1,
                workers=1,
            ),
            defenses=[
                DefenseResponse(
                    defense_parameters="defense_parameters_example",
                    filters=[
                        AIFilter(
                            codebase_name="codebase_name_example",
                            enabled=True,
                            group=[
                                "group_example",
                            ],
                            id=1,
                            name="name_example",
                            paper_link="paper_link_example",
                            parameters="parameters_example",
                            tasks=[
                                "tasks_example",
                            ],
                            type="type_example",
                        ),
                    ],
                    id=1,
                    name="name_example",
                    test_id=1,
                ),
            ],
            detection_test_settings=DetectionTestSettings(
                id=1,
                params={},
                pass_deviations=3.14,
                poisoned_dataset_setting=DatasetSetting(
                    batch_size=1,
                    end_idx=1,
                    fraction=3.14,
                    indexes=[
                        1,
                    ],
                    num_items=1,
                    selection_type="COUNT",
                    shuffle=True,
                    start_idx=1,
                    workers=1,
                ),
            ),
            eps_exploration=True,
            eps_exploration_params={},
            hpo_id=1,
            hpo_params={},
            metrics={
                "key": [
                    Metric(
                        enabled=True,
                        name="name_example",
                        params={},
                        uid="uid_example",
                    ),
                ],
            },
            optimal_parameterization=True,
            overlay_image_on_seg_map=True,
            pass_fail_criteria=[
                PassFailCriteria(
                    above=True,
                    enabled=True,
                    metric_name="metric_name_example",
                    pass_val=3.14,
                ),
            ],
            pass_percentage=3.14,
            store_composite_images=True,
            store_intermediate_data=True,
            tasks=[
                "tasks_example",
            ],
            test_type="Crafted",
        ),
    ) # TestProfileRequest | The profile update request.

    # example passing only required values which don't have defaults set
    try:
        # Update profile by ID.
        api_response = api_instance.update_test_profile(id, profile)
        pprint(api_response)
    except guardai_api.ApiException as e:
        print("Exception when calling TestProfilesApi->update_test_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The profile ID. |
 **profile** | [**TestProfileRequest**](TestProfileRequest.md)| The profile update request. |

### Return type

[**TestProfileResponse**](TestProfileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

