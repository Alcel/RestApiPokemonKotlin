package com.example.restapipokemonkotlin

import com.example.restapipokemonkotlin.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApiService {
    @GET("pokemon/{id}")//{id}
    fun getPokemonInfo(@Path("id") id: Int): Call<Pokemon>
}