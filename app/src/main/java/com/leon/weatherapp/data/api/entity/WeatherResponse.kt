package com.leon.weatherapp.data.api.entity

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("cod") val requestCode: Int,
    @SerializedName("dt") val date: Long,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("main") val main: MainWeather,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("clouds") val clouds: Clouds,
)

