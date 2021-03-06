object Dependencies {

    val Essential = listOf(
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Essential.Coroutines}"
    )

    object Hilt {
        const val Core = "com.google.dagger:hilt-core:${Versions.Jetpack.Hilt}"
        const val Android = "com.google.dagger:hilt-android:${Versions.Jetpack.Hilt}"
        const val Kapt = "com.google.dagger:hilt-android-compiler:${Versions.Jetpack.Hilt}"
    }

    object Jetpack {
        const val DataStore = "androidx.datastore:datastore-preferences:1.0.0"
    }

    val Ktx = listOf(
        "androidx.core:core-ktx:${Versions.Ktx.Core}",
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Ktx.LifeCycle}",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Ktx.ViewModel}",
    )


    val Network = listOf(
        "com.squareup.retrofit2:retrofit:${Versions.Network.Retrofit}",
        "com.squareup.okhttp3:logging-interceptor:${Versions.Network.OkHttp}",
        "com.squareup.okhttp3:okhttp:${Versions.Network.OkHttp}",
        "com.squareup.retrofit2:converter-gson:${Versions.Network.Retrofit}"
    )

    val Compose = listOf(
        "androidx.compose.material3:material3:${Versions.Compose.Material3}",
        "androidx.activity:activity-compose:${Versions.Compose.Activity}",
        "com.google.accompanist:accompanist-placeholder:${Versions.Compose.Accompanist}",
        "com.google.accompanist:accompanist-swiperefresh:${Versions.Compose.Accompanist}",
        "com.google.accompanist:accompanist-systemuicontroller:${Versions.Compose.Accompanist}",
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.Compose.LifecycleViewModel}",
        "com.google.accompanist:accompanist-navigation-animation:${Versions.Compose.Accompanist}",
        "androidx.hilt:hilt-navigation-compose:${Versions.Compose.HiltNavigationCompose}",
        "androidx.compose.ui:ui-tooling:${Versions.Compose.Main}",
        "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.Main}",
        "io.coil-kt:coil-compose:${Versions.Compose.Coil}"
    )
    val Test = listOf(
        "org.junit.jupiter:junit-jupiter-api:${Versions.Test.JUnit}",
        "org.junit.jupiter:junit-jupiter-engine:${Versions.Test.JUnit}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Test.Coroutine}",
        "io.mockk:mockk:${Versions.Test.Mockk}"
    )
}