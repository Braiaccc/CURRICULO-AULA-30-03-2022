package com.example.pokedex.data.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.pokedex.data.model.PokeInfoViewModel
import com.example.pokedex.databinding.ActivityPokeInfoBinding

class PokeInfoActivity : AppCompatActivity() {

    private lateinit var viewModel: PokeInfoViewModel
    private lateinit var binding: ActivityPokeInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokeInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[PokeInfoViewModel::class.java]

        initUI()
    }

    private fun initUI() {
        val id = intent.extras?.get("id") as Int

        viewModel.getPokemonInfo(id)

        viewModel.pokemonInfo.observe(this, Observer { pokemon ->
            val typeNames = pokemon.types.map { it.type.name }
            binding.nameTextView.text = pokemon.name
            binding.heightText.text = "Height: ${pokemon.height / 10.0}m"
            binding.weightText.text = "Weight: ${pokemon.weight / 10.0}kg"

            binding.typeText.text = "Type: ${typeNames.joinToString()}"
            binding.expBaseText.text = "Base Exp: ${pokemon.baseExperience}"

            Glide.with(this).load(pokemon.sprites.frontDefault).into(binding.imageView)
        })

        viewModel.getPokemonDescription(id)
        viewModel.pokemonDescription.observe(this) { pokemon ->
            val englishEntries = pokemon.flavorTextEntries.filter { it.language.name == "en" }

            val englishText = englishEntries.firstOrNull()?.flavorText

            binding.descriptionText.text = englishText ?: ""

            viewModel.pokemonInfo.value?.englishFlavorTextEntries =
                englishEntries.map { it.flavorText }
        }
    }

    private fun observer() {
        PokeInfoViewModel.().observe(this) { result ->
            when(result) {
                is Resultado.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }

                is Resultado.Success -> {
                    binding.progressBar.visibility = View.GONE
                    adapter.setUpCharacters(result.data)
                }

                is Resultado.Error -> {
                    binding.progressBar.visibility = View.GONE
                }
            }
}
