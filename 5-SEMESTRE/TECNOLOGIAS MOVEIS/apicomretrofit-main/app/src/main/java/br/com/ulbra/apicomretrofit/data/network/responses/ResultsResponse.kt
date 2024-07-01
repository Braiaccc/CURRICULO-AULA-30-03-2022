package br.com.ulbra.apicomretrofit.data.network.responses

import com.google.gson.annotations.SerializedName

data class ResultsResponse(
    @SerializedName("results")
    val charactersResult: List<CharactersResponse>,

)

data class PokemonResult(
   @SerializedName("name")
    val name: String,
   @SerializedName("url")
    val url: String
)