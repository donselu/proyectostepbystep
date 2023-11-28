package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class EspaldaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_espalda)

        // Encuentra el ImageView en el diseño
        val ejerciciosImageView = findViewById<ImageView>(R.id.imagen)
        // Carga la imagen de un recurso en el ImageView
        ejerciciosImageView.setImageResource(R.drawable.jalon_espalda)


        val ejerciciosImageView2 = findViewById<ImageView>(R.id.Imagen2)
        ejerciciosImageView2.setImageResource(R.drawable.remo)


        val ejerciciosImageView3 = findViewById<ImageView>(R.id.Imagen3)
        ejerciciosImageView3.setImageResource(R.drawable.espaldamancuerna)


        val ejerciciosImageView4 = findViewById<ImageView>(R.id.Imagen4)
        ejerciciosImageView4.setImageResource(R.drawable.pullover)


}

    }
