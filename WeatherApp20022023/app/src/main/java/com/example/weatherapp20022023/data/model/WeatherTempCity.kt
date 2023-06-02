package com.example.weatherapp20022023.data.model

import com.google.gson.annotations.SerializedName

data class WeatherTempCity(

    val weather: List<Weather>,

    val main: Main,

    val wind: Wind,
    val clouds: Clouds,
    @SerializedName("dt")
    val sys: Sys,
    val timezone: Long,
    val name: String,
) {

}

