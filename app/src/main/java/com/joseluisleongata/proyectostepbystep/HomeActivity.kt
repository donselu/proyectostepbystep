package com.joseluisleongata.proyectostepbystep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class HomeActivity : AppCompatActivity() {

    private lateinit var logoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Botón "Horarios"
        val btnHorarios: Button = findViewById(R.id.signUpButton1)
        btnHorarios.setOnClickListener {
            val intent = Intent(this, HorariosActivity::class.java)
            startActivity(intent)
        }

        // Botón "Ubicacion"
        val btnubicacion: Button = findViewById(R.id.signUpButton3)
        btnubicacion.setOnClickListener {
            val intent = Intent(this, UbicacionActivity::class.java)
            startActivity(intent)
        }

        // Botón "Tarifas"
        val btntarifas: Button = findViewById(R.id.signUpButton4)
        btntarifas.setOnClickListener {
            val intent = Intent(this, TarifaActivity::class.java)
            startActivity(intent)
        }

        val signUpButton2 = findViewById<Button>(R.id.signUpButton2)
        signUpButton2.setOnClickListener {
            val intent = Intent(this, EjerciciosActivity::class.java)
            startActivity(intent)
        }
        val signUpButton7 = findViewById<Button>(R.id.signUpButton7)
        signUpButton7.setOnClickListener {
            val intent = Intent(this, ClasesActivity::class.java)
            startActivity(intent)
        }

        val signUpButton8 = findViewById<Button>(R.id.signUpButton8)
        signUpButton8.setOnClickListener {
            val intent = Intent(this, AlimentacionActivity::class.java)
            startActivity(intent)
        }

        logoutButton = findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener {
            FirebaseAuth.getInstance().signOut()



            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}





