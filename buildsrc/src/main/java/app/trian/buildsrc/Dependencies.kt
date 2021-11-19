package app.trian.buildsrc

object ApplicationId {
    var id = "app.trian.uikit"
}

object AppVersion{
    private const val versionMajor = 0
    private const val versionMinor = 0
    private const val versionPatch = 1
    private const val versionBuild = 0

    var composeVersion = "1.0.5"
    var compileSdkVersion = 31
    var minSdkVersion = 21
    var targetSdkVersion = 31
    var kotlinVersion = "1.5.21"

    var versionCode = versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100 + versionBuild
    var versionName = "$versionMajor.$versionMinor.$versionPatch"
}

object GradlePlugin{
    object Android{
        object Tools{
            var buildGradle = "com.android.tools.build:gradle:7.0.3"
        }
    }
    object Jetbrains{
        object Kotlin{
            var kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21"
        }
    }
}

object Libs {
    object AndroidX{
        object Appcompat{
            var appcompat = "androidx.appcompat:appcompat:1.3.1"
        }
        object Core{
            var ktx = "androidx.core:core-ktx:1.7.0"
        }
        object Compose{
            var ui ="androidx.compose.ui:ui:${AppVersion.composeVersion}"
            var material ="androidx.compose.material:material:${AppVersion.composeVersion}"
            var uiToolingPreview ="androidx.compose.ui:ui-tooling-preview:${AppVersion.composeVersion}"
            var uiTestJunit = "androidx.compose.ui:ui-test-junit4:${AppVersion.composeVersion}"
            var uiTooling = "androidx.compose.ui:ui-tooling:${AppVersion.composeVersion}"
        }
        object Lifecycle{
            var runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
        }
        object Activity{
            var activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Test{
            var junit = "junit:junit:4.+"
            object Ext{
                var junit ="androidx.test.ext:junit:1.1.3"
            }
            object Espresso{
                var espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
            }
        }
    }
    object Google{
        object Android{
            var material = "com.google.android.material:material:1.4.0"
        }
    }
}