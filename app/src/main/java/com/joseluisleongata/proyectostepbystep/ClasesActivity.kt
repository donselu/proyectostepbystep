package com.joseluisleongata.proyectostepbystep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import android.widget.TextView


class ClasesActivity: AppCompatActivity() {

    data class Persona(val nombre: String, val edad: Int)

    private val horario10Set = mutableSetOf<Persona>()
    private val horario20Set = mutableSetOf<Persona>()
    private val horario30Set = mutableSetOf<Persona>()
    private val horario40Set = mutableSetOf<Persona>()


    private lateinit var tickHorario20: TextView
    private lateinit var tickHorario10: TextView
    private lateinit var tickHorario30: TextView
    private lateinit var tickHorario40: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clases)

        // Inicializar los TextViews
        tickHorario20 = findViewById(R.id.tickHorario20)
        tickHorario10 = findViewById(R.id.tickHorario10)
        tickHorario30 = findViewById(R.id.tickHorario30)
        tickHorario40 = findViewById(R.id.tickHorario40)


        // Configurar clics en los TextViews de tick
        tickHorario10.setOnClickListener {
            showConfirmationDialog("Spinning", horario10Set)
        }
        tickHorario20.setOnClickListener {
            showConfirmationDialog("Zumba", horario20Set)
        }
        tickHorario30.setOnClickListener {
            showConfirmationDialog("GAP", horario30Set)
        }
        tickHorario40.setOnClickListener {
            showConfirmationDialog("Core", horario40Set)
        }


        // Configurar clics en los botones de apuntarse

        findViewById<Button>(R.id.horario10Button).setOnClickListener {
            toggleConfirmation("Zumba", horario10Set, tickHorario10)
        }
        findViewById<Button>(R.id.horario20Button).setOnClickListener {
            toggleConfirmation("Spinning", horario20Set, tickHorario20)
        }
        findViewById<Button>(R.id.horario30Button).setOnClickListener {
            toggleConfirmation("Gap", horario30Set, tickHorario30)
        }
        findViewById<Button>(R.id.horario40Button).setOnClickListener {
            toggleConfirmation("Core", horario40Set, tickHorario40)
        }


    }
    private fun toggleConfirmation(horario: String, personasSet: MutableSet<ClasesActivity.Persona>, textView: TextView) {
        // Lógica para agregar o quitar la persona del conjunto
        val nuevaPersona =
            ClasesActivity.Persona("Usuario", 25) //

        if (personasSet.contains(nuevaPersona)) {
            personasSet.remove(nuevaPersona)
        } else {
            personasSet.add(nuevaPersona)
        }
        showConfirmationDialog(horario, personasSet)
        actualizarConteoPersonas(horario, textView, personasSet)
    }

    private fun showConfirmationDialog(horario: String, personasSet: Set<ClasesActivity.Persona>) {
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

    private fun actualizarConteoPersonas(horario: String, textView: TextView, personasSet: Set<ClasesActivity.Persona>) {
        val conteo = personasSet.size

        // Mostrar la marca y el recuento de personas
        textView.apply {
            text = "✔️ $conteo"
            visibility = View.VISIBLE


        }
    }
}











