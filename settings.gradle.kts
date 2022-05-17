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
        maven(url = "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.google.com")
        maven {
            isAllowInsecureProtocol = true
            setUrl("http://raw.github.com/saki4510t/libcommon/master/repository/")
        }
        //https://github.com/jiangdongguo/AndroidUSBCamera
    }
}

rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "Cexup v2"
include(":app_consumer")
include(":app_corporate")
include(":app_doctor")
include(":data")
include(":domain")
include(":component")
//spo2 ring
include(":bleLibrary")


