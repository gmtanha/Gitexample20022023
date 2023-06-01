package com.example.weatherapp20022023.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("data/2.5/weather")
    suspend fun callTempFromCityName(
        @Query("appid") appid: String,
        @Query("units") units: String,
        @Query("q") q: String
    )
}