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

import com.navinfo.guardai.api.models.DatasetSettings
import com.navinfo.guardai.api.models.Transform

import com.squareup.moshi.Json

/**
 * 
 *
 * @param datasetLength 
 * @param description 
 * @param enabled 
 * @param error 
 * @param format 
 * @param id 
 * @param name 
 * @param params 
 * @param predefined 
 * @param settings 
 * @param tasks 
 * @param transforms 
 * @param valid 
 */

data class DataSet (

    @Json(name = "datasetLength")
    val datasetLength: kotlin.Long? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "format")
    val format: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "params")
    val params: kotlin.Any? = null,

    @Json(name = "predefined")
    val predefined: kotlin.Boolean? = null,

    @Json(name = "settings")
    val settings: DatasetSettings? = null,

    @Json(name = "tasks")
    val tasks: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "transforms")
    val transforms: kotlin.collections.List<Transform>? = null,

    @Json(name = "valid")
    val valid: kotlin.Boolean? = null

)

