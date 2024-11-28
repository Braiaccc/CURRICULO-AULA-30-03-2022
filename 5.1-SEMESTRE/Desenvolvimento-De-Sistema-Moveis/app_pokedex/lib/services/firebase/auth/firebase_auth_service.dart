import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';
import '../../../models/user_model.dart';

class FirebaseAuthService {
 final FirebaseAuth _auth = FirebaseAuth.instance;

 Stream<UserModel> get user {
   return _auth.authStateChanges().map((user) {
    return UserModel(email: user?.email ?? "");
   });
 }

 signIn(String email, String password) async {
   try {
   await _auth.signInWithEmailAndPassword(email: email, password: password);
   } catch(e) {
      debugPrint(e.toString());
   }
 }
}