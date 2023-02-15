package com.example.restapipokemonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restapipokemonkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var viewModel:PokeInfoViewModel
    lateinit var viewModel: PokeListViewModel
    lateinit var binding: ActivityMainBinding

    private var listaPokemon:MutableList<Pokemon> = mutableListOf()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel= ViewModelProvider(this).get(PokeListViewModel::class.java)

        viewModel.getPokemonList()
        viewModel.pokemonList.observe(this, Observer { list ->
            println(list)
            for (i in 0 until list.size){

                listaPokemon.add(Pokemon(i,list.get(i).name))
                //println(listaPokemon.size)
            }
            adapterSetter()


        })





    }
    private fun adapterSetter(){
        println(listaPokemon.size)
        recyclerView=binding.lista
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=RecyclePokemon(this,listaPokemon)
    }
}