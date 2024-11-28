package com.example.pokedex.data.repositories

import com.example.pokedex.data.DataSource.PokemonsDataSource
import com.example.pokedex.data.api.PokeResult
import com.example.pokedex.data.api.Pokemon
import javax.inject.Inject

class PokemonsRepository @Inject constructor(
    private val pokemonsDataSource:  PokemonsDataSource
) {
    suspend fun fetchCharacters(): List<PokeResult> {
        return pokemonsDataSource.()
            ..map { item -> item.toModel() }
    }
}