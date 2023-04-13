package dependencies

object Dependencies {

    object BOM {
        const val COMPOSE = "androidx.compose:compose-bom:${Versions.Compose.COMPOSE}"
    }

    object Compose {
        const val UI = "androidx.compose.ui:ui"
        const val UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val MATERIAL_YOU = "androidx.compose.material3:material3"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.Compose.ACTIVITY_COMPOSE}"
        const val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.Compose.NAVIGATION}"
    }

    object Testing {
        const val JUNIT = "junit:junit:${Versions.Testing.JUNIT}"
        const val ANDROIDX_JUNIT = "androidx.test.ext:junit:${Versions.Testing.ANDROIDX_JUNIT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.Testing.ESPRESSO_CORE}"
        const val COMPOSE_UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling"
        const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
    }

    object Core {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.Core.CORE_KTX}"
        const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Core.LIFECYCLE_RUNTIME_KTX}"
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
