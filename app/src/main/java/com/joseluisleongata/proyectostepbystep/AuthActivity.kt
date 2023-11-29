package com.joseluisleongata.proyectostepbystep


import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.ActionCodeEmailInfo
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent
import android.content.Context
import com.google.firebase.database.FirebaseDatabase


class AuthActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button
    private lateinit var logInButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        // Inicializar las referencias a los elementos de la interfaz de usuario
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        signUpButton = findViewById(R.id.signUpButton)
        logInButton = findViewById(R.id.loginInButton)

        setup()
    }
    private fun setup() {
        title = "Bienvenido a StepByStep"


        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()


            if (email.isNotEmpty() && password.isNotEmpty()) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            val userEmail = emailEditText.text.toString()
                            showAlert("Registro exitoso. Correo electrónico: $userEmail")

                            // Aquí redirige a la HomeActivity después del registro exitoso
                            val homeIntent = Intent(this@AuthActivity, HomeActivity::class.java)
                            homeIntent.putExtra("email", userEmail)
                            startActivity(homeIntent)
                        } else {
                            showAlert("Este correo ya existe")
                        }
                    }
            } else {
                showAlert("Por favor, ingresa un correo electrónico y una contraseña.")


            }
        }
        logInButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            val userEmail = emailEditText.text.toString()
                            showAlert("Inicio de sesión exitoso. Correo electrónico: $userEmail")

                            val homeIntent = Intent(this@AuthActivity, HomeActivity::class.java)
                            startActivity(homeIntent)
                        } else {
                            showAlert("Error al iniciar sesión: ${task.exception?.message}")
                        }
                    }
            } else {
                showAlert("Por favor, ingresa un correo electrónico y una contraseña.")

            }
        }

    }

    private fun showAlert(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ERROR")
        builder.setMessage(message)
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)

        }
    }
}




































