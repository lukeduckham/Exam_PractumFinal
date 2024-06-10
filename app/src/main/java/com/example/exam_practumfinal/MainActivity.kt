package com.example.exam_practumfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ContinueButton = findViewById<Button>(R.id.ContinueButton)
        ContinueButton.setOnClickListener {
            val Intent = Intent(this,MainPage2_weather::class.java)
            startActivity(Intent)

// declared my continue button and put in the code for it to go onto the next page

        val ExitButton = findViewById<Button>(R.id.ExitButton)
            ExitButton.setOnClickListener {
                val Intent = Intent(this,MainActivity::class.java)
                startActivity(Intent)

 // declared my exit button and put in the code for it to go onto the next page

                ContinueButton?.setOnClickListener {
                    Toast.makeText(this@MainActivity,
                        "Feed Button clicked", Toast.LENGTH_SHORT).show()

                     ExitButton?.setOnClickListener {
                        Toast.makeText(this@MainActivity,
                            "Feed Button clicked", Toast.LENGTH_SHORT).show()

//this code is for the indication that the button has been clicked

                    }}}}}}

/* References:

The Independent Institution of Education. (2024). Introduction to Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg.
[online] Available at: Tertiary Students - IMAD5112MM.pdf - Default View (sharepoint.com).[Accessed : 1 May 2024]
/*

 */