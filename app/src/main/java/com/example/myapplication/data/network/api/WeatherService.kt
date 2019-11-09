package com.example.myapplication.data.network.api

import com.example.myapplication.data.model.weather.HeWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("api/weather")
    fun getWeather(@Query("cityid") weatherId: String): Call<HeWeather>

    @GET("api/bing_pic")
    fun getBingPic(): Call<String>

}