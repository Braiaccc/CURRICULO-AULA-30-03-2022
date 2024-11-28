package com.example.pokedex.data.DataSource

import com.example.pokedex.data.api.ApiService
import com.example.pokedex.data.responses.PokeApiResponse
import retrofit2.Call
import javax.inject.Inject

class PokemonsDataSource @Inject constructor(
    private val api: ApiService
) {
    suspend fun fetchCharacters(): Call<PokeApiResponse> {
        return api.getPokemonList(151,151)
    }
}