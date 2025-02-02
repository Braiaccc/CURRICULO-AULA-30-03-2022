// File generated by FlutterFire CLI.
// ignore_for_file: type=lint
import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;

/// Default [FirebaseOptions] for use with your Firebase apps.
///
/// Example:
/// ```dart
/// import 'firebase_options.dart';
/// // ...
/// await Firebase.initializeApp(
///   options: DefaultFirebaseOptions.currentPlatform,
/// );
/// ```
class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for macos - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      case TargetPlatform.windows:
        return windows;
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'AIzaSyCElpLrwuGRrp_X6whVtE1H3U9ZF1kuF2M',
    appId: '1:521202042499:web:32620842c113cf94a77db6',
    messagingSenderId: '521202042499',
    projectId: 'pokedex-as',
    authDomain: 'pokedex-as.firebaseapp.com',
    storageBucket: 'pokedex-as.firebasestorage.app',
    measurementId: 'G-0N89YEP99L',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyDow6hJB3uGbV4taok4wHN21h-BFi1ZGhA',
    appId: '1:521202042499:android:a226ef26dbe6aab5a77db6',
    messagingSenderId: '521202042499',
    projectId: 'pokedex-as',
    storageBucket: 'pokedex-as.firebasestorage.app',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'AIzaSyA6glqS0iFYODZ2icAVrb2ByWDkLlsjQXY',
    appId: '1:521202042499:ios:b27713416cb71a58a77db6',
    messagingSenderId: '521202042499',
    projectId: 'pokedex-as',
    storageBucket: 'pokedex-as.firebasestorage.app',
    iosBundleId: 'com.example.appFilmes',
  );

  static const FirebaseOptions windows = FirebaseOptions(
    apiKey: 'AIzaSyCElpLrwuGRrp_X6whVtE1H3U9ZF1kuF2M',
    appId: '1:521202042499:web:5579e37b4597df32a77db6',
    messagingSenderId: '521202042499',
    projectId: 'pokedex-as',
    authDomain: 'pokedex-as.firebaseapp.com',
    storageBucket: 'pokedex-as.firebasestorage.app',
    measurementId: 'G-MKDY3J4HMX',
  );
}
