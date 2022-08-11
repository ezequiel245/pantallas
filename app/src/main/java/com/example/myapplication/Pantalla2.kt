package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        val btn2: Button = findViewById(R.id.button2)
        btn2.setOnClickListener{

            val intent : Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}