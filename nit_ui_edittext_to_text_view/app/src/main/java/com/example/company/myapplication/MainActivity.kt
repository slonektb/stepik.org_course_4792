package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        val tw:TextView = findViewById(R.id.textView)
        val et:EditText = findViewById(R.id.editText)
        val bt:Button = findViewById(R.id.button)

        bt.setOnClickListener {
            tw.setText("${et.text}")
        }

    }
}
