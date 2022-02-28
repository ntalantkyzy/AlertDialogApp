package com.example.alertdialogapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import cn.pedant.SweetAlert.SweetAlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val dialog = SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
            dialog.progressHelper.barColor = Color.parseColor("#A5DC86")
            dialog.titleText = "OK"
            dialog.setCancelable(false)
            dialog.show()

            val button: Button = findViewById(R.id.btn_ok)
            button.setOnClickListener {
                val dialog = SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                dialog.progressHelper.barColor = Color.parseColor("#A5DC86")
                dialog.titleText = "OK"
                dialog.setCancelable(false)
                dialog.show()


            }

        }
    }
}