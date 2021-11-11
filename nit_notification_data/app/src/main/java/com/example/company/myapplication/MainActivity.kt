package com.example.company.myapplication

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.example.company.myapplication.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.notify.setOnClickListener {

            Log.d("MYTAG","кликнул")

            var num : String
            try {
                var n = binding.number.text.toString().toInt()
                if (n == 0) num = "0"
                else num = n.toString()
            } catch (e:Exception) {
                num = ""
                Log.d("MYTAG-NUM", e.toString())
            }
            var mess:String
            try {
                mess = binding.message.text.toString()
            } catch(e:Exception) {
                mess = ""
                Log.d("MYTAG-MESS", e.toString())
            }


            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("num", num)
            intent.putExtra("mess", mess)

            val resultIntent = PendingIntent.getActivity(this,1,intent, PendingIntent.FLAG_UPDATE_CURRENT)


            var builder = NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.alert_dark_frame)
                .setContentTitle("Title")
                .setContentText(mess)
                .setContentIntent(resultIntent)
               // .setAutoCancel(true)

            var notification = builder.build()
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(1, notification)

        }
    }
}
