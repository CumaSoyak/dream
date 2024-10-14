package com.dream

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform