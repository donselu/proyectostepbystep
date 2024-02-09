package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.app.AlertDialog



class HorariosActivity : AppCompatActivity() {

    data class Persona(val nombre: String, val edad: Int)

    private val horario1Set = mutableSetOf<Persona>()
    private val horario2Set = mutableSetOf<Persona>()

    private lateinit var tickHorario1: TextView
    private lateinit var tickHorario2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horarios)

        // Inicializar los TextViews
        tickHorario1 = findViewById(R.id.tickHorario1)
        tickHorario2 = findViewById(R.id.tickHorario2)

        // Configurar clics en los TextViews de tick
        tickHorario1.setOnClickListener {
            showConfirmationDialog("Horario1", horario1Set)
        }

        tickHorario2.setOnClickListener {
            showConfirmationDialog("Horario2", horario2Set)
        }

        // Configurar clics en los botones de apuntarse
        findViewById<Button>(R.id.horario2Button).setOnClickListener {
            toggleConfirmation("Horario1", horario1Set, tickHorario1)
        }

        findViewById<Button>(R.id.horario2Button).setOnClickListener {
            toggleConfirmation("Horario2", horario2Set, tickHorario2)
        }
    }

    private fun toggleConfirmation(horario: String, personasSet: MutableSet<Persona>, textView: TextView) {
        // Lógica para agregar o quitar la persona del conjunto
        val nuevaPersona = Persona("Usuario", 25) // Puedes ajustar la edad según tus necesidades

        if (personasSet.contains(nuevaPersona)) {
            personasSet.remove(nuevaPersona)
        } else {
            personasSet.add(nuevaPersona)
        }
        showConfirmationDialog(horario, personasSet)
        actualizarConteoPersonas(horario, textView, personasSet)
    }

    private fun showConfirmationDialog(horario: String, personasSet: Set<Persona>) {
        val personasList = if (personasSet.isEmpty()) {
            "Nadie se ha apuntado aún."
        } else {
            personasSet.joinToString(separator = "\n") { it.nombre + " - " + it.edad }
        }

        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder
            .setTitle("Personas Apuntadas en $horario")
            .setMessage(personasList)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

        val alertDialog = dialogBuilder.create()
        alertDialog.show()
    }

    private fun actualizarConteoPersonas(horario: String, textView: TextView, personasSet: Set<Persona>) {
        val conteo = personasSet.size

        // Mostrar la marca y el recuento de personas
        textView.apply {
            text = "✔️ $conteo"
            visibility = View.VISIBLE
        }
    }
}














