package com.dream

import kotlinx.serialization.Serializable

/**
 * @Author: cuma soyak
 * @Date: 14.10.2024
 */
@Serializable
data class City(
    val cityName:String,
    val id:Int=0
)