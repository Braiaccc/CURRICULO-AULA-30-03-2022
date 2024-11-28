import 'package:flutter/material.dart';

import '../components/my_button.dart';
import '../components/my_textfield.dart';

class RegisterPage extends StatelessWidget {

  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _pwController = TextEditingController();
  RegisterPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              //logo
              const Icon(
                  Icons.message,
                  size: 60
              ),

              const SizedBox(height: 50),
              //Boas vindas
              const Text("Bem vindo a Pokedex",
                style: TextStyle(
                  fontSize: 16,
                ),
              ),

              const SizedBox(height: 24),

              //EMAIL
              MyTextField(
                hintText: 'EMAIL',
                obscureText: false,
                controller: _emailController,
              ),

              const SizedBox(height: 10),
              //SENHA
              MyTextField(
                hintText: 'PASSWORD',
                obscureText: true,
                controller: _pwController,
              ),

              const SizedBox(height: 24),

              //Botão do login
              MyButton(
                text: "REGISTER",
                onTap: login,
              ),

              const SizedBox(height: 24),

              const Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text("Não tem conta? "),
                  Text("REGISTRE-SE",
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ],
              )
            ],
          ),
        )

    );
  }
}
