plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

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