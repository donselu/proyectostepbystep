package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class Comida4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida4)

        val etNumeroTarjeta: EditText = findViewById(R.id.etNumeroTarjeta)
        val btnComprar: Button = findViewById(R.id.button2comprar)
        val tvMensaje: TextView = findViewById(R.id.textView84)

        btnComprar.setOnClickListener {
            val numeroTarjeta = etNumeroTarjeta.text.toString()


            if (validarTarjeta(numeroTarjeta)) {
                // Simular compra exitosa
                tvMensaje.text = "Compra realizada"
                tvMensaje.setTextColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
            } else {
                tvMensaje.text = "Número de tarjeta inválido"
                tvMensaje.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
            }
        }
    }

    }



private fun validarTarjeta(numeroTarjeta: String): Boolean {

    // Por ejemplo, aquí simplemente verificamos que el número tenga 16 dígitos
    return numeroTarjeta.length == 16 && numeroTarjeta.all { it.isDigit() }

}

















