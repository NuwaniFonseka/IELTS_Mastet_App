package com.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbtn = findViewById<Button>(R.id.login_login_button)
        loginbtn.setOnClickListener {
            val Intent = Intent( this, SectionsActivity::class.java)
            startActivity(Intent)
        }

    }
}