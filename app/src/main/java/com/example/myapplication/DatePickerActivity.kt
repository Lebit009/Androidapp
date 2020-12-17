package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    private lateinit var btnCalender : Button
    private lateinit var tvDate : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        btnCalender = findViewById(R.id.btncalender)
        tvDate = findViewById(R.id.tvDate)

        btnCalender.setOnClickListener {
            loadCalender()
        }
    }

    private fun loadCalender() {
        val c =Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datee = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                tvDate.text = "Selected Date : $dayOfMonth/$month/$year"
            },
            year,month,day
        )
        datee.show()

    }

    }