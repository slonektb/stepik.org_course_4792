package com.example.company.myapplication

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demoData = MutableList(5, {x -> "${x + 1}"})

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, demoData)
        listView1.adapter = adapter

        listView1.setOnItemClickListener { adapterView, view, i, l ->
            val myIntent = Intent(this, ListItemActivity::class.java)
            myIntent.putExtra("item", (view as TextView).text)
            startActivity(myIntent)
        }

    }
}

