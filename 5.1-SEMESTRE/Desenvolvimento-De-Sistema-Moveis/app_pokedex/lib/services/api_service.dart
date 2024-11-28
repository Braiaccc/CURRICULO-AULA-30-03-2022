import 'dart:convert';
import 'package:http/http.dart' as http;
import '../models/pokemon_model.dart';

class ApiService {
  final String apiUrl = 'https://pokeapi.co/api/v2/pokemon?limit=20';

  Future<List<Pokemon>> fetchPokemons() async {
    final response = await http.get(Uri.parse(apiUrl));

    if (response.statusCode == 200) {
      final List<dynamic> results = json.decode(response.body)['results'];
      List<Pokemon> pokemons = [];

      for (var result in results) {
        final pokeResponse = await http.get(Uri.parse(result['url']));
        if (pokeResponse.statusCode == 200) {
          pokemons.add(Pokemon.fromJson(json.decode(pokeResponse.body)));
        }
      }

      return pokemons;
    } else {
      throw Exception('Erro ao carregar dados');
    }
  }
}
