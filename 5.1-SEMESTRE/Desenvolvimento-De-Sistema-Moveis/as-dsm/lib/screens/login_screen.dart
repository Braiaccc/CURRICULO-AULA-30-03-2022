import 'package:as_dsm/auth/auth_service.dart';
import 'package:as_dsm/components/my_button.dart';
import 'package:flutter/material.dart';
import 'package:as_dsm/components/my_textfield.dart';

class LoginPage extends StatelessWidget {
  //Email e senha texto controller
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _pwController = TextEditingController();

  final void Function()? onTap;

  LoginPage ({super.key, required this.onTap});

  void login(BuildContext context) async{
    final authService = AuthService();

    try {
      await authService.signInWithEmailPassword(_emailController.text, _pwController.text);
    }

    catch (e) {
      showDialog(
        context: context,
        builder: (context) => AlertDialog(
        title: Text(e.toString()),
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
                  text: "LOGIN",
                  onTap: () => login(context),
                ),
                
                const SizedBox(height: 24),

                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text("Não tem conta? "),
                    GestureDetector(
                      onTap: onTap,
                      child: const Text("REGISTRE-SE",
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