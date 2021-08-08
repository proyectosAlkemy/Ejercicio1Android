package com.example.ejercicio1kevinmaggio

import android.app.Application

class UsuarioRegistrado: Application() {

    companion object{
        lateinit var pref:Preferencias

    }
    override fun onCreate() {
        super.onCreate()

        pref=Preferencias(applicationContext)
    }
}