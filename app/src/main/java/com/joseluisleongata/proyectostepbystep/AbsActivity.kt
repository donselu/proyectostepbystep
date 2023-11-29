package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AbsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_abs)

        // Encuentra el ImageView en el diseño
        val ejerciciosImageView = findViewById<ImageView>(R.id.Aimagen1)
        // Carga la imagen de un recurso en el ImageView
        ejerciciosImageView.setImageResource(R.drawable.abdominales)


        val ejerciciosImageView2 = findViewById<ImageView>(R.id.Aimagen2)
        ejerciciosImageView2.setImageResource(R.drawable.plancha)


        val ejerciciosImageView3 = findViewById<ImageView>(R.id.Aimagen3)
        ejerciciosImageView3.setImageResource(R.drawable.elevaciondepiernas)


        val ejerciciosImageView4 = findViewById<ImageView>(R.id.Aimagen4)
        ejerciciosImageView4.setImageResource(R.drawable.planchalateral)



    }
}





