package com.leon.weatherapp

import android.app.Application
import com.leon.weatherapp.di.AppComponent
import com.leon.weatherapp.di.DaggerAppComponent

class AppWeather: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}