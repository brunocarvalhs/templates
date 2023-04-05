package dependencies

object Dependencies {
    object Compose {
        const val UI = "androidx.compose.ui:ui:1.4.0"
        const val MATERIAL_YOU = "androidx.compose.material3:material3:1.0.0-alpha11"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:1.4.0"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:1.3.1"
        const val NAVIGATION = "androidx.navigation:navigation-compose:2.5.3"
    }

    object Testing {
        const val JUNIT = "junit:junit:4.13.2"
        const val ANDROIDX_JUNIT = "androidx.test.ext:junit:1.1.5"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
        const val COMPOSE_UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4:1.4.0"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:1.4.0"
        const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest:1.4.0"
    }

    object Core {
        const val CORE_KTX = "androidx.core:core-ktx:1.7.0"
        const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        const val MULTIDEX = "androidx.multidex:multidex:${Versions.Core.MULTIDEX}"
    }

    object Hilt {
        const val ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.ANDROID}"
        const val ANDROID_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.Hilt.ANDROID_COMPILER}"
        const val ANDROID_TESTING =
            "com.google.dagger:hilt-android-testing:${Versions.Hilt.ANDROID_TESTING}"
    }
}
