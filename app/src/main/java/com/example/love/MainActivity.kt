package com.example.love

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countText = findViewById<TextView>(R.id.countText)
        val tapButton = findViewById<Button>(R.id.tapButton)

        var count = 0

        tapButton.setOnClickListener {
            count = count + 1
            countText.text = count.toString()
        }
    }
}