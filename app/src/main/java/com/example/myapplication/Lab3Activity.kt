package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Lab3Activity : AppCompatActivity() {
    private lateinit var tv1:TextView
    private lateinit var et1:EditText
    private lateinit var et2:EditText
    private lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab3)

        tv1 = findViewById(R.id.tv1)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            login()
        }
    }

    private fun login() {
        if (et1.text.toString()=="admin" && et2.text.toString()=="admin"){
            Toast.makeText(this, "You are logged in",Toast.LENGTH_LONG).show()
        }
    }
}