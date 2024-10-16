package com.dream

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/**
 * @Author: cuma soyak
 * @Date: 14.10.2024
 */
class DreamApi(
    var baseUrl: String = "http://localhost:8090"
) {

    val client = HttpClient() {
        install(ContentNegotiation) {
            json(Json { isLenient = true; ignoreUnknownKeys = true })
        }
    }

    suspend fun fetchData(): List<City> = client.get("$baseUrl/cities").body<List<City>>()
}