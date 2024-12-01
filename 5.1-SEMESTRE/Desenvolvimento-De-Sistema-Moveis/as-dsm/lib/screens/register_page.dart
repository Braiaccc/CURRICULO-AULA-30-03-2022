
import 'package:as_dsm/auth/auth_service.dart';
import 'package:flutter/material.dart';

import '../components/my_button.dart';
import '../components/my_textfield.dart';

class RegisterPage extends StatelessWidget {

  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _pwController = TextEditingController();
  final TextEditingController _confirmPwController = TextEditingController();
  final void Function()? onTap;

  RegisterPage({super.key, required this.onTap});



  void register(BuildContext context) {
    final _auth = AuthService();

    if (_pwController.text == _confirmPwController.text) {
      try {
        _auth.signUpWithEmailPassword(
            _emailController.text,
            _pwController.text
        );
      } catch (e) {
        showDialog(
          context: context,
          builder: (context) =>
              AlertDialog(
                title: Text(e.toString()),
              ),
        );
       }
      }
    else {
      showDialog(
        context: context,
        builder: (context) =>
        const AlertDialog(
          title: Text("As senhas não correspondem"),
        ),
      );
      }
    }

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
              const Text("Criar conta para pokedex",
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
                hintText: 'SENHA',
                obscureText: true,
                controller: _pwController,
              ),

              const SizedBox(height: 10),
              //confirme a senha
              MyTextField(
                hintText: 'CONFIRME A SENHA',
                obscureText: true,
                controller: _confirmPwController,
              ),

              const SizedBox(height: 24),

              //Botão do login
              MyButton(
                text: "REGISTER",
                onTap: () => register(context),
              ),

              const SizedBox(height: 24),

              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text("Já possui um conta? "),
                  GestureDetector(
                    onTap: onTap,
                    child: Text("Logar",
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                      ),
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
