package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val homeimg = findViewById<ImageView>(R.id.imageViewhome)
        homeimg.setOnClickListener {
            val Intent = Intent(this, SectionsActivity::class.java)
            startActivity(Intent)
        }

        val profileimg = findViewById<ImageView>(R.id.imageViewprofilesettings)
        profileimg.setOnClickListener {
            val Intent = Intent(this, ProfileActivity::class.java)
            startActivity(Intent)
        }

        val closeimgg = findViewById<ImageView>(R.id.imageViewclose)
        closeimgg.setOnClickListener {
            val Intent = Intent(this, SectionsActivity::class.java)
            startActivity(Intent)
        }

    }
}