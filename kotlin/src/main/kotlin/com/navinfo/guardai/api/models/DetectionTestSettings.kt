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

import com.navinfo.guardai.api.models.DatasetSetting

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param params 
 * @param passDeviations 
 * @param poisonedDatasetSetting 
 */

data class DetectionTestSettings (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "params")
    val params: kotlin.Any? = null,

    @Json(name = "passDeviations")
    val passDeviations: kotlin.Float? = null,

    @Json(name = "poisonedDatasetSetting")
    val poisonedDatasetSetting: DatasetSetting? = null

)

