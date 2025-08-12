plugins {
    id("com.android.application")
    id("kotlin-android")
<<<<<<< HEAD
    id("org.jetbrains.kotlin.android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")
=======
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
>>>>>>> 4a5ad0da47d0864303d4d196a82c3d1cf8df98cc
}

android {
    namespace = "com.example.project_1"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.example.project_1"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
<<<<<<< HEAD
dependencies {
    // Firebase BOM (সব সার্ভিসের ভার্সন ম্যানেজ করার জন্য)
    implementation(platform("com.google.firebase:firebase-bom:33.1.2"))

    // Firebase Analytics (বেশিরভাগ প্রজেক্টে লাগে)
    implementation("com.google.firebase:firebase-analytics")

    // Firebase Authentication
    implementation("com.google.firebase:firebase-auth")

    // Cloud Firestore Database
    implementation("com.google.firebase:firebase-firestore")

    // Cloud Storage
    implementation("com.google.firebase:firebase-storage")

    // Firebase Cloud Messaging (Push Notifications)
    implementation("com.google.firebase:firebase-messaging")

    // Firebase Dynamic Links
    implementation("com.google.firebase:firebase-dynamic-links")
}
=======
>>>>>>> 4a5ad0da47d0864303d4d196a82c3d1cf8df98cc
