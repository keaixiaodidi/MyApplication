package com.example.myapplication

import android.app.Application
import android.content.Context
import org.litepal.LitePal

class CoolWeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        LitePal.initialize(this)
        context = this
    }

    companion object {
        @SuppressWarnings("StaticFieldLeak")
        lateinit var context: Context
    }
}