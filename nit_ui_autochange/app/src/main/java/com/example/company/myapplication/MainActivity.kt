package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        var countChange:Int = 0

        val tw:TextView = findViewById(R.id.textView)
        val et:EditText = findViewById(R.id.editText)
        var regEx: String = ""
        var replStr: String = ""

        et.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val strMod:String = p0.toString()
                var isChange:Boolean = false

                if (strMod.contains("question")) {
                    countChange++
                    regEx = "question"
                    replStr = "answer"
                    isChange = true
                }
                if (strMod.contains("request")) {
                    countChange++
                    regEx = "request"
                    replStr = "response"
                    isChange = true
                }
                if (strMod.contains("problem")) {
                    countChange++
                    regEx = "problem"
                    replStr = "task"
                    isChange = true
                }

                if (isChange) {
                    tw.setText("${countChange}")

                    val newStr = strMod.replace(regEx, replStr)
                    et.setText("${newStr}")
                    et.setSelection(newStr.length)
                }

            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

    }
}
