package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class SpinnerActivity : AppCompatActivity() {
    private val languages = arrayOf("Nepali",
        "hindi","Tamil","English")
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        spinner= findViewById(R.id.spinner)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            languages
        )
        spinner.adapter = adapter
        

    }
}