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

        val demoData = MutableList(11, {x -> "${x * x}"})

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, demoData)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            var str = (view as TextView).text
            demoData.remove(str.toString())
            //
            adapter.notifyDataSetChanged()

        }
    }
}
