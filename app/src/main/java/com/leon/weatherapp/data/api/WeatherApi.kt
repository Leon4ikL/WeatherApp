package com.leon.weatherapp.data.api

import com.leon.weatherapp.data.api.entity.WeatherResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherApi {

    @GET("data/2.5/weather?q={city}&appid=$API_KEY")
    fun getCurrentWeatherInTheCity(@Path("city") city: String) : Flow<WeatherResponse>

    private companion object{
        private const val API_KEY = "1afb9061ea7830ceff33fb8e3c3d4ddc"
    }
}