package com.example.pokedex.data.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// É um modelo de resposta que se obtem da api do pokemon quando tem uma solicitação
// Ele pega as informações dos pokemons que são solicitados
data class PokeApiResponse (

    //Ele armazena a quantidade total dos pokemons da api
    @Expose @SerializedName("count") val count: Int,

    //È uma url para avançar a pagina dos pokemons
    @Expose @SerializedName("next") val next: String,

    //È uma url para recuperar a pagina dos pokemons
    @Expose @SerializedName("previous") val previous: String,

    //É uma lista de informações sobre pokemons
    @Expose @SerializedName("results") val results: List<PokeResult>
)