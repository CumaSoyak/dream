package com.dream.di

import com.dream.db.CityService
import com.dream.db.CityServiceImpl
import com.dream.db.UserService
import com.dream.db.UserServiceImpl
import org.koin.dsl.module

val appModule= module {
    single<UserService> {
        UserServiceImpl()
    }
    single<CityService> {
        CityServiceImpl()
    }
}