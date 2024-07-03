package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReadingPathActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading_path)

        val freindsbutton = findViewById<Button>(R.id.friendsbtn)
        freindsbutton.setOnClickListener {
            val Intent = Intent(this, FriendsActivity::class.java)
            startActivity(Intent)
        }
    }
}