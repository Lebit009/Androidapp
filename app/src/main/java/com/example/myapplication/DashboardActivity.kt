package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DashboardActivity : AppCompatActivity() , View.OnClickListener{
//    private val language = arrayOf("Nepali","English","Hindi")
//    private val countries = arrayOf("Nepal","English","India")
    private lateinit var btnlng : Button
    private lateinit var btncon : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnlng : Button = findViewById(R.id.btnlng)
        val btncon : Button = findViewById(R.id.btncon)

        btnlng.setOnClickListener(this)
        btncon.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btncon -> {
                val intent = Intent(this,ListViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btnlng -> {
                val intent =Intent(this, LanguageActivity::class.java)
                startActivity(intent)
            }
        }
    }
}