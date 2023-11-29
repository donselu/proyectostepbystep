package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class TarifaActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_tarifa)

                // Encuentra el ImageView en el diseño
                val ejerciciosImageView = findViewById<ImageView>(R.id.imagentarifa)
                // Carga la imagen de un recurso en el ImageView
                ejerciciosImageView.setImageResource(R.drawable.tarifa)




                }
        }

