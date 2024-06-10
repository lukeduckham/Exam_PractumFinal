package com.example.exam_practumfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class main_page3_weather : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page3_weather)

        data class WeatherDays(
            val Days: String,
            val minTemp: Float,
            val maxTemp: Float,
            val WeatherCondition: String
        )

        val ClickButton= findViewById<Button>(R.id.ClickButton)
        ClickButton.setOnClickListener {
            val Intent = Intent(this,MainPage2_weather::class.java)
            startActivity(Intent)



    }
}}