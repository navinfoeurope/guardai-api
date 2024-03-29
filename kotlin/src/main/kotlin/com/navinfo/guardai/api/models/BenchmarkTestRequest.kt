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

import com.squareup.moshi.Json

/**
 * 
 *
 * @param defense 
 * @param name 
 */

data class BenchmarkTestRequest (

    @Json(name = "defense")
    val defense: DefenseResponse? = null,

    @Json(name = "name")
    val name: kotlin.String? = null

)

