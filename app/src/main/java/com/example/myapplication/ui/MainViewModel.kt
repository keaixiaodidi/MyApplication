package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.WeatherRepository

class MainViewModel(private val repository: WeatherRepository) : ViewModel() {

    fun isWeatherCached() = repository.isWeatherCached()

}