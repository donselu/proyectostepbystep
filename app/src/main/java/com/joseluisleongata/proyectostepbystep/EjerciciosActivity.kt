package com.joseluisleongata.proyectostepbystep

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class EjerciciosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios)

        // Botón "entrenamiento de Pecho"
        val btnEntrenamientoPecho: Button = findViewById(R.id.entrenamientoPecho)
        btnEntrenamientoPecho.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }

        // Botón "entrenamiento de Espalda"
        val btnEntrenamientoEspalda: Button = findViewById(R.id.entrenamientoEspalda)
        btnEntrenamientoEspalda.setOnClickListener {
            val intent = Intent(this, EspaldaActivity::class.java)
            startActivity(intent)
        }

        // Botón "entrenamiento de Biceps/Triceps"
        val btnEntrenamientoBicepsTriceps: Button = findViewById(R.id.entrenamientoBiceps)
        btnEntrenamientoBicepsTriceps.setOnClickListener {
            val intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }

        // Botón "entrenamiento de Piernas"
        val btnEntrenamientoPiernas: Button = findViewById(R.id.entrenamientoPiernas)
        btnEntrenamientoPiernas.setOnClickListener {
            val intent = Intent(this, PiernasActivity::class.java)
            startActivity(intent)
        }

        // Botón "entrenamiento de Abs de Hierro"
        val btnEntrenamientoAbs: Button = findViewById(R.id.entrenamientoAbs)
        btnEntrenamientoAbs.setOnClickListener {
            val intent = Intent(this, AbsActivity::class.java)
            startActivity(intent)
        }

        // Botón "entrenamiento de Gluteos"
        val btnEntrenamientoGluteos: Button = findViewById(R.id.entrenamientoGluteo)
        btnEntrenamientoGluteos.setOnClickListener {
            val intent = Intent(this, GluteosActivity::class.java)
            startActivity(intent)
        }
    }
}













