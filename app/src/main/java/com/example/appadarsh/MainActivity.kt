package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        val text = findViewById<TextView>(R.id.myText)
        val button = findViewById<Button>(R.id.myButton)

        // Button click listener
        button.setOnClickListener {
            text.text = "Button Clicked!!"
        }
    }
}
