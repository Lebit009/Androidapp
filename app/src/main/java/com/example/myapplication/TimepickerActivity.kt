package com.example.myapplication

import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class TimepickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timepicker)

        var btnLoad : Button = findViewById(R.id.btnLoadTime)
        var tvTime : TextView = findViewById(R.id.tvTime)
        btnLoad.setOnClickListener {
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)
            //startActivity(Intent(this,MainActivity::class.java))

            val timepick = TimePickerDialog(this,
                TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                    tvTime.text = "$hourOfDay:$minute"
                },
                hour, minute,false
            )
            timepick.show()
        }
    }
}
