plugins {
    id("com.android.application")
    id("kotlin-android")
    // Firebase Google Services plugin must be added here:
    id("com.google.gms.google-services")
    // Flutter plugin:
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.messaging_app"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.example.messaging_app"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    // Firebase BoM (Bill of Materials)
    implementation(platform("com.google.firebase:firebase-bom:33.6.0"))

    // Firestore for Android
    implementation("com.google.firebase:firebase-firestore-ktx")
}
