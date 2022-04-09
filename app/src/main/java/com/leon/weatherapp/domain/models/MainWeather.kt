package com.leon.weatherapp.domain.models

data class MainWeather (
    val temp: Double,
    val feelsLikeTemp: Double,
    val tempMin: Double,
    val tempMax: Double,
    val pressure: Int,
    val humidity: Int,
    val seaLevel: Int
)