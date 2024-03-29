package config

import org.gradle.api.JavaVersion

object AndroidConfig {
    const val COMPILE_SDK_VERSION = 33
    const val MIN_SDK_VERSION = {{inputs.minimum_sdk}}
    const val TARGET_SDK_VERSION = 33

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"

    const val APP_ID = "{{inputs.package_name}}.{{module_name}}"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

    val JAVA_VERSION = JavaVersion.VERSION_1_8

    const val KOTLIN_COMPILE_COMPOSE = "1.3.2"
}