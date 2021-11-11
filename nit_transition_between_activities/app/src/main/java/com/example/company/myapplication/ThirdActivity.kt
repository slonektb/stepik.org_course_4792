package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        button_next3.setOnClickListener{
            val myIntent_next = Intent(this, MainActivity::class.java)
            startActivity(myIntent_next)
        }
        button_prev3.setOnClickListener {
            val myIntent_prev = Intent(this, SecondActivity::class.java)
            startActivity(myIntent_prev)
        }

    }
}
