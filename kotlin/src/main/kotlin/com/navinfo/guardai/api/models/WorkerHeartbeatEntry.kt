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
 * @param cancel 
 * @param id 
 * @param lastUpdateTime 
 * @param status 
 */

data class WorkerHeartbeatEntry (

    @Json(name = "cancel")
    val cancel: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "lastUpdateTime")
    val lastUpdateTime: kotlin.Long? = null,

    @Json(name = "status")
    val status: WorkerHeartbeatEntry.Status? = null

) {

    /**
     * 
     *
     * Values: cANCELLED,dONE,eRR,iDLE,iNITIALIZING,rUNNING,sUBMITTED
     */
    enum class Status(val value: kotlin.String) {
        @Json(name = "CANCELLED") cANCELLED("CANCELLED"),
        @Json(name = "DONE") dONE("DONE"),
        @Json(name = "ERR") eRR("ERR"),
        @Json(name = "IDLE") iDLE("IDLE"),
        @Json(name = "INITIALIZING") iNITIALIZING("INITIALIZING"),
        @Json(name = "RUNNING") rUNNING("RUNNING"),
        @Json(name = "SUBMITTED") sUBMITTED("SUBMITTED");
    }
}

