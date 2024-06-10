package com.example.exam_practumfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Forcast_weather : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forcast_weather)

        val BackMain = findViewById<Button>(R.id.BackMain)
        BackMain.setOnClickListener {
            val Intent = Intent(this,MainPage2_weather::class.java)
            startActivity(Intent)

    }
}}