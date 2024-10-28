package com.example.androidflix

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityPerfil : AppCompatActivity() {
    private lateinit var perfilSidnei: ImageView
    private lateinit var perfilSocorro: ImageView
    private lateinit var perfilHeitor: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContentView(R.layout.activity_main_perfil)
        perfilSidnei = findViewById(R.id.perfilSidnei)
        perfilSocorro = findViewById(R.id.imageView5)
        perfilHeitor = findViewById(R.id.imageView6)

        perfilHeitor.setOnClickListener {
            navigation(MainActivityDelhates::class.java)
        }
        perfilSocorro.setOnClickListener {
            navigation(MainActivityDelhates::class.java)
        }
        perfilSidnei.setOnClickListener {
            navigation(MainActivityDelhates::class.java)
        }
    }

    fun navigation(destino: Class<*>){
        val intent = Intent(this, destino)
        startActivity(intent)
    }
}