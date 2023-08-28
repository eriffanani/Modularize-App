plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.erif.modularize"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.erif.modularize"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    //implementation(project(":chatroom"))
    implementation(project(":resources"))
    implementation(project(":payment"))
    implementation(Core.ktx)
    implementation(Core.appCompat)
    implementation(Core.material)
    implementation(Core.constraint)
    testImplementation(Core.jUnit)
    androidTestImplementation(Core.testJUnit)
    androidTestImplementation(Core.espresso)
}