package com.example.app_main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this, InjectorUtil.getMainModelFactory()).get(MainViewModel::class.java)
//        if (viewModel.isWeatherCached()) {
//            val intent = Intent(this, WeatherActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
    }
}
