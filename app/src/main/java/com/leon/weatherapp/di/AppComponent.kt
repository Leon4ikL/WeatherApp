package com.leon.weatherapp.di

import com.leon.weatherapp.screens.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    NetworkModule::class
])
interface AppComponent {
    fun inject(activity: MainActivity)
}