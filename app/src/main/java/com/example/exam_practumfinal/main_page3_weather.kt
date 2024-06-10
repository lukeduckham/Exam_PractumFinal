package com.example.exam_practumfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class main_page3_weather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page3_weather)

        data class WeatherDays(
            val Days: String,
            val minTemp: Float,
            val maxTemp: Float,
            val WeatherCondition: String
        )





    }
}