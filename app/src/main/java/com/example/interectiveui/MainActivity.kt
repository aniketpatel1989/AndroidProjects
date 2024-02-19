package com.example.interectiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonYellow = findViewById<Button>(R.id.btnyellow)
        val buttonDark = findViewById<Button>(R.id.btndark)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)

        buttonYellow.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
            }

        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
    }
}