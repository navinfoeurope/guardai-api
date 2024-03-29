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

package com.navinfo.guardai.api.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl


import com.squareup.moshi.Json

import com.navinfo.guardai.api.infrastructure.ApiClient
import com.navinfo.guardai.api.infrastructure.ApiResponse
import com.navinfo.guardai.api.infrastructure.ClientException
import com.navinfo.guardai.api.infrastructure.ClientError
import com.navinfo.guardai.api.infrastructure.ServerException
import com.navinfo.guardai.api.infrastructure.ServerError
import com.navinfo.guardai.api.infrastructure.MultiValueMap
import com.navinfo.guardai.api.infrastructure.PartConfig
import com.navinfo.guardai.api.infrastructure.RequestConfig
import com.navinfo.guardai.api.infrastructure.RequestMethod
import com.navinfo.guardai.api.infrastructure.ResponseType
import com.navinfo.guardai.api.infrastructure.Success
import com.navinfo.guardai.api.infrastructure.toMultiValue

class VersionsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:8082")
        }
    }

    /**
     * Get platform version
     * 
     * @return kotlin.String
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPlatformVersion() : kotlin.String {
        val localVarResponse = getPlatformVersionWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get platform version
     * 
     * @return ApiResponse<kotlin.String?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getPlatformVersionWithHttpInfo() : ApiResponse<kotlin.String?> {
        val localVariableConfig = getPlatformVersionRequestConfig()

        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getPlatformVersion
     *
     * @return RequestConfig
     */
    fun getPlatformVersionRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/versions",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
