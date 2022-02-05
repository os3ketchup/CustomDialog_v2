package com.eldorteshaboev.customdialog_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_custom_dialog.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alertDialog = AlertDialog.Builder(this).create()
        val custom =
            LayoutInflater.from(this).inflate(R.layout.my_custom_dialog, null, false)
        alertDialog.setView(custom)


        button_click.setOnClickListener {
            custom.tv_canceler.setOnClickListener {
                Toast.makeText(this, "canceled", Toast.LENGTH_SHORT).show()
            }

                custom.button_confirmIt.setOnClickListener {
                    Toast.makeText(this, "You clicked OKAY!", Toast.LENGTH_SHORT).show()
                }




            alertDialog.show()
        }

    }
}