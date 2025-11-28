# Messaging App – Flutter + Firebase (Real-Time Chat)

DEVELOPERS: 
EYLÜL BAŞAK ÇAĞLAYAN(28505181482), KADER TÜLİN SÜRE (10148830858)

This project is developed as part of **BIM 493 – Mobile Programming I - Assignment 3**.  
It is a simple **real-time messaging application** built with Flutter and powered by **Firebase Cloud Firestore** for real-time data synchronization.

---

## 🚀 Features
- Users can send messages instantly.
- All messages are stored in Firebase Firestore.
- Real-time updates using Firestore's snapshot listener.
- Modern Flutter UI (Material 3).
- Firebase integration fully configured for Android.

---

## 🛠️ Technologies Used
- **Flutter (Dart)**
- **Firebase Core**
- **Firebase Cloud Firestore**
- **Kotlin DSL Gradle Configuration**
- **Android Emulator / Physical Device**

---

## 📂 Project Structure
lib/
└── main.dart # Main app logic and Firebase communication
android/
└── ... # google-services.json and Firebase Gradle configs
pubspec.yaml # Project dependencies

---

## 🔧 Installation & Running the App

### 1. Install dependencies
'''bash
flutter pub get

2. Run the app on an Android device or emulator
flutter devices
flutter run -d <device_id>

3. Send a message

Type a message in the input field

Tap Send

The message appears instantly on the screen

Also visible in Firebase Console → Firestore Database → Data

Messages are stored in Firestore using:

FirebaseFirestore.instance.collection('messages').add({
  'text': messageText,
  'timestamp': FieldValue.serverTimestamp(),
});
Messages are updated live via a StreamBuilder:

StreamBuilder<QuerySnapshot>(
  stream: FirebaseFirestore.instance
    .collection('messages')
    .orderBy('timestamp')
    .snapshots(),
  builder: ...
)
This ensures:

A message sent from one device

Appears instantly on all other devices

Without refresh → fully real-time

Firebase Setup

Firestore Database created in Test Mode

google-services.json placed inside android/app/

android/build.gradle.kts and android/app/build.gradle.kts updated with:

com.google.gms.google-services plugin

Firebase BoM and Firestore dependencies
