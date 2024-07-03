package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val acitivtymainbtn = findViewById<ImageButton>(R.id.mainview_imageButton)
        acitivtymainbtn.setOnClickListener {
            val Intent = Intent( this, GetStartedActivity::class.java)
            startActivity(Intent)
        }

    }
}