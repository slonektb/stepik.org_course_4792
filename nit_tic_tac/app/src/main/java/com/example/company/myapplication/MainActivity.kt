package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.Math.abs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here

        val toChooseList: List<String> = listOf("", "0", "X")

        val tv:TextView = findViewById(R.id.status)

        var spinner11: Spinner = findViewById(R.id.spinner11)
        var spinner12: Spinner = findViewById(R.id.spinner12)
        var spinner13: Spinner = findViewById(R.id.spinner13)
        var spinner21: Spinner = findViewById(R.id.spinner21)
        var spinner22: Spinner = findViewById(R.id.spinner22)
        var spinner23: Spinner = findViewById(R.id.spinner23)
        var spinner31: Spinner = findViewById(R.id.spinner31)
        var spinner32: Spinner = findViewById(R.id.spinner32)
        var spinner33: Spinner = findViewById(R.id.spinner33)

        //Создаем adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, toChooseList)
        // Устанавливаем layout, который будем использовать при появлении списка вариантов
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // устанавливаем связь между spinner и adapter
        spinner11.setAdapter(adapter)
        spinner12.setAdapter(adapter)
        spinner13.setAdapter(adapter)
        spinner21.setAdapter(adapter)
        spinner22.setAdapter(adapter)
        spinner23.setAdapter(adapter)
        spinner31.setAdapter(adapter)
        spinner32.setAdapter(adapter)
        spinner33.setAdapter(adapter)
        // Привязываем методы onItemSelected и onNothingSelected к spinner
        spinner11.setOnItemSelectedListener(this)
        spinner12.setOnItemSelectedListener(this)
        spinner13.setOnItemSelectedListener(this)
        spinner21.setOnItemSelectedListener(this)
        spinner22.setOnItemSelectedListener(this)
        spinner23.setOnItemSelectedListener(this)
        spinner31.setOnItemSelectedListener(this)
        spinner32.setOnItemSelectedListener(this)
        spinner33.setOnItemSelectedListener(this)

        var arrField = arrayOf<Array<String>>()
        for (i in 0..2) {
            var arr = arrayOf<String>()
            for (j in 0..2) {
                arr += ""
            }
            arrField += arr
        }

        spinner11.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[0][0] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }


        spinner12.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[0][1] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }

        spinner13.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[0][2] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }


        spinner21.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[1][0] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }

        spinner22.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[1][1] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }

        spinner23.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[1][2] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }

        spinner31.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[2][0] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }

        spinner32.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[2][1] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }

        spinner33.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                arrField[2][2] = toChooseList[position]
                //Toast.makeText(applicationContext,"choose spin11 ${d11}", Toast.LENGTH_SHORT).show()
                tv.setText(checkEntry(arrField))
            }
        }


    }
    fun checkEntry (arrField:Array<Array<String>>):String {
        var answer:String = ""
        var count0:Int = 0
        var countX:Int = 0
        var countNull:Int = 0
        for (i in 0..2)
            for (j in 0..2) {
                if (arrField[i][j] == "0") count0++
                else if (arrField[i][j] == "X") countX++
                else countNull++
            }
        if (abs(count0-countX) >= 2) return "Invalid"

        if (arrField[0][0] == arrField[0][1] && arrField[0][1] == arrField[0][2] && arrField[0][2] != "") return arrField[0][0] + " won"
        if (arrField[1][0] == arrField[1][1] && arrField[1][1] == arrField[1][2] && arrField[1][2] != "") return arrField[1][0] + " won"
        if (arrField[2][0] == arrField[2][1] && arrField[2][1] == arrField[2][2] && arrField[2][2] != "") return arrField[2][0] + " won"

        if (arrField[0][0] == arrField[1][0] && arrField[1][0] == arrField[2][0] && arrField[2][0] != "") return arrField[0][0] + " won"
        if (arrField[0][1] == arrField[1][1] && arrField[1][1] == arrField[2][1] && arrField[2][1] != "") return arrField[0][1] + " won"
        if (arrField[0][2] == arrField[1][2] && arrField[1][2] == arrField[2][2] && arrField[2][2] != "") return arrField[0][2] + " won"

        if (arrField[0][0] == arrField[1][1] && arrField[1][1] == arrField[2][2] && arrField[2][2] != "") return arrField[0][0] + " won"
        if (arrField[0][2] == arrField[1][1] && arrField[1][1] == arrField[2][0] && arrField[2][0] != "") return arrField[0][2] + " won"


        if (countNull == 0) return "Draw"

        return answer
    }
}

private fun Spinner.setOnItemSelectedListener(mainActivity: MainActivity) {


}
