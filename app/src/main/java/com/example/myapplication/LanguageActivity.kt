package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class LanguageActivity : AppCompatActivity() {
    private val language = arrayOf(
        "Nepali","Nepal",
        "English","USA",
        "Chinese","China")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
            val listview: ListView = findViewById(R.id.listview)
            val languageMap = mutableMapOf<String,String>()

        for (i in language.indices step 2){
            languageMap[language[i]]=language[i + 1]
        }

            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                languageMap.keys.toTypedArray()
            )
            listview.adapter = adapter
            listview.setOnItemClickListener { parent, view, position, id ->
                val element = parent.getItemAtPosition(position).toString()
                Toast.makeText(this,element, Toast.LENGTH_LONG).show()
            }
    }
}