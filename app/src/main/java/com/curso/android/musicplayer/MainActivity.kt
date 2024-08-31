package com.curso.android.musicplayer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var startBtn : Button
    lateinit var stopBtn : Button
    lateinit var title : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        startBtn = findViewById(R.id.start_btn)
        stopBtn = findViewById(R.id.stop_btn)
        title = findViewById(R.id.tittle)

        startBtn.setOnClickListener {
            val serviceIntent : Intent = Intent(applicationContext, MyCustomService::class.java)
            startService(serviceIntent)
        }

        stopBtn.setOnClickListener {
            val serviceIntent : Intent = Intent(applicationContext, MyCustomService::class.java)
            stopService(serviceIntent)
        }
    }
}