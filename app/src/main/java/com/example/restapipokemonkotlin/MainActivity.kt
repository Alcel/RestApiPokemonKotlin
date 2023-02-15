package com.example.restapipokemonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.restapipokemonkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:PokeInfoViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var textito=""
        viewModel= ViewModelProvider(this).get(PokeInfoViewModel::class.java)
        viewModel.getPokemonInfo(69)
        viewModel.pokemonInfo.observe(this, Observer {
            textito=it.name
            println(textito)
            binding.texto.text=textito

        })




    }
}