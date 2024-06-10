package com.example.exam_practumfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ContinueButton = findViewById<Button>(R.id.ContinueButton)
        ContinueButton.setOnClickListener {
            val Intent = Intent(this,MainPage2_weather::class.java)
            startActivity(Intent)



        val ExitButton = findViewById<Button>(R.id.ExitButton)
            ExitButton.setOnClickListener {
                val Intent = Intent(this,MainActivity::class.java)
                startActivity(Intent)
    }
}}}