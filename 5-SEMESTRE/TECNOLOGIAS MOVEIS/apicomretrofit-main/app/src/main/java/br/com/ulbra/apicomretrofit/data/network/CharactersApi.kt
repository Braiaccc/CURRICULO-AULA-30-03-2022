package br.com.ulbra.apicomretrofit.data.network

import br.com.ulbra.apicomretrofit.data.network.responses.ResultsResponse
import retrofit2.http.GET

interface CharactersApi {
//    @GET("character")
//    suspend fun fetchCharacters(): ResultsResponse
    @GET("pokemon")
    suspend fun fetchCharacters(): ResultsResponse

    @GET("pokemon/{number}")
    suspend fun fetchCharactersById(): ResultsResponse
}