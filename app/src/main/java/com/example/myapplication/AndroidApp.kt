package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AndroidApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_app)

        val btn1 : Button = findViewById(R.id.btn1)

        btn1.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Alert")
            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){
                dialogInterface, which ->
                Toast.makeText(applicationContext,
                        "Clicked yes",
                        Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){
                dialogInterface, which ->
                Toast.makeText(applicationContext,
                        "Clicked cancel \n operation cancel",
                        Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){
                dialogInterface, which ->
                Toast.makeText(applicationContext,
                        "Clicked no",
                        Toast.LENGTH_LONG).show()
            }
            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}