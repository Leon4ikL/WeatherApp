package com.leon.weatherapp.domain.repository

import com.leon.weatherapp.domain.models.CurrentWeather
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherByTheCityName(cityName: String): Flow<CurrentWeather>
}