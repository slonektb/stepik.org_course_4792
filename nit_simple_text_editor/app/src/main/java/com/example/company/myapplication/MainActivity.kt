package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here

        var textInMemory:String = ""
        var countWords:Int = 0

        val ed:EditText = findViewById(R.id.editText)
        val sv:TextView = findViewById(R.id.stats_view)
        val ucv:TextView = findViewById(R.id.unsaved_changes_view)
        val sBtn:Button = findViewById(R.id.save_button)
        val lBtn:Button = findViewById(R.id.load_button)
        val cBtn:Button = findViewById(R.id.clear_button)

        ed.addTextChangedListener(object:TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString() == textInMemory) {
                    ucv.setText("All changes saved")
                } else {ucv.setText("Unsaved changes")}

                val collection1 = p0.toString().split("[^a-zA-Zа-яА-я0-9_]+".toRegex())
                if (collection1.size > 1)  countWords = collection1.size - 1
                else countWords = collection1.size
                sv.setText("${countWords}")
            }
        })

        sBtn.setOnClickListener {
            textInMemory = ed.text.toString()
            ucv.setText("All changes saved")
        }

        lBtn.setOnClickListener {
            ed.setText("${textInMemory}")
        }

        cBtn.setOnClickListener {
            ed.setText("")
        }
    }
}
