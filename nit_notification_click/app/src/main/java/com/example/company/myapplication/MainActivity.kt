package com.example.company.myapplication

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val send_notification: Button = findViewById(R.id.send_notification)

        send_notification.setOnClickListener {


            val intent = Intent(this, FinishActivity::class.java)
            val resultIntent = PendingIntent.getActivity(this,1,intent, PendingIntent.FLAG_UPDATE_CURRENT)


            var builder = NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.alert_dark_frame)
                .setContentTitle("Title")
                .setContentIntent(resultIntent)
                .setAutoCancel(true)

            var notification = builder.build()
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(1, notification)

        }
    }
}
