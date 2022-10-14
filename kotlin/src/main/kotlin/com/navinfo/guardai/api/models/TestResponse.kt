/**
 * GuardAI Platform API
 *
 * GuardAI is an adversarial security assessment Platform for AI
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@navinfo.eu
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.navinfo.guardai.api.models

import com.navinfo.guardai.api.models.DefenseResponse
import com.navinfo.guardai.api.models.TestRunResponse
import com.navinfo.guardai.api.models.TestSettings

import com.squareup.moshi.Json

/**
 * 
 *
 * @param defenses 
 * @param description 
 * @param id 
 * @param name 
 * @param pipelineId 
 * @param projectId 
 * @param testRuns 
 * @param testSettings 
 */

data class TestResponse (

    @Json(name = "defenses")
    val defenses: kotlin.collections.List<DefenseResponse>? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "pipelineId")
    val pipelineId: kotlin.Long? = null,

    @Json(name = "projectId")
    val projectId: kotlin.Long? = null,

    @Json(name = "testRuns")
    val testRuns: kotlin.collections.List<TestRunResponse>? = null,

    @Json(name = "testSettings")
    val testSettings: TestSettings? = null

)

