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
 * @param contentType 
 * @param propertySize 
 */

data class FileStatResponse (

    @Json(name = "contentType")
    val contentType: kotlin.String? = null,

    @Json(name = "size")
    val propertySize: kotlin.Long? = null

)

