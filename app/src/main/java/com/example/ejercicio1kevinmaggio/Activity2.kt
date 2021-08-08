package com.example.ejercicio1kevinmaggio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio1kevinmaggio.UsuarioRegistrado.Companion.pref

class Activity2 : AppCompatActivity() {


        val listaContenido= listOf(
            Contenido("https://i.ibb.co/LDKhBhT/League-of-Legends-Warriors-Gold-Gangplank-520167-1280x700.jpg"),
            Contenido("https://i.ibb.co/BNYm738/maxresdefault.jpg"),
            Contenido("https://i.ibb.co/MD0GtrL/thumb-1920-681587.png"),
            Contenido("https://i.ibb.co/vskczM2/lol-league-of-legends-arcade-hecarim-hecarim-hd-wallpaper-preview.jpg"),
            Contenido("https://i.ibb.co/r6q3tL0/thumb-1920-682621.jpg"),
            Contenido("https://i.ibb.co/s6m8Jjy/video-game-league-of-legends-annie-league-of-legends-poro-league-of-legends-teemo-league-of-legends.jpg"),
            Contenido("https://i.ibb.co/mqZLmbn/thumb-1920-529362.jpg"),
            Contenido("https://i.ibb.co/7SHGgCT/450-1000.jpg"),
            Contenido("https://i.ibb.co/809K0mk/dragonslayer-diana-league-of-legends-olaf-fire-dragon-hd-wallpaper-preview.jpg"),
            Contenido("https://i.ibb.co/gR2hX9p/riven-league-of-legends-riven-spirit-blossom-league-of-legends-purple-background-hd-wallpaper-previe.jpg"),
            Contenido("https://i.ibb.co/xMBvr2M/spirit-blossom-thresh-league-of-legends-thresh-league-of-legends-riot-games-hd-wallpaper-preview.jpg"),
            Contenido("https://i.ibb.co/C13qMML/1366-521.jpg")
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val boton = findViewById<Button>(R.id.boton)
        boton.setOnClickListener {
            onBackPressed()
            limpiar()
        }
        mesage()
        iniciarRecycler()

    }

    fun mesage() {

        val etPantalla1 = findViewById<TextView>(R.id.salida)
        etPantalla1.text = ("El usuario actual es: ${pref.dameUsuario()}")
    }
    fun iniciarRecycler(){
        val contenido = findViewById<RecyclerView>(R.id.fotos)
        contenido.layoutManager=LinearLayoutManager(this)
        val adapter =ContenidoAdapter(listaContenido)
        contenido.adapter=adapter
    }
    fun limpiar(){
        pref.limpiar()
    }


}