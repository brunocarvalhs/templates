import config.AndroidConfig
import interfaces.BuildType
import flavor.BuildTypeRelease
import flavor.BuildTypeDebug
import dependencies.Dependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = AndroidConfig.APP_ID + ".commons"
    compileSdk = AndroidConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = AndroidConfig.MIN_SDK_VERSION
        targetSdk = AndroidConfig.TARGET_SDK_VERSION

        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
            isJniDebuggable = BuildTypeDebug.isDebuggable
        }
    }
    compileOptions {
        sourceCompatibility = AndroidConfig.JAVA_VERSION
        targetCompatibility = AndroidConfig.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = AndroidConfig.KOTLIN_COMPILE_COMPOSE
    }
}

dependencies {
    implementation(Dependencies.Core.CORE_KTX)
    implementation(Dependencies.Core.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.Compose.ACTIVITY_COMPOSE)
    implementation(Dependencies.Compose.UI)
    implementation(Dependencies.Compose.UI_TOOLING_PREVIEW)
    implementation(Dependencies.Compose.MATERIAL_YOU)
    implementation("androidx.compose.material:material:1.4.0")
    testImplementation(Dependencies.Testing.JUNIT)
    androidTestImplementation(Dependencies.Testing.ANDROIDX_JUNIT)
    androidTestImplementation(Dependencies.Testing.ESPRESSO_CORE)
    androidTestImplementation(Dependencies.Testing.COMPOSE_UI_TEST_JUNIT4)
    debugImplementation(Dependencies.Testing.COMPOSE_UI_TOOLING)
    debugImplementation(Dependencies.Testing.COMPOSE_UI_TEST_MANIFEST)
}