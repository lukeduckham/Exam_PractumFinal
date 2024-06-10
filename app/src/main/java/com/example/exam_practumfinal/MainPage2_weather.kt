package com.example.exam_practumfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.time.DayOfWeek

class MainPage2_weather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page2_weather)

        fun main(args: Array<String>) {
            val DayOfWeek = arrayOf<String>(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
            )

            //setting up the array


            data class WeatherDays(
                val Days: String,
                val minTemp: Float,
                val maxTemp: Float,
                val WeatherCondition: String
            )

            val WeatherData = arrayOf(
                WeatherDays("Monday", 11.0f, 32.0f, "Extremely hot and humid"),
                WeatherDays("Tuesday", 15.5f, 28.0f, "Cloudy but still hot"),
                WeatherDays("Wednesday", 14.0f, 24.0f, "Huge thunderstorms in the afternoon"),
                WeatherDays("Thursday", 12.0f, 25.0f, "Slight drizzle and overcast"),
                WeatherDays("Friday", 13.0f, 27.0f, "temperature starting to increase"),
                WeatherDays("Saturday", 10.0f, 25.0f, "warm day, Cold winds during the night"),
                WeatherDays("Sunday", 8.0f, 22.0f, "Very cold winds and a icey day"),
            )

        }}}




