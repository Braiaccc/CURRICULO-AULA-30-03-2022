import 'package:app_pokedex/firebase_options.dart';
import 'package:app_pokedex/screens/login_screen.dart';
import 'package:app_pokedex/services/firebase/auth/firebase_auth_service.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
import 'models/user_model.dart';
import 'screens/home_screen.dart';

void main() async{
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(
  options: DefaultFirebaseOptions.currentPlatform
  );
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: InitializeApp(),

    );
  }
}

class InitializeApp extends StatelessWidget {
  final FirebaseAuthService _auth = FirebaseAuthService();

  InitializeApp({super.key});

  @override
  Widget build(BuildContext context) {
    return StreamBuilder<UserModel>(stream: _auth.user, builder: (context, snapshot){
      if (snapshot.connectionState == ConnectionState.waiting){
        return const Center(
          child: CircularProgressIndicator(),
        );
      } else if (snapshot.hasData && snapshot.data!.email.isNotEmpty){
        return HomeScreen();
      }

      return LoginPage();
    });
  }
}
