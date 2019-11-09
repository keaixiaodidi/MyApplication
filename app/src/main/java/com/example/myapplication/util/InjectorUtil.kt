package com.example.myapplication.util

import com.example.myapplication.data.PlaceRepository
import com.example.myapplication.data.WeatherRepository
import com.example.myapplication.data.db.CoolWeatherDatabase
import com.example.myapplication.data.network.CoolWeatherNetwork
import com.example.myapplication.ui.MainModelFactory
import com.example.myapplication.ui.area.ChooseAreaModelFactory
import com.example.myapplication.ui.weather.WeatherModelFactory

object InjectorUtil {

    private fun getPlaceRepository() = PlaceRepository.getInstance(
        CoolWeatherDatabase.getPlaceDao(),
        CoolWeatherNetwork.getInstance()
    )

    private fun getWeatherRepository() = WeatherRepository.getInstance(
        CoolWeatherDatabase.getWeatherDao(),
        CoolWeatherNetwork.getInstance()
    )

    fun getChooseAreaModelFactory() = ChooseAreaModelFactory(getPlaceRepository())

    fun getWeatherModelFactory() = WeatherModelFactory(getWeatherRepository())

    fun getMainModelFactory() = MainModelFactory(getWeatherRepository())
}