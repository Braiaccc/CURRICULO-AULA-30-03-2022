package com.example.pokedex.data.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.load.engine.Resource
import com.example.pokedex.data.api.ApiService
import com.example.pokedex.data.api.PokeResult
import com.example.pokedex.data.commons.Resultado
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//class PokeListViewModel() : ViewModel() {
//
//    private val _pokemonList2 = MutableLiveData<Resource<List<PokeResult>>>()
//    val pokemonList2: LiveData<Result<List<PokeResult>>> = PokeResult
//
//    fun fetchPokemonList() {
//        _pokemonList2.value = Result.Loading()
//
//        // Simulação de uma chamada de rede
//        viewModelScope.launch {
//            try {
//                val pokemonList = fetchPokemonFromNetwork() // Função que faz a chamada de rede
//                _pokemonList2.value = Resource.Success(PokeResult)
//            } catch (e: Exception) {
//                _pokemonList2.value = Resource.Error("Erro ao carregar a lista de Pokémon", null)
//            }
//        }
//    }
//
//    // Função simulada para buscar os Pokémon da rede
//    private suspend fun fetchPokemonFromNetwork(): List<PokeResult> {
//        delay(2000) // Simula o delay de uma chamada de rede
//        return listOf(PokeResult("Pikachu"), PokeResult("Charmander")) // Simula uma resposta
//    }
//
//    private val retrofit = Retrofit.Builder()
//        .baseUrl("https://pokeapi.co/api/v2/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    private val service: ApiService = retrofit.create(ApiService::class.java)
//
//    val pokemonList = MutableLiveData<List<PokeResult>>()
//
//    fun getPokemonList(){
//        val call = service.getPokemonList(151,0)
//
//        call.enqueue(object : Callback<PokeApiResponse> {
//            override fun onResponse(call: Call<PokeApiResponse>, response: Response<PokeApiResponse>) {
//                response.body()?.results?.let { list ->
//                    pokemonList.postValue(list)
//                }
//
//            }
//
//            override fun onFailure(call: Call<PokeApiResponse>, t: Throwable) {
//                call.cancel()
//            }
//
//        })
//    }
//}

class PokeListViewModel : ViewModel() {

    // LiveData para gerenciar os estados da requisição
    private val _pokemonList = MutableLiveData<Resource<List<PokeResult>>>()
    val pokemonList: LiveData<Resource<List<PokeResult>>> = _pokemonList

    // Retrofit setup
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service: ApiService = retrofit.create(ApiService::class.java)

    // Função para buscar a lista de Pokémon
    fun fetchPokemonList() {
        _pokemonList.value = Resultado.Loading()

        viewModelScope.launch {
            try {
                val response = service.getPokemonList(151, 0)
                if (response.isSuccessful) {
                    response.body()?.results?.let { list ->
                        _pokemonList.postValue(Result.Success(list))
                    } ?: run {
                        _pokemonList.postValue(Result.Error("Erro ao carregar a lista de Pokémon", null))
                    }
                } else {
                    _pokemonList.postValue(Result.Error("Erro ao carregar a lista de Pokémon", null))
                }
            } catch (e: Exception) {
                _pokemonList.postValue(Result.Error("Erro ao carregar a lista de Pokémon", null))
            }
        }
    }
}

