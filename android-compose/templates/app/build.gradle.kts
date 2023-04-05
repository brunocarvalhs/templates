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
                resValue("string", "app_name", "{{inputs.project_name}}")

                isDebuggable = false
                isJniDebuggable = false
                signingConfig = signingConfigs.getByName("release")
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
                )
            }
            getByName("debug") {
                resValue("string", "app_name", "{{inputs.project_name}} - Debug")

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
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    lint {
        abortOnError = false
        disable += "MissingTranslation"
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    // Modules
    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":domain")))
    implementation(project(mapOf("path" to ":commons")))

    // Core dependencies
    implementation(Dependencies.Core.KTX)
    implementation(Dependencies.Core.MULTIDEX)
    implementation(Dependencies.Core.LIFECYCLE_RUNTIME)
    implementation(Dependencies.Core.LIFECYCLE_LIVEDATA)
    implementation(Dependencies.Core.LIFECYCLE_VIEWMODEL)

    // Test dependencies
    testImplementation(Dependencies.Test.JUNIT)
    androidTestImplementation(Dependencies.Test.JUNIT_ANDROID)
    androidTestImplementation(Dependencies.Test.ESPRESSO_CORE)

    // Hilt dependencies
    implementation(Dependencies.Hilt.ANDROID)
    kapt(Dependencies.Hilt.ANDROID_COMPILER)
    kapt("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0")

    // Compose
    implementation(platform(Dependencies.Compose.BOM))
    androidTestImplementation(platform(Dependencies.Compose.BOM))
    implementation(Dependencies.Compose.MATERIAL_YOU)
    implementation(Dependencies.Compose.MATERIAL)
    implementation(Dependencies.Compose.FOUNDATION)
    implementation(Dependencies.Compose.UI)
    implementation(Dependencies.Compose.UI_TOOLING_PREVIEW)
    debugImplementation(Dependencies.Compose.UI_TOOLING_PREVIEW_DEBUG)
    androidTestImplementation(Dependencies.Compose.UI_TEST)
    debugImplementation(Dependencies.Compose.UI_TEST_MANIFEST)
    implementation(Dependencies.Compose.MATERIAL_ICONS_CORE)
    implementation(Dependencies.Compose.MATERIAL_ICONS_EXTENDED)
    implementation(Dependencies.Compose.MATERIAL_WINDOW)
    implementation(Dependencies.Compose.ACTIVITY)
    implementation(Dependencies.Compose.VIEW_MODEL)
    implementation(Dependencies.Compose.LIVE_DATA)
    implementation(Dependencies.Compose.NAVIGATION)
}
