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
 * @param adversarialAttacks 
 * @param datasetFormats 
 * @param defenses 
 * @param domainAdaptations 
 * @param metaAttacks 
 * @param metrics 
 * @param noises 
 */

data class AssetsResponse (

    @Json(name = "adversarialAttacks")
    val adversarialAttacks: kotlin.String? = null,

    @Json(name = "datasetFormats")
    val datasetFormats: kotlin.String? = null,

    @Json(name = "defenses")
    val defenses: kotlin.String? = null,

    @Json(name = "domainAdaptations")
    val domainAdaptations: kotlin.String? = null,

    @Json(name = "metaAttacks")
    val metaAttacks: kotlin.String? = null,

    @Json(name = "metrics")
    val metrics: kotlin.String? = null,

    @Json(name = "noises")
    val noises: kotlin.String? = null

)

