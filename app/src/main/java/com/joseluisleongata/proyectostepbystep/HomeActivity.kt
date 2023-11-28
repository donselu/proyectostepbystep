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
            // Abre la nueva actividad (EjerciciosActivity)
            val intent = Intent(this, EjerciciosActivity::class.java)
            startActivity(intent)
        }

        // Inicializa el botón y configura su clic para cerrar sesión
        logoutButton = findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener {
            // Cerrar sesión en Firebase
            FirebaseAuth.getInstance().signOut()

            // Redirige a la pantalla de autenticación
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            finish()  // Cierra esta actividad para evitar volver atrás con el botón de retroceso
        }
    }
}





