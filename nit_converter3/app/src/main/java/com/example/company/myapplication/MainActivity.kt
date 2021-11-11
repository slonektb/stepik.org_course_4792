package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_inc:EditText = findViewById(R.id.editText)
        val et_km:EditText = findViewById(R.id.editText2)
        val tw:TextView = findViewById(R.id.status)

        val constIncInKm:Float = 39370.0F

        et_inc.addTextChangedListener(object:TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (et_inc.isFocused()) {
                    try {
                        val res:Float = p0.toString().toFloat() / constIncInKm
                        et_km.setText("${res}")
                        tw.setText("")
                    } catch (e:Exception) {
                        tw.setText("error")
                    }
                }
            }

        })


        et_km.addTextChangedListener(object:TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (et_km.isFocused()) {
                    try {
                        val res:Float = p0.toString().toFloat() * constIncInKm
                        et_inc.setText("${res}")
                        tw.setText("")
                    } catch (e:Exception) {
                        tw.setText("error")
                    }
                }
            }

        })

    }
}
