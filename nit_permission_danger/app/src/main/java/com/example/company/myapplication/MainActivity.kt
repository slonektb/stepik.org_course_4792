package com.example.company.myapplication

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val status = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
            if (status == PackageManager.PERMISSION_GRANTED) {
                //code
            } else {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), REQ_CODE)
            }

        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            REQ_CODE -> {
                if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Разрешение выдано, можно использовать "опасный" функционал
                    textView.text = "Granted"
                } else {
                    // Разрешение не выдано, необходимо использовать другой способ
                    textView.text = "Denied"
                }
                return
            }
            else -> {
                // id запроса не совпадает с ожидаемым, игнорируем
            }
        }
    }
}
