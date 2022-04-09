package com.leon.weatherapp.data.api

import com.leon.weatherapp.data.api.entity.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getCurrentWeatherInTheCity(
        @Query("q") city: String,
        @Query("appId") apiKey: String = API_KEY
    ) : Response<WeatherResponse>

    private companion object{
        private const val API_KEY = "1afb9061ea7830ceff33fb8e3c3d4ddc"
    }
}