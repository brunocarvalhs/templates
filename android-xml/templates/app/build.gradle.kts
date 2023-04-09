import config.AndroidConfig
import dependencies.Dependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    namespace = AndroidConfig.APP_ID
    compileSdk = AndroidConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = AndroidConfig.APP_ID
        minSdk = AndroidConfig.MIN_SDK_VERSION
        targetSdk = AndroidConfig.TARGET_SDK_VERSION
        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME
        multiDexEnabled = true

        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    android {
        signingConfigs {
            create("release") {
                val keyStorePassword = System.getenv("KEYSTORE_PASSWORD")
                val keyStoreAlias = System.getenv("KEYSTORE_ALIAS")
                val keyStoreAliasPassword = System.getenv("KEY_PASSWORD")
                if (
                        keyStorePassword != null &&
                                keyStoreAlias != null &&
                                keyStoreAliasPassword != null
                ) {
                    storeFile = file("release.keystore")
                    storePassword = keyStorePassword
                    keyAlias = keyStoreAlias
                    keyPassword = keyStoreAliasPassword
                }
            }
        }
        buildTypes {
            getByName("release") {
                resValue("string", "app_name", "{{app_name}}")

                isDebuggable = false
                isJniDebuggable = false
                signingConfig = signingConfigs.getByName("release")
                proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
                )
            }
            getByName("debug") {
                resValue("string", "app_name", "{{app_name}} - Debug")

                applicationIdSuffix = ".debug"
                isMinifyEnabled = false
                isDebuggable = true
            }
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
        viewBinding = true
        dataBinding = true
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(mapOf("path" to ":domain")))
    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":commons")))

    implementation(project(mapOf("path" to ":features:home")))

    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.MULTIDEX)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    testImplementation(Dependencies.JUNIT)
    androidTestImplementation(Dependencies.ANDROIDX_JUNIT)
    androidTestImplementation(Dependencies.ESPRESSO_CORE)
    implementation(Dependencies.Hilt.ANDROID)
    kapt(Dependencies.Hilt.ANDROID_COMPILER)
}