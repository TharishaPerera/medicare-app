package com.tharishaperera.medicare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LocationWindowActivity : AppCompatActivity() {

    lateinit var locationImageView : ImageView
    lateinit var continueButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_window)

        locationImageView = findViewById(R.id.locationImageView)
        continueButton = findViewById(R.id.continueButton)

        locationImageView.setOnClickListener{
            var intent = Intent(this, MapWindowActivity::class.java)
            startActivity(intent)
        }

        continueButton.setOnClickListener {
            var intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}