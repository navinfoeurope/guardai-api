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

import com.navinfo.guardai.api.models.UserSettings

import com.squareup.moshi.Json

/**
 * 
 *
 * @param autoEnrol 
 * @param email 
 * @param jwt 
 * @param name 
 * @param registered 
 * @param roles 
 * @param settings 
 * @param uid 
 */

data class AuthorizedUserResponse (

    @Json(name = "autoEnrol")
    val autoEnrol: kotlin.Boolean? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "jwt")
    val jwt: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "registered")
    val registered: kotlin.Boolean? = null,

    @Json(name = "roles")
    val roles: kotlin.String? = null,

    @Json(name = "settings")
    val settings: UserSettings? = null,

    @Json(name = "uid")
    val uid: kotlin.String? = null

)

