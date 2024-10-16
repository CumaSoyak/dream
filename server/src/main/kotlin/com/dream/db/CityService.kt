package com.dream.db

import com.dream.model.City
import com.dream.model.UserInfo

interface CityService {
    suspend fun addCity(city: City): City?
    suspend fun getAllCities():List<City>
    suspend fun deleteCity(id:Int):Boolean
    suspend fun getAllUsersInfo():List<UserInfo>
}