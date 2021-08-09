package com.example.ejercicio1kevinmaggio.Presenter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio1kevinmaggio.Model.Contenido
import com.example.ejercicio1kevinmaggio.R
import com.squareup.picasso.Picasso

class ContenidoAdapter():RecyclerView.Adapter<ContenidoAdapter.ContenidoHoler> (){

    val listContenido= Contenido.devulverLista()
    override fun onCreateViewHolder(        parent: ViewGroup,        viewType: Int    ): ContenidoHoler {
        val layoutInflater=LayoutInflater.from(parent.context)
        return ContenidoHoler(layoutInflater.inflate(R.layout.item_contenido,parent,false))
    }

    override fun onBindViewHolder(holder: ContenidoHoler, position: Int) {
        holder.renderizar(listContenido[position])
    }

    override fun getItemCount(): Int {
        return listContenido.size
    }
    class ContenidoHoler (val view: View):RecyclerView.ViewHolder(view){

        fun renderizar(contenido: String){
            val imagen = view.findViewById<ImageView>(R.id.imagen)
            Picasso.get().load(contenido).into(imagen)
        }
    }
}