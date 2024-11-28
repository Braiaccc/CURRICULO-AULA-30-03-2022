package com.example.pokedex.data.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.load.engine.Resource
import com.example.pokedex.R
import com.example.pokedex.data.commons.Result
import com.example.pokedex.data.model.PokeInfoViewModel
import com.example.pokedex.data.model.PokeListAdapter
import com.example.pokedex.data.model.PokeListViewModel
import com.example.pokedex.databinding.ActivityMainBinding

//class PokemonList : AppCompatActivity() {
//
//    private lateinit var viewModel: PokeListViewModel
//    private lateinit var binding: ActivityMainBinding
//    private lateinit var pokeListAdapter: PokeListAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        viewModel = ViewModelProvider(this)[PokeListViewModel::class.java]
//
//        initUI()
//    }
//
//    private fun initUI() {
//        binding.pokelistRecyclerView.layoutManager = LinearLayoutManager(this)
//
//
//        pokeListAdapter = PokeListAdapter{
//            val intent = Intent(this, PokeInfoActivity::class.java)
//            intent.putExtra("id", it)
//            startActivity(intent)
//        }
//
//
//        binding.pokelistRecyclerView.adapter = pokeListAdapter
//
//        viewModel.getPokemonList()
//        viewModel.pokemonList.observe(this, Observer { list ->
//            pokeListAdapter.setData(list)
//        })
//    }
//}

class PokedexActivity : AppCompatActivity() {

    private lateinit var viewModel: PokeListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex)

        viewModel = ViewModelProvider(this).get(PokeListViewModel::class.java)

        viewModel.pokemonList.observe(this, Observer { result ->
            when (result) {
                is Result.Loading -> {
                    // Mostra um loader
                    showLoading()
                }
                is Result.Success -> {
                    // Atualiza a lista de Pokémon na UI
                    showPokemonList(result.data)
                }
                is Result.Error -> {
                    // Mostra uma mensagem de erro
                    showError(result.message)
                }
            }
        })
    }
