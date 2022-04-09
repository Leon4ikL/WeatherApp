package com.leon.weatherapp.domain.usecases

import com.leon.weatherapp.domain.models.CurrentWeather
import com.leon.weatherapp.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetWeatherByTheCityName @Inject constructor(private val repository: WeatherRepository) {
    operator fun invoke(cityName: String): Flow<CurrentWeather> {
        return repository.getWeatherByTheCityName(cityName)
    }
}