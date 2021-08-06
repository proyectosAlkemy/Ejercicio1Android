package com.example.ejercicio1kevinmaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton=findViewById<Button>(R.id.boton)

        boton.setOnClickListener {  checkPush()}



    }

    fun checkPush(){
        val entrada1= findViewById<EditText>(R.id.primerET)
        if(entrada1.text.isNotEmpty()){

            val intent=Intent(this,Activity2::class.java)
            intent.putExtra("datos",entrada1.text)
            startActivity(intent)

        }else{msgError()

        }
    }

    fun msgError(){
        Toast.makeText(this, "el campo de Email se encuentra vacio", Toast.LENGTH_SHORT).show()
    }

}