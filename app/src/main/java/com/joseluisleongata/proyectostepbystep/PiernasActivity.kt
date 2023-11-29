package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PiernasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_piernas)

        // Encuentra el ImageView en el diseño
        val ejerciciosImageView = findViewById<ImageView>(R.id.Piernasimagen1)
        // Carga la imagen de un recurso en el ImageView
        ejerciciosImageView.setImageResource(R.drawable.cuadriceps)


        val ejerciciosImageView2 = findViewById<ImageView>(R.id.Piernasimagen2)
        ejerciciosImageView2.setImageResource(R.drawable.abducciondecadera)


        val ejerciciosImageView3 = findViewById<ImageView>(R.id.Piernasimagen3)
        ejerciciosImageView3.setImageResource(R.drawable.zancada)


        val ejerciciosImageView4 = findViewById<ImageView>(R.id.Piernasimagen4)
        ejerciciosImageView4.setImageResource(R.drawable.curlfemoral)


        val ejerciciosImageView5 = findViewById<ImageView>(R.id.Piernasimagen5)
        ejerciciosImageView5.setImageResource(R.drawable.extensiondepiernas)




    }
}