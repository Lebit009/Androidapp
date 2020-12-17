package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    private val countries = arrayOf("Nepal","English","China")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listview: ListView = findViewById(R.id.listview)

        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                countries
        )
        listview.adapter = adapter
        listview.setOnItemClickListener { parent, view, position, id ->
            val element = parent.getItemAtPosition(position).toString()
            Toast.makeText(this,element,Toast.LENGTH_LONG).show()
        }
    }
}