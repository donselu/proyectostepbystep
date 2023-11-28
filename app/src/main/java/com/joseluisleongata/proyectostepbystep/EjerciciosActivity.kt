package com.joseluisleongata.proyectostepbystep

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class EjerciciosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios)

        // Botón "entremiento de Pecho"
        val btnentrenamientoPecho: Button = findViewById(R.id.entrenamientoPecho)
        btnentrenamientoPecho.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }


        // Botón "entremiento de Espalda"
        val btnentrenamientoEspalda: Button = findViewById(R.id.entrenamientoEspalda)
        btnentrenamientoEspalda.setOnClickListener {
            val intent = Intent(this, EspaldaActivity::class.java)
            startActivity(intent)
        }




        // Botón "entremiento de Biceps/Triceps"
        val btnentrenamientoBicepsTriceps: Button = findViewById(R.id.entrenamientoBiceps)
        btnentrenamientoBicepsTriceps.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }


        // Botón "entremiento de Piernas"
        val btnentrenamientoPiernas: Button = findViewById(R.id.entrenamientoPiernas)
        btnentrenamientoPiernas.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }


        // Botón "entremiento de Abs de Hierro"
        val btnentrenamientoAbs: Button = findViewById(R.id.entrenamientoAbs)
        btnentrenamientoAbs.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }


        // Botón "entremiento de Gluteos"
        val btnentrenamientoGluteos: Button = findViewById(R.id.entrenamientoGluteo)
        btnentrenamientoGluteos.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }











    }
}


