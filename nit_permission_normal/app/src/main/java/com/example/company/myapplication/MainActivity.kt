package com.example.company.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var thr = object : Thread() {
                val url: String = editText.text.toString()
                override fun run() {
                    var code = 0
                    try {
                       var connection: HttpURLConnection? = null
                       connection = URL(url).openConnection() as HttpURLConnection
                       connection.connect()
                       code = connection.responseCode
                   } catch (e:Exception) {

                   }
                    if (code == 200) textView.text = "Ok"
                    else textView.text = "Failed"
                }

            }
            thr.start()
        }
    }
}
