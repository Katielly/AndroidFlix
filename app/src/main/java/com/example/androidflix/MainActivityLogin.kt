package com.example.androidflix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityLogin : AppCompatActivity() {
    private lateinit var btnEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_login)

        btnEntrar = findViewById(R.id.button4)

        btnEntrar.setOnClickListener {
            val nextPage = Intent(this, MainActivityPerfil::class.java)
            startActivity(nextPage)
        }
    }
}