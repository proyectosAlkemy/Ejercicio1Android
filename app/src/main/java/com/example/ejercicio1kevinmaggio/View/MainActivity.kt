package com.example.ejercicio1kevinmaggio.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio1kevinmaggio.Presenter.UsuarioRegistrado.Companion.pref
import com.example.ejercicio1kevinmaggio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener { checkPush() }
        comprobar()




    }

    fun comprobar(){
        if(pref.dameUsuario().isNotEmpty()){
            startActivity(Intent(this, Activity2::class.java))
        }
    }
    fun checkPush(){

        if(binding.primerET.text.isNotEmpty()){
            pref.grabarUsuario(binding.primerET.text.toString())
            val intent=Intent(this, Activity2::class.java)
            intent.putExtra("datos",binding.primerET.text)
            startActivity(intent)

        }else{msgError()

        }
    }

    fun msgError(){
        Toast.makeText(this, "el campo de Email se encuentra vacio", Toast.LENGTH_SHORT).show()
    }

}