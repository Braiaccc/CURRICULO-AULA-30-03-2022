import 'package:flutter/material.dart';
import '../models/pokemon_model.dart';

class DetailScreen extends StatelessWidget {
  final Pokemon pokemon;

  DetailScreen({required this.pokemon});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(pokemon.name),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Image.network(pokemon.imageUrl),
            SizedBox(height: 16),
            Text(
              pokemon.name,
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
          ],
        ),
      ),
    );
  }
}
