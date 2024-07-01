package com.example.pokedex.model

//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import br.com.ulbra.apicomretrofit.commons.Result
//import br.com.ulbra.apicomretrofit.data.Character
//import br.com.ulbra.apicomretrofit.data.repositories.CharactersRepository
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import javax.inject.Inject
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
