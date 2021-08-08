package com.example.ejercicio1kevinmaggio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.ejercicio1kevinmaggio.UsuarioRegistrado.Companion.pref

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener { onBackPressed() }
        mesage()

    }

    fun mesage() {
        val bundle= intent.extras
       val valor= bundle?.get("datos")
        val etPantalla1 = findViewById<TextView>(R.id.salida)
        etPantalla1.text = "Bien venido ${pref.dameUsuario()}, gracias por usas mi App. "
    }
}