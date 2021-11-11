package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here

        val btn:Button = findViewById(R.id.butAnswer)
        val tvA:TextView = findViewById(R.id.tvAnswer)
        val rgA:RadioGroup = findViewById(R.id.rgAnswers)

        btn.setOnClickListener {
            var res:String = ""
            if (rgA.checkedRadioButtonId == R.id.rbSphere) {
                res = "Правильно!"
            } else {
                res = "Неправильно!"
            }
            tvA.setText("${res}")
        }

    }
}
