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

import com.navinfo.guardai.api.models.TestRunResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param testRuns 
 */

data class BenchmarkTestStatusResponse (

    @Json(name = "testRuns")
    val testRuns: kotlin.collections.List<TestRunResponse>? = null

)

