package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        val homeimg = findViewById<ImageView>(R.id.imageViewhomereading)
        homeimg.setOnClickListener {
            val Intent = Intent(this, SectionsActivity::class.java)
            startActivity(Intent)
        }

        val profileimg = findViewById<ImageView>(R.id.imageViewaccountreading)
        profileimg.setOnClickListener {
            val Intent = Intent(this, ProfileActivity::class.java)
            startActivity(Intent)
        }

        val settingsimg = findViewById<ImageView>(R.id.imageViewsettingreading)
        settingsimg.setOnClickListener {
            val Intent = Intent(this, SettingsActivity::class.java)
            startActivity(Intent)
        }

        val closeimg = findViewById<ImageView>(R.id.imageView2)
        closeimg.setOnClickListener {
            val Intent = Intent(this, ReadingPathActivity::class.java)
            startActivity(Intent)
        }
    }
}