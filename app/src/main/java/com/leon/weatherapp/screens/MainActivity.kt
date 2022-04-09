package com.leon.weatherapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.leon.weatherapp.AppWeather
import com.leon.weatherapp.R
import com.leon.weatherapp.data.api.WeatherApi
import com.leon.weatherapp.data.api.entity.WeatherResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var result: WeatherApi



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as AppWeather).appComponent.inject(this)
        val scope = CoroutineScope(Job() + Dispatchers.IO)
        val job = scope.launch {
            val weatherResponse = result.getCurrentWeatherInTheCity("Ulyanovsk").body()
            Log.e("Rest",weatherResponse.toString())
        }

        setContentView(R.layout.activity_main)
    }
}