package com.example.company.myapplication

import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        perform.setOnClickListener {
            try {
                result.setText(File(path.text.toString()).listFiles().filter { it.isFile }.size.toString())
            }catch (e:Exception){result.setText("Error")}

        }
    }
}
