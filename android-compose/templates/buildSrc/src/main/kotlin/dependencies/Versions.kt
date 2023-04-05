package dependencies

object Versions {
    object Core {
        const val MULTIDEX = "2.0.1"
        const val KTX = "1.9.0"
        const val LIFECYCLE_RUNTIME = "2.5.1"
    }

    object UI {
        const val MATERIAL = "1.7.0"
        const val APPCOMPAT = "1.5.1"
    }

    object Test {
        const val JUNIT = "4.13.2"
        const val JUNIT_ANDROID = "1.1.4"
        const val ESPRESSO_CORE = "3.5.0"
        const val MOCKITO = "4.11.0"
    }

    object Hilt {
        const val ANDROID = "2.44.2"
        const val ANDROID_COMPILER = "2.44.2"
        const val ANDROID_TESTING = "2.44.2"
    }

    object Firebase {
        const val BOM = "31.1.1"
        const val CRASHLYTICS = ""
        const val ANALYTICS = ""
        const val AUTH = "21.1.0"
        const val FIRESTORE = "24.4.1"
        const val PLAY_SERVICES_AUTH = "18.1.0"
        const val COROUTINES_PLAY_SERVICES = "1.6.4"
        const val UI_AUTH = "8.0.2"
    }

    object Network {
        const val GSON = "2.9.0"
        const val RETROFIT = "2.9.0"
        const val RETROFIT_GSON = "2.9.0"
        const val OKHTTP = "4.9.0"
        const val OKHTTP_LOGGING = "4.9.0"
    }

    object Compose {
        const val BOM = "2023.01.00"
        const val ACTIVITY = "1.6.1"
        const val VIEW_MODEL = "2.5.1"
        const val NAVIGATION = "2.5.3"
    }
}