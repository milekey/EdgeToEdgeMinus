plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.scaredeer.edgetoedgetest"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.scaredeer.edgetoedge.edgetoedgeminus"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "20250330"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(project(":edgetoedge"))
}