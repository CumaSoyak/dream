package com.dream.plugins

import com.dream.db.CityService
import com.dream.db.UserService
import com.dream.routes.cityRoute
import com.dream.routes.userRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.get

fun Application.configureRouting(userService: UserService =get(), cityService: CityService =get()) {
    routing {
        userRoute(userService)
        cityRoute(cityService)
    }
}
