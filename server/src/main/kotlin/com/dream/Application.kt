package com.dream


import com.dream.plugins.configureDI
import com.dream.plugins.configureDatabases
import com.dream.plugins.configureMonitoring
import com.dream.plugins.configureRouting
import com.dream.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureMonitoring()
    configureDI()
    configureSerialization()
    configureDatabases()
    configureRouting()
}