package com.example.company.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num:EditText = findViewById(R.id.number)
        val soc:EditText = findViewById(R.id.systemOfCalculus)
        val res:TextView = findViewById(R.id.convertResult)
        val btn:Button = findViewById(R.id.convertButton)

        btn.setOnClickListener {
            var resStr:String = ""
            try {
                if (soc.text.toString().toInt() > 36) resStr = "Error"
                else resStr = num.text.toString().toInt().toString(soc.text.toString().toInt())
            } catch (e: NumberFormatException) { resStr = "Error"}
            res.text = resStr
        }

    }
}
