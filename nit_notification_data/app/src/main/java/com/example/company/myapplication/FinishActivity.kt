package com.example.company.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import com.example.company.myapplication.databinding.ActivityFinishBinding
import java.lang.Exception

class FinishActivity : AppCompatActivity() {
    lateinit var binding: ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)


        try {
            binding.number.text = this.intent.getStringExtra("num").toString()

            binding.message.text = this.intent.getStringExtra("mess").toString()
        } catch (e:Exception) {
            Log.d("MYTAG-Action", e.toString())
        }
    }
}