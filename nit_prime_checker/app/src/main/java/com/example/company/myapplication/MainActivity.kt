package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    fun isPrime(x: Int) : Boolean {
        var k = 2
        while (k * k <= x && x % k != 0) k ++
        return x > 1 && k * k > x
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here

        val et:EditText = findViewById(R.id.editText)
        val cb:Button = findViewById(R.id.checkBtn)
        val tw:TextView = findViewById(R.id.textView)

        cb.setOnClickListener {
            var strAnswer:String = ""
            var inputNum:Int = 0;
            try {
                inputNum = et.text.toString().toInt()
                if (isPrime(inputNum) && inputNum > 1) strAnswer = "prime"
                else strAnswer = "not prime"
            } catch (e:Exception) {
                strAnswer = "error"
            }
            tw.setText("${strAnswer}")
        }

    }
}
