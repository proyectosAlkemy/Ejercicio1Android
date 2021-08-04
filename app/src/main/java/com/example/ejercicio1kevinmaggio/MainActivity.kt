package com.example.ejercicio1kevinmaggio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entrada1= findViewById<EditText>(R.id.primerET)
        val entrada2=findViewById<EditText>(R.id.segundoET)
        val boton=findViewById<Button>(R.id.boton)



    }
}