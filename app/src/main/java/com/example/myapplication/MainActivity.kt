package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.ui.MainViewModel
import com.example.myapplication.ui.area.ChooseAreaFragment
import com.example.myapplication.ui.weather.WeatherActivity
import com.example.myapplication.util.InjectorUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this, InjectorUtil.getMainModelFactory())
            .get(MainViewModel::class.java)
        if (viewModel.isWeatherCached()) {
            startActivity(Intent(this, WeatherActivity::class.java))
            finish()
        } else {
            supportFragmentManager.beginTransaction().replace(R.id.container, ChooseAreaFragment())
                .commit()
        }
    }
}
