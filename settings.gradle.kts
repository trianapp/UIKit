pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        mavenCentral()

    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.google.com")
    }
}

rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "Uikit"
include(":app")
include(":component")



