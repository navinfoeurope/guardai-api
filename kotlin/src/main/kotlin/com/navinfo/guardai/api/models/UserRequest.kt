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
 * @param feedback 
 * @param jsonSettings 
 * @param licenseAccepted 
 * @param organizations 
 * @param roles 
 */

data class UserRequest (

    @Json(name = "feedback")
    val feedback: kotlin.String? = null,

    @Json(name = "jsonSettings")
    val jsonSettings: kotlin.String? = null,

    @Json(name = "licenseAccepted")
    val licenseAccepted: kotlin.Boolean? = null,

    @Json(name = "organizations")
    val organizations: kotlin.collections.List<kotlin.Long>? = null,

    @Json(name = "roles")
    val roles: kotlin.String? = null

)

