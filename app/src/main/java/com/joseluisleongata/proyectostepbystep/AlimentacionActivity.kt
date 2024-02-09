package com.joseluisleongata.proyectostepbystep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class AlimentacionActivity  : AppCompatActivity() {

    private lateinit var logoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alimentacion)


        val btnComida1: Button = findViewById(R.id.buttoncomida1)
        btnComida1.setOnClickListener {
            val intent = Intent(this, Comida1Activity::class.java)
            startActivity(intent)
        }

        val btnComida2: Button = findViewById(R.id.buttoncomida2)
        btnComida2.setOnClickListener {
            val intent = Intent(this, Comida2Activity::class.java)
            startActivity(intent)
        }
        val btnComida3: Button = findViewById(R.id.buttoncomida3)
        btnComida3.setOnClickListener {
            val intent = Intent(this, Comida3Activity::class.java)
            startActivity(intent)
        }
        val btnComida4: Button = findViewById(R.id.buttoncomida4)
        btnComida4.setOnClickListener {
            val intent = Intent(this, Comida4Activity::class.java)
            startActivity(intent)
        }




    }
}