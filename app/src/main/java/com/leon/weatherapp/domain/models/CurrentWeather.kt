package com.leon.weatherapp.domain.models

import java.util.*

data class CurrentWeather(
    val id: Int,
    val cityName: String,
    val date: Date,
    val visibility: Int,
    val weatherParam: String,
    val weatherDescription: String,
    val mainWeather: MainWeather,
    val wind: Wind,
    val clouds: Int,
)
