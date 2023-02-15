package com.example.restapipokemonkotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Pokemon(
    @Expose @SerializedName("id") val id:Int,
    @Expose @SerializedName("name") val name:String
)

