import 'package:as_dsm/auth/login_or_register.dart';
import 'package:as_dsm/screens/home_screen.dart';
import 'package:flutter/material.dart';
import 'package:firebase_auth/firebase_auth.dart';

class AuthGate extends StatelessWidget {
  const AuthGate({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: StreamBuilder(
        stream: FirebaseAuth.instance.authStateChanges(),
        builder: (context, snapshot) {

          if(snapshot.hasData) {
            return const HomeScreen();
          }else {
            return const LoginOrRegister();
            }
          },
        ),
      );
  }
}
