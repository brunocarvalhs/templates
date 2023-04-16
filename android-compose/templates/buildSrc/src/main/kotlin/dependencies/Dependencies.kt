package dependencies

object Dependencies {

    object BOM {
        val COMPOSE = "androidx.compose:compose-bom:${Versions.Compose.COMPOSE}"
    }

    object Compose {
        val UI = "androidx.compose.ui:ui"
        val UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
        val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        val MATERIAL_YOU = "androidx.compose.material3:material3"
        val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.Compose.ACTIVITY_COMPOSE}"
        val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.Compose.NAVIGATION}"
    }

    object Testing {
        val JUNIT = "junit:junit:${Versions.Testing.JUNIT}"
        val ANDROIDX_JUNIT = "androidx.test.ext:junit:${Versions.Testing.ANDROIDX_JUNIT}"
        val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.Testing.ESPRESSO_CORE}"
        val COMPOSE_UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
        val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling"
        val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
    }

    object Core {
        val CORE_KTX = "androidx.core:core-ktx:${Versions.Core.CORE_KTX}"
        val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Core.LIFECYCLE_RUNTIME_KTX}"
        val MULTIDEX = "androidx.multidex:multidex:${Versions.Core.MULTIDEX}"
    }

    object Hilt {
        val ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.ANDROID}"
        val ANDROID_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.Hilt.ANDROID_COMPILER}"
        val ANDROID_TESTING =
            "com.google.dagger:hilt-android-testing:${Versions.Hilt.ANDROID_TESTING}"
    }
}
