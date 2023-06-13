package com.example.a_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.loginBtn)
        val button2=findViewById<Button>(R.id.skipBtn)

        button.setOnClickListener{

            val intent = Intent(this,giris_activity::class.java)

            startActivity(intent)
        }

        button2.setOnClickListener{

            val intentt = Intent(this,kayit_activity::class.java)

            startActivity(intentt)
        }
    }
}