package com.example.assantos.estudy

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_layout.view.*


class AdapterCustomizado(val listaLivro: ArrayList<Livro>) : RecyclerView.Adapter<AdapterCustomizado.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.txtTitulo?.text = listaLivro[position].titulo
        holder?.txtAutor?.text = listaLivro[position].autor
        holder?.txtPag?.text = listaLivro[position].paginas.toString()
    }

    override fun getItemCount(): Int {
        return listaLivro.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtTitulo = itemView.txtTitulo
        val txtAutor = itemView.txtAutor
        val txtPag = itemView.txtPag

    }
}