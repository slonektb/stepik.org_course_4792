package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun checkInput(str1:String, str2:String):String {
        var i1:Int
        var i2:Int
        try {
            i1 = str1.toInt()
            i2 = str2.toInt()
        } catch (e:Exception) {
            return "Input Error"
        }

        return "OK"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strChack:String

        add.setOnClickListener {
            strChack = checkInput(arg1.text.toString(), arg2.text.toString())
            if (strChack == "OK") {
                val summ = arg1.text.toString().toInt() + arg2.text.toString().toInt()
                answer.setText("${summ}")
            } else {
                answer.setText("${strChack}")
            }
        }

        subtr.setOnClickListener {
            strChack = checkInput(arg1.text.toString(), arg2.text.toString())
            if (strChack == "OK") {
                val summ = arg1.text.toString().toInt() - arg2.text.toString().toInt()
                answer.setText("${summ}")
            } else {
                answer.setText("${strChack}")
            }
        }

        mul.setOnClickListener {
            strChack = checkInput(arg1.text.toString(), arg2.text.toString())
            if (strChack == "OK") {
                val summ = arg1.text.toString().toInt() * arg2.text.toString().toInt()
                answer.setText("${summ}")
            } else {
                answer.setText("${strChack}")
            }
        }

        divide.setOnClickListener {
            strChack = checkInput(arg1.text.toString(), arg2.text.toString())
            if (strChack == "OK") {
                var i1:Int = arg1.text.toString().toInt()
                var i2:Int = arg2.text.toString().toInt()
                if (i2 == 0) answer.setText("Div by zero")
                else {
                    val summ = i1 / i2
                    answer.setText("${summ}")
                }
            } else {
                answer.setText("${strChack}")
            }
        }

    }
}
