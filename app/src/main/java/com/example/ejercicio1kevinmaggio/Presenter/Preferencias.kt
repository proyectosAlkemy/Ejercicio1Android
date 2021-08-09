package com.example.ejercicio1kevinmaggio.Presenter

import android.content.Context

class Preferencias(val context: Context) {

    val datoCompartido = "MyBBDD"
    val usuario = "edit"
    val almacenamiento = context.getSharedPreferences(datoCompartido, 0)

    fun grabarUsuario(dato: String) {

        almacenamiento.edit().putString(usuario, dato).apply()
    }

    fun dameUsuario(): String {

        return almacenamiento.getString(usuario, "")!!
    }
    fun limpiar(){

        almacenamiento.edit().clear().apply()
    }
}