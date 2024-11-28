import 'package:flutter/material.dart';
import '../services/api_service.dart';
import '../models/pokemon_model.dart';
import '../widgets/pokemon_card.dart';
import 'detail_screen.dart';

class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  ApiService apiService = ApiService();
  List<Pokemon> pokemons = [];
  List<Pokemon> filteredPokemons = [];

  @override
  void initState() {
    super.initState();
    fetchData();
  }

  void fetchData() async {
    final data = await apiService.fetchPokemons();
    setState(() {
      pokemons = data;
      filteredPokemons = data;
    });
  }

  void filterPokemons(String query) {
    setState(() {
      filteredPokemons = pokemons
          .where((pokemon) => pokemon.name.toLowerCase().contains(query.toLowerCase()))
          .toList();
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Pokédex', style: TextStyle(color: Colors.white),
      ),
        backgroundColor: Colors.red,
      ),
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: TextField(
              onChanged: filterPokemons,
              decoration: const InputDecoration(
                hintText: 'Pesquisar Pokémon...',
                border: OutlineInputBorder(),
              ),
            ),
          ),
          Expanded(
            child: GridView.builder(
              gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
                crossAxisCount: 2,
                childAspectRatio: 0.8,
              ),
              itemCount: filteredPokemons.length,
              itemBuilder: (context, index) {
                final pokemon = filteredPokemons[index];
                return PokemonCard(
                  pokemon: pokemon,
                  onTap: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) => DetailScreen(pokemon: pokemon),
                      ),
                    );
                  },
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}
