package com.joseluisleongata.proyectostepbystep
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BicepsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_biceps)

        // Encuentra el ImageView en el diseño
        val ejerciciosImageView = findViewById<ImageView>(R.id.bimagen1)
        // Carga la imagen de un recurso en el ImageView
        ejerciciosImageView.setImageResource(R.drawable.curl_biceps)


        val ejerciciosImageView2 = findViewById<ImageView>(R.id.bimagen2)
        ejerciciosImageView2.setImageResource(R.drawable.triceps)


        val ejerciciosImageView3 = findViewById<ImageView>(R.id.bimagen3)
        ejerciciosImageView3.setImageResource(R.drawable.triceps_polea)


        val ejerciciosImageView4 = findViewById<ImageView>(R.id.bimagen4)
        ejerciciosImageView4.setImageResource(R.drawable.extensiondetricepsenpolea)


        val ejerciciosImageView5 = findViewById<ImageView>(R.id.bimagen5)
        ejerciciosImageView5.setImageResource(R.drawable.bicepsconbarra)



    }

}

