package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SectionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sections)

        val readingbtn = findViewById<Button>(R.id.reading_button)
        readingbtn.setOnClickListener {
            val Intent = Intent(this, ReadingPathActivity::class.java)
            startActivity(Intent)
        }

        val settingimg = findViewById<ImageView>(R.id.settingsimageView)
        settingimg.setOnClickListener {
            val Intent = Intent(this, SettingsActivity::class.java)
            startActivity(Intent)
        }

        val profileimg = findViewById<ImageView>(R.id.accountimageView)
        profileimg.setOnClickListener {
            val Intent = Intent(this, ProfileActivity::class.java)
            startActivity(Intent)
        }
    }
}