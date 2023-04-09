package dependencies

object Dependencies {
    val CORE_KTX = "androidx.core:core-ktx:1.7.0"
    val APPCOMPAT = "androidx.appcompat:appcompat:1.6.1"
    val MATERIAL = "com.google.android.material:material:1.8.0"
    val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
    val JUNIT = "junit:junit:4.13.2"
    val ANDROIDX_JUNIT = "androidx.test.ext:junit:1.1.5"
    val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
    val MULTIDEX = "androidx.multidex:multidex:${Versions.Core.MULTIDEX}"
    val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.UI.NAVIGATION_FRAGMENT}"
    val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.UI.NAVIGATION_UI}"

    object Hilt {
        const val ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.ANDROID}"
        const val ANDROID_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.Hilt.ANDROID_COMPILER}"
        const val ANDROID_TESTING =
            "com.google.dagger:hilt-android-testing:${Versions.Hilt.ANDROID_TESTING}"
    }
}