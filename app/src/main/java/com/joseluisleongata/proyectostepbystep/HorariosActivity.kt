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
    }
}













