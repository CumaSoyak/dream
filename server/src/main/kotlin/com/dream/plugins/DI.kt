package com.dream.plugins

import com.dream.di.appModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun Application.configureDI(){
    install(Koin){
        modules(appModule)
    }
}