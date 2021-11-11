package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)

            startActivity(myIntent)
        }

    }

    override fun onPause() {
        super.onPause()
        this.intent.putExtra("text",editText.text.toString())

    }

    override fun onResume() {
        super.onResume()
        editText.setText("")
        textView.text = this.intent.getStringExtra("text")
    }
}
