package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signup = findViewById<Button>(R.id.signup_signup_button)
        signup.setOnClickListener {
            val Intent = Intent( this, SectionsActivity::class.java)
            startActivity(Intent)
        }
    }
}