package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        perform.setOnClickListener {
            var path = Environment.getExternalStorageDirectory()
            var fileName = filepath.text.toString()
            var readFile = File(path, fileName)
            var fileName2 = filepath2.text.toString()
            var readFile2 = File(path, fileName2)

            if (readFile.exists() && readFile2.exists()) {
                var buff = readFile2.readText()
                readFile2.writeText(readFile.readText())
                readFile.writeText(buff)

            } else {
                if (!readFile.exists()) filepath.setText("error")
                if (!readFile2.exists()) filepath2.setText("error")
            }

        }

    }
}
