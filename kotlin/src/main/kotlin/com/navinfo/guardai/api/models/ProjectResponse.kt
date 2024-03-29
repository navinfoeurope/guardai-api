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

import com.navinfo.guardai.api.models.ModelResponse
import com.navinfo.guardai.api.models.OrganizationResponse
import com.navinfo.guardai.api.models.PipelineResponse
import com.navinfo.guardai.api.models.ProjectSettings

import com.squareup.moshi.Json

/**
 * 
 *
 * @param dataRef 
 * @param id 
 * @param message 
 * @param model 
 * @param modelId 
 * @param modelName 
 * @param name 
 * @param organization 
 * @param pipelines 
 * @param settings 
 * @param uid 
 * @param verified 
 * @param wrapperRef 
 */

data class ProjectResponse (

    @Json(name = "dataRef")
    val dataRef: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "model")
    val model: ModelResponse? = null,

    @Json(name = "modelId")
    val modelId: kotlin.Long? = null,

    @Json(name = "modelName")
    val modelName: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "organization")
    val organization: OrganizationResponse? = null,

    @Json(name = "pipelines")
    val pipelines: kotlin.collections.List<PipelineResponse>? = null,

    @Json(name = "settings")
    val settings: ProjectSettings? = null,

    @Json(name = "uid")
    val uid: kotlin.String? = null,

    @Json(name = "verified")
    val verified: kotlin.Boolean? = null,

    @Json(name = "wrapperRef")
    val wrapperRef: kotlin.String? = null

)

