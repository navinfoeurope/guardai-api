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
 * @param x1 
 * @param x2 
 * @param y1 
 * @param y2 
 */

data class Rectangle (

    @Json(name = "x1")
    val x1: kotlin.Int? = null,

    @Json(name = "x2")
    val x2: kotlin.Int? = null,

    @Json(name = "y1")
    val y1: kotlin.Int? = null,

    @Json(name = "y2")
    val y2: kotlin.Int? = null

)
