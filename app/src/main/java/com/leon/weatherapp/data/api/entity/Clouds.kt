package com.leon.weatherapp.data.api.entity

import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all") val cloudCover: Int
)
