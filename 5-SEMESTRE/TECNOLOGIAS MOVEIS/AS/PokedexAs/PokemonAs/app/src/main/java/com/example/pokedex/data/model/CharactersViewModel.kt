//package com.example.pokedex.data.model
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import br.com.ulbra.apicomretrofit.data.repositories.CharactersRepository
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//class CharactersViewModel @Inject constructor(
//    private val pokemonRepository: CharactersRepository
//) : ViewModel() {
//
//    private val _characters = MutableLiveData<Result<List<Character>>>()
//    val characters: LiveData<Result<List<Character>>> get() = _characters
//
//    fun fetchCharacters() {
//        _characters.postValue(Result.Loading)
//
//        viewModelScope.launch(Dispatchers.IO) {
//            try {
//                val result = charactersRepository.fetchCharacters()
//                _characters.postValue(Result.Success(result))
//            } catch (e: Exception) {
//                _characters.postValue(Result.Error(e))
//            }
//        }
//    }
//}
//
//
//
//class CharactersViewModel @Inject constructor(
//    private val charactersRepository: CharactersRepository
//) : ViewModel() {
//
//    private val _characters = MutableLiveData<Result<List<Character>>>()
//    val characters: LiveData<Result<List<Character>>> get() = _characters
//
//    fun fetchCharacters() {
//        _characters.postValue(Result.Loading)
//
//        viewModelScope.launch(Dispatchers.IO) {
//            try {
//                val result = charactersRepository.fetchCharacters()
//                _characters.postValue(Result.Success(result))
//            } catch (e: Exception) {
//                _characters.postValue(Result.Error(e))
//            }
//        }
//    }
//}
