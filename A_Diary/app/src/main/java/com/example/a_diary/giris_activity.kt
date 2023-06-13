package com.example.a_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class giris_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris)

        val button3=findViewById<Button>(R.id.loginBtn)

        button3.setOnClickListener{

            val intent3 = Intent(this,kayit_activity::class.java)

            startActivity(intent3)
        }

    }
}