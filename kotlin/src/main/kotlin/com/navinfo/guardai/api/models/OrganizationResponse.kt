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

import com.navinfo.guardai.api.models.OrganizationSettings
import com.navinfo.guardai.api.models.OrganizationStatsResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param creationDateTime 
 * @param id 
 * @param name 
 * @param settings 
 * @param stats 
 * @param timeUsed 
 */

data class OrganizationResponse (

    @Json(name = "creationDateTime")
    val creationDateTime: java.time.OffsetDateTime? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "settings")
    val settings: OrganizationSettings? = null,

    @Json(name = "stats")
    val stats: OrganizationStatsResponse? = null,

    @Json(name = "timeUsed")
    val timeUsed: kotlin.Long? = null

)
