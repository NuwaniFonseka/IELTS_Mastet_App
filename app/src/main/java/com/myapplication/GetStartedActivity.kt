package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val getstartedbtn = findViewById<Button>(R.id.Getstarted_button)
        getstartedbtn.setOnClickListener {
            val Intent = Intent( this, WelcomeActivity::class.java)
            startActivity(Intent)
        }
    }
}