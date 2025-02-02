import 'package:app_pokedex/services/firebase/auth/firebase_auth_service.dart';
import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  final FirebaseAuthService _auth = FirebaseAuthService();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  LoginPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
         children: [
          TextField(
            controller: _emailController,
            decoration: const InputDecoration(labelText: 'EMAIL'),
          ),
           TextField(
             controller: _passwordController,
             decoration: const InputDecoration(labelText: 'PASSWORD'),
           ),
           ElevatedButton(onPressed:(){
            final String email = _emailController.text;
            final String password = _passwordController.text;
            _auth.signIn(email, password);
           },
               child: const Text("logar"))
        ],
      ),
    ),
    );
  }
}
