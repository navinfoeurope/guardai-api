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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param dataRef 
 * @param date 
 * @param id 
 * @param jsonReport 
 * @param projectId 
 * @param runId 
 * @param runName 
 * @param testId 
 */

data class ReportResponse (

    @Json(name = "dataRef")
    val dataRef: kotlin.String? = null,

    @Json(name = "date")
    val date: java.time.OffsetDateTime? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "jsonReport")
    val jsonReport: kotlin.String? = null,

    @Json(name = "projectId")
    val projectId: kotlin.Long? = null,

    @Json(name = "runId")
    val runId: kotlin.Int? = null,

    @Json(name = "runName")
    val runName: kotlin.String? = null,

    @Json(name = "testId")
    val testId: kotlin.Long? = null

)
