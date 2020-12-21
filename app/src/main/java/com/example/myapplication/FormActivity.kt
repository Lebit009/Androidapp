package com.example.myapplication

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.util.*


class FormActivity : AppCompatActivity() {
    private val department = arrayOf("IOT", "Android", "Web Development", "Academic Writing")
    private lateinit var tv1: TextView
    private lateinit var tv2: TextView
    private lateinit var tv3: TextView
    private lateinit var tv4: TextView
    private lateinit var tv5: TextView
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var et3: EditText
    private lateinit var btnSubmit: Button
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)
        tv3 = findViewById(R.id.tv3)
        tv4 = findViewById(R.id.tv4)
        tv5 = findViewById(R.id.tv5)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        et3 = findViewById(R.id.et3)
        btnSubmit = findViewById(R.id.btnSubmit)
        spinner = findViewById(R.id.spinner)
        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                department
        )
        spinner.adapter = adapter
        btnSubmit.setOnClickListener {
            submit();
        }
        et3.setOnClickListener{
            date();
        }

    }
    fun submit(){
        tv5.text = "${et1.text.toString()}" +
                "\n${spinner.selectedItem.toString()}"+
                    "\n${et2.text.toString()}" +
                "\n${et3.text.toString()}"

    }
    fun date(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datee = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    et3.setText("$dayOfMonth/$month/$year");
                },
                year, month, day
        )
        datee.show()
    }
}