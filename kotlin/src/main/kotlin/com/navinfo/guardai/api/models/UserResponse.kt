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

import com.navinfo.guardai.api.models.OrganizationResponse
import com.navinfo.guardai.api.models.UserSettings

import com.squareup.moshi.Json

/**
 * 
 *
 * @param avatar 
 * @param email 
 * @param id 
 * @param lastLoginDateTime 
 * @param licenseAccepted 
 * @param name 
 * @param organizations 
 * @param registered 
 * @param roles 
 * @param settings 
 * @param timeUsed 
 * @param uid 
 */

data class UserResponse (

    @Json(name = "avatar")
    val avatar: kotlin.ByteArray? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "lastLoginDateTime")
    val lastLoginDateTime: java.time.OffsetDateTime? = null,

    @Json(name = "licenseAccepted")
    val licenseAccepted: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "organizations")
    val organizations: kotlin.collections.List<OrganizationResponse>? = null,

    @Json(name = "registered")
    val registered: kotlin.Boolean? = null,

    @Json(name = "roles")
    val roles: kotlin.String? = null,

    @Json(name = "settings")
    val settings: UserSettings? = null,

    @Json(name = "timeUsed")
    val timeUsed: kotlin.Long? = null,

    @Json(name = "uid")
    val uid: kotlin.String? = null

)

