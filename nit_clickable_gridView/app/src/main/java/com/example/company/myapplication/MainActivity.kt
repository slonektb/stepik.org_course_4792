package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Array(31, {x -> "${x}"})
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        gridView.adapter = adapter

        gridView.numColumns = 4

        gridView.setOnItemClickListener { adapterView, view, i, l ->
            var row = (1 + i / gridView.numColumns)
            var col = (1 + i % gridView.numColumns)
            (view as TextView).text = "${row},${col}"

        }
    }
}
