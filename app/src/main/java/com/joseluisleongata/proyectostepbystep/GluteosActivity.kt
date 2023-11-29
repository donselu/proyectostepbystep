package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GluteosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gluteos)

        // Encuentra el ImageView en el diseño
        val ejerciciosImageView = findViewById<ImageView>(R.id.Gimagen1)
        // Carga la imagen de un recurso en el ImageView
        ejerciciosImageView.setImageResource(R.drawable.zancada)


        val ejerciciosImageView2 = findViewById<ImageView>(R.id.Gimagen2)
        ejerciciosImageView2.setImageResource(R.drawable.elastico)


        val ejerciciosImageView3 = findViewById<ImageView>(R.id.Gimagen3)
        ejerciciosImageView3.setImageResource(R.drawable.eleveacion1piernapuentedegluteo)


        val ejerciciosImageView4 = findViewById<ImageView>(R.id.Gimagen4)
        ejerciciosImageView4.setImageResource(R.drawable.puentedegluteo)






    }




}

