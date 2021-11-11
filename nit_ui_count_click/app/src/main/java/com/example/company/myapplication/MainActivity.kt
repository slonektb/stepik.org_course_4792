package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        var tw: TextView = findViewById(R.id.textView)

        var clickCout:Int = 0

        tw.setOnClickListener {
            clickCout++
            tw.setText("${clickCout}")
        }

    }
}
