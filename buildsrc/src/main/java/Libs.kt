import org.gradle.kotlin.dsl.provideDelegate

object Libs {
    object Com {
        object Google {





            //accompanist(external library for jetpack compose)
            object Accompanist {
                const val accompanistVersion = "0.23.1"
                val accompanistSystemUiController by lazy { "com.google.accompanist:accompanist-systemuicontroller:$accompanistVersion" }
                val accompanistPager by lazy { "com.google.accompanist:accompanist-pager:0.18.0" }
                val accompanistNavigationAnimation by lazy { "com.google.accompanist:accompanist-navigation-animation:$accompanistVersion" }
                val accompanistNavigationMaterial by lazy { "com.google.accompanist:accompanist-navigation-material:$accompanistVersion" }
                val accompanistInset by lazy { "com.google.accompanist:accompanist-insets:$accompanistVersion" }
                val accompanistSwipeRefresh by lazy { "com.google.accompanist:accompanist-swiperefresh:$accompanistVersion" }
                val accompanistShimmer by lazy { "com.google.accompanist:accompanist-placeholder-material:$accompanistVersion" }
                val accompanistPagerIndicator by lazy { "com.google.accompanist:accompanist-pager-indicators:0.18.0" }
            }

            //dagger hilt
            object Dagger {
                private const val dagger_hilt_version = "2.38.1"
                val hiltAndroid by lazy { "com.google.dagger:hilt-android:$dagger_hilt_version" }
                val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:$dagger_hilt_version" }
                val hiltAndroidTesting by lazy { "com.google.dagger:hilt-android-testing:$dagger_hilt_version" }

            }

            object Truth {
                val truth by lazy { "com.google.truth:truth:1.1" }
            }

            object Code {
                object Gson {
                    val gson by lazy { "com.google.code.gson:gson:2.3" }
                }
            }
        }

        object Squareup {
            //for logging in debugging mode
            object Logcat {
                val logcat by lazy { "com.squareup.logcat:logcat:0.1" }

            }


        }

        object Github {
            object Bumptech {
                object Glide {
                    val glide by lazy { "com.github.bumptech.glide:glide:4.12.0" }
                    val compiler by lazy { "com.github.bumptech.glide:compiler:4.12.0" }
                }
            }


            object Skydoves {
                val landscapist by lazy { "com.github.skydoves:landscapist-coil:1.4.1" }
            }


            object GrenderG {
                val toasty by lazy { "com.github.GrenderG:Toasty:1.5.2" }
            }

            object PhilJay {
                val mpAndroidChart by lazy { "com.github.PhilJay:MPAndroidChart:v3.1.0" }
            }
        }
    }

    object AndroidX {


        object Work {
            const val work_version = "2.7.1"
            val workRuntime by lazy { "androidx.work:work-runtime:$work_version" }
            val workRuntimeKtx by lazy { "androidx.work:work-runtime-ktx:$work_version" }


        }

        object Multidex {
            val multidex by lazy { "androidx.multidex:multidex:2.0.1" }
        }

        object Core {
            val coreKtx by lazy { "androidx.core:core-ktx:1.7.0" }
        }

        object Compose {
            const val compose_version = "1.2.0-alpha02"

            object Ui {

                val ui by lazy { "androidx.compose.ui:ui:$compose_version" }
                val uiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:$compose_version" }
                val uiTooling by lazy { "androidx.compose.ui:ui-tooling:$compose_version" }
                val uiTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4:$compose_version" }
                val uiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:$compose_version" }
                var uiTest = "androidx.compose.ui:ui-test:$compose_version"

            }

            object Runtime {
                val runtime by lazy { "androidx.compose.runtime:runtime:$compose_version" }
                val runtimeLivedata by lazy { "androidx.compose.runtime:runtime-livedata:$compose_version" }
            }

            object Material {
                val material by lazy { "androidx.compose.material:material:$compose_version" }
                val icons by lazy { "androidx.compose.material:material-icons-core:$compose_version" }
                val iconsExtended by lazy { "androidx.compose.material:material-icons-extended:$compose_version" }
            }


        }

        object Lifecycle {
            private const val lifecycle_version = "2.5.0-alpha01"
            val lifecycleViewmodelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07" }
            val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0" }
            val lifecycleViewmodel by lazy { "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version" }
        }

        object Activity {
            val activityCompose by lazy { "androidx.activity:activity-compose:1.4.0" }
        }

        object Arch {
            const val arch_version = "2.1.0"

            object Core {
                val coreTesting by lazy { "androidx.arch.core:core-testing:$arch_version" }
            }
        }

        object Navigation {
            val navigationCompose by lazy { "androidx.navigation:navigation-compose:2.5.0-alpha01" }
        }

        object Hilt {
            val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:1.0.0" }

            //https://stackoverflow.com/questions/67020214/hiltworker-annotation-can-not-be-found
            val hiltWork by lazy { "androidx.hilt:hilt-work:1.0.0" }
            val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:1.0.0" }
            val hiltLifecycleViewmodel by lazy { "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03" }
        }


        object Test {
            object Ext {
                val junit by lazy { "androidx.test.ext:junit:1.1.3" }
            }

            object Espresso {
                val espressoCore by lazy { "androidx.test.espresso:espresso-core:3.4.0" }
            }
        }
    }

    object Org {
        object Jetbrains {


            object Kotlinx {
                 val kotlinxCoroutinesTest by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.kotlinCoroutine}" }
            }


        }


        object Mockito {
            val mockitoCore by lazy { "org.mockito:mockito-core:4.0.0" }
        }

        object Robolectric {
            val robolectric by lazy { "org.robolectric:robolectric:4.5.1" }
        }
    }

    object Br {
        object Com {
            object Devsrsouza {
                object Compose {
                    object Icons {
                        object Android {
                            val octicons by lazy { "br.com.devsrsouza.compose.icons.android:octicons:1.0.0" }
                            val feather by lazy { "br.com.devsrsouza.compose.icons.android:feather:1.0.0" }
                        }
                    }
                }
            }
        }
    }


    object Io {
        object CoilKt {
            val coilCompose by lazy { "io.coil-kt:coil-compose:1.4.0" }
        }


    }

    object Junit {
        val junit by lazy { "junit:junit:4.13.2" }
    }


}
