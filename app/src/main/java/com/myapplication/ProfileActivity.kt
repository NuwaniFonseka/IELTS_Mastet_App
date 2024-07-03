package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val homeimg = findViewById<ImageView>(R.id.imageViewhomeprofile)
        homeimg.setOnClickListener {
            val Intent = Intent(this, SectionsActivity::class.java)
            startActivity(Intent)
        }

        val settingimg = findViewById<ImageView>(R.id.imageView1settingsprofile)
        settingimg.setOnClickListener {
            val Intent = Intent(this, SettingsActivity::class.java)
            startActivity(Intent)
        }

        val badgesbtn = findViewById<Button>(R.id.buttonbadges)
        badgesbtn.setOnClickListener {
            val Intent = Intent(this, BadgesActivity::class.java)
            startActivity(Intent)
        }

        val closeimg = findViewById<ImageView>(R.id.imageViewclosee)
        closeimg.setOnClickListener {
            val Intent = Intent(this, SectionsActivity::class.java)
            startActivity(Intent)
        }

    }
}