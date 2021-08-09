package com.example.ejercicio1kevinmaggio.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicio1kevinmaggio.Presenter.ContenidoAdapter
import com.example.ejercicio1kevinmaggio.Presenter.UsuarioRegistrado.Companion.pref
import com.example.ejercicio1kevinmaggio.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            onBackPressed()
            limpiar()
        }
        mesage()
        iniciarRecycler()

    }

    fun mesage() {

        binding.salida.text = ("El usuario actual es: ${pref.dameUsuario()}")
    }


    fun iniciarRecycler(){

        binding.fotos.layoutManager=LinearLayoutManager(this)
        val adapter = ContenidoAdapter()
        binding.fotos.adapter=adapter
    }
    fun limpiar(){
        pref.limpiar()
    }
}