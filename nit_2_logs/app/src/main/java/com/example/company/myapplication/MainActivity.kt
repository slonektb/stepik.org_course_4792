package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.company.lib.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here

        Log.d("DEBUG","111111111111")
        Log.w("WARNING", "22222222222222")
        Log.e("ERROR", "3333333333333333")
        Log.i("INFO","444444444444")

        Log.printAnswer()

    }
}
