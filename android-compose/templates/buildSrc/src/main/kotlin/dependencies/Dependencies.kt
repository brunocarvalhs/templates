package dependencies

object Dependencies {
    object Core {
        const val KTX = "androidx.core:core-ktx:${Versions.Core.KTX}"
        const val LIFECYCLE_RUNTIME =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Core.LIFECYCLE_RUNTIME}"
        const val LIFECYCLE_LIVEDATA =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Core.LIFECYCLE_RUNTIME}"
        const val LIFECYCLE_VIEWMODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Core.LIFECYCLE_RUNTIME}"
        const val MULTIDEX = "androidx.multidex:multidex:${Versions.Core.MULTIDEX}"
    }

    object UI {
        const val MATERIAL = "com.google.android.material:material:${Versions.UI.MATERIAL}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.Test.JUNIT}"
        const val JUNIT_ANDROID = "androidx.test.ext:junit:${Versions.Test.JUNIT_ANDROID}"
        const val ESPRESSO_CORE =
            "androidx.test.espresso:espresso-core:${Versions.Test.ESPRESSO_CORE}"
        const val MOCKITO = "org.mockito:mockito-core:${Versions.Test.MOCKITO}"
    }

    object Hilt {
        const val ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.ANDROID}"
        const val ANDROID_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.Hilt.ANDROID_COMPILER}"
        const val ANDROID_TESTING =
            "com.google.dagger:hilt-android-testing:${Versions.Hilt.ANDROID_TESTING}"
    }

    object Firebase {
        const val BOM = "com.google.firebase:firebase-bom:${Versions.Firebase.BOM}"
        const val CRASHLYTICS =
            "com.google.firebase:firebase-crashlytics-ktx:${Versions.Firebase.CRASHLYTICS}"
        const val ANALYTICS =
            "com.google.firebase:firebase-analytics-ktx:${Versions.Firebase.ANALYTICS}"
        const val AUTH = "com.google.firebase:firebase-auth-ktx:${Versions.Firebase.AUTH}"
        const val FIRESTORE =
            "com.google.firebase:firebase-firestore-ktx:${Versions.Firebase.FIRESTORE}"
        const val PLAY_SERVICES_AUTH =
            "com.google.android.gms:play-services-auth:${Versions.Firebase.PLAY_SERVICES_AUTH}"
        const val COROUTINES_PLAY_SERVICES =
            "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.Firebase.COROUTINES_PLAY_SERVICES}"
        const val UI_AUTH = "com.firebaseui:firebase-ui-auth:${Versions.Firebase.UI_AUTH}"
    }

    object Network {
        const val GSON = "com.google.code.gson:gson:${Versions.Network.GSON}"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Network.RETROFIT}"
        const val RETROFIT_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.Network.RETROFIT_GSON}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.Network.OKHTTP}"
        const val OKHTTP_LOGGING =
            "com.squareup.okhttp3:logging-interceptor:${Versions.Network.OKHTTP_LOGGING}"
    }

    object Compose {
        const val BOM = "androidx.compose:compose-bom:${Versions.Compose.BOM}"
        const val MATERIAL_YOU = "androidx.compose.material3:material3"
        const val MATERIAL = "androidx.compose.material:material"
        const val FOUNDATION = "androidx.compose.foundation:foundation"
        const val UI = "androidx.compose.ui:ui"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val UI_TOOLING_PREVIEW_DEBUG = "androidx.compose.ui:ui-tooling"

        const val UI_TEST = "androidx.compose.ui:ui-test-junit4"
        const val UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"

        const val MATERIAL_ICONS_CORE = "androidx.compose.material:material-icons-core"
        const val MATERIAL_ICONS_EXTENDED = "androidx.compose.material:material-icons-extended"
        const val MATERIAL_WINDOW = "androidx.compose.material3:material3-window-size-class"

        const val ACTIVITY = "androidx.activity:activity-compose:${Versions.Compose.ACTIVITY}"
        const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.Compose.VIEW_MODEL}"
        const val LIVE_DATA = "androidx.compose.runtime:runtime-livedata"

        const val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.Compose.NAVIGATION}"
    }
}