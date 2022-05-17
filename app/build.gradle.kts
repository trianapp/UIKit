
plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}


android {
    compileSdk = 31
    defaultConfig {
        applicationId = "app.trian.uikit"
        minSdk = 23
        targetSdk = 30
        versionCode = 17
        versionName = "1.0.1(14)"
        multiDexEnabled = true
        vectorDrawables {
            useSupportLibrary = true
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    //
    lint {
        baseline = file("lint-baseline.xml")
        abortOnError = false
    }


    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.composeCompiler
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            jniLibs.pickFirsts += "**/*.so"
        }
    }

}



dependencies {
    //Loads packaged libraries in the libs folder
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))

    implementation(project(":component"))


    implementation(Libs.Br.Com.Devsrsouza.Compose.Icons.Android.octicons)
    implementation(Libs.AndroidX.Multidex.multidex)
    implementation(Libs.AndroidX.Core.coreKtx)
    implementation(Libs.Com.Google.Android.Flexbox.flexbox)
    implementation(Libs.AndroidX.Activity.activityCompose)
    implementation(Libs.Io.CoilKt.coilCompose)
    with(Libs.AndroidX.Compose) {
        implementation(Libs.AndroidX.Compose.Ui.ui)
        // https://stackoverflow.com/questions/68224361/jetpack-compose-cant-preview-after-updating-to-1-0-0-rc01
        implementation(Libs.AndroidX.Compose.Ui.uiTooling)
        implementation(Libs.AndroidX.Compose.Ui.uiToolingPreview)
        implementation(Libs.AndroidX.Compose.Material.material)
        implementation(Libs.AndroidX.Compose.Runtime.runtimeLivedata)
        implementation(Libs.AndroidX.Compose.Material.icons)
        implementation(Libs.AndroidX.Compose.Material.iconsExtended)
        androidTestImplementation(Libs.AndroidX.Compose.Ui.uiTestJunit4)
        debugImplementation(Libs.AndroidX.Compose.Ui.uiTestManifest)
        debugImplementation(Libs.AndroidX.Compose.Ui.uiTooling)

    }
    with(Libs.Com.Google.Accompanist) {
        implementation(accompanistSystemUiController)
        implementation(accompanistPager)
        implementation(accompanistNavigationAnimation)
        implementation(accompanistNavigationMaterial)
        implementation(accompanistInset)
        implementation(accompanistSwipeRefresh)
        implementation(accompanistShimmer)
        implementation(accompanistPagerIndicator)

    }


    with(Libs.AndroidX.Lifecycle) {
        implementation(lifecycleRuntimeKtx)
        // ViewModel
        implementation(lifecycleViewmodel)
        implementation(lifecycleViewmodelCompose)
    }

    testImplementation(Libs.AndroidX.Arch.Core.coreTesting)
    androidTestImplementation(Libs.AndroidX.Arch.Core.coreTesting)

    //hilt dagger (support viewModel)
    //https://developer.android.com/training/dependency-injection/hilt-android#setup
    //https://developer.android.com/training/dependency-injection/hilt-testing?hl=id
    with(Libs.Com.Google.Dagger) {
        implementation(hiltAndroid)
        kapt(hiltAndroidCompiler)
        testImplementation(hiltAndroidTesting)
        kaptTest(hiltAndroidCompiler)
        androidTestImplementation(hiltAndroidTesting)
        kaptAndroidTest(hiltAndroidCompiler)

    }

    implementation(Libs.Com.Squareup.Logcat.logcat)
    with(Libs.AndroidX.Work) {
        implementation(workRuntime)
        implementation(workRuntimeKtx)
    }


    with(Libs.AndroidX.Hilt) {
        implementation(hiltWork)
        //supaya bisa inject viewModel ke navigation
        //https://developer.android.com/jetpack/compose/libraries#hilt
        implementation(hiltNavigationCompose)
        implementation(hiltLifecycleViewmodel)
        kapt(hiltCompiler)
    }

    implementation(Libs.Com.Google.Code.Gson.gson)

    with(Libs.Com.Github.Bumptech.Glide) {
        implementation(glide)
        kapt(compiler)
    }


    implementation(Libs.Com.Github.Skydoves.landscapist)
    implementation(Libs.Com.Github.PhilJay.mpAndroidChart)


    testImplementation(Libs.Org.Mockito.mockitoCore)
    //  Bump to 4.6.* after https://github.com/robolectric/robolectric/issues/6593 is fixed
    testImplementation(Libs.Org.Robolectric.robolectric)

    //navigation
    //https://developer.android.com/jetpack/compose/navigation
    implementation(Libs.AndroidX.Navigation.navigationCompose)


    //    local unit test
    testImplementation(Libs.Junit.junit)
    testImplementation(Libs.Com.Google.Truth.truth)
    androidTestImplementation(Libs.Com.Google.Truth.truth)
//    instrumentation test
    androidTestImplementation(Libs.AndroidX.Test.Ext.junit)
    androidTestImplementation(Libs.AndroidX.Test.Espresso.espressoCore)

    androidTestImplementation(Libs.Org.Jetbrains.Kotlinx.kotlinxCoroutinesTest)


}


// Allow references to generated code
kapt {
    correctErrorTypes = true
    includeCompileClasspath = false
}