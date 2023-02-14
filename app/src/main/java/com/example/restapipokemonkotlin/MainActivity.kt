package com.example.restapipokemonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:PokeInfoViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel= ViewModelProvider(this).get(PokeInfoViewModel::class.java)
        viewModel.getPokemonInfo(67)
        viewModel.pokemonInfo.observe(this, Observer {
            println(it.name)
        })
    }
}