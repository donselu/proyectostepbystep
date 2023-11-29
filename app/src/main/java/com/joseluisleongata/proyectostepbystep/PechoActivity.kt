package com.joseluisleongata.proyectostepbystep

import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.widget.ImageView

class PechoActivity : AppCompatActivity(){


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_pecho)

            // Encuentra el ImageView en el diseño
            val ejerciciosImageView = findViewById<ImageView>(R.id.ejerciciosImageView)
            // Carga la imagen de un recurso en el ImageView
            ejerciciosImageView.setImageResource(R.drawable.press_mancuerna)


            val ejerciciosImageView2 = findViewById<ImageView>(R.id.ejerciciosImageView2)
            ejerciciosImageView2.setImageResource(R.drawable.apertura)



            val ejerciciosImageView3 = findViewById<ImageView>(R.id.ejerciciosImageView3)
            ejerciciosImageView3.setImageResource(R.drawable.press_tumbado)


            val ejerciciosImageView4 = findViewById<ImageView>(R.id.ejerciciosImageView4)
            ejerciciosImageView4.setImageResource(R.drawable.press_banca)


            val ejerciciosImageView5 = findViewById<ImageView>(R.id.ejerciciosImageView5)
            ejerciciosImageView5.setImageResource(R.drawable.press_enbancoinclinado)

    }

}