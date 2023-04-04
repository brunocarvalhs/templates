pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
rootProject.name = "{{inputs.project_name}}"
include(":{{module_name}}", ":domain", ":data", ":commons")

include(":features:auth")
include(":features:costs")
include(":features:profile")
include(":features:groups")
include(":features:extracts")
include(":features:billet_registration")
include(":features:report")
