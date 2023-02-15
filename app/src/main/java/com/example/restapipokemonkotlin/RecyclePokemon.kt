package com.example.restapipokemonkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclePokemon(var context: Context,var listaPokemon:MutableList<Pokemon>):RecyclerView.Adapter<RecyclePokemon.Miholder>() {
    inner class Miholder(itemView: View):RecyclerView.ViewHolder(itemView){
        lateinit var textPokemon:TextView
        init {
            textPokemon = itemView.findViewById(R.id.textPokemon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Miholder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.pokenombre, parent, false)
        return Miholder(itemView)
    }

    override fun onBindViewHolder(holder: Miholder, position: Int) {
        var pokemon = listaPokemon[position]
        holder.textPokemon.text = pokemon.name
    }

    override fun getItemCount(): Int {
        return listaPokemon.size
    }
}