package com.dream

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dream.composeapp.generated.resources.Res
import dream.composeapp.generated.resources.compose_multiplatform
import kotlinx.browser.window
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource

@Composable
fun App() {
    var cityData by remember { mutableStateOf<List<City>>(emptyList()) }

    MaterialTheme {

        LaunchedEffect(Unit) {
            try {
                cityData = DreamApi().fetchData()  // API'den veriyi çek
            } catch (e: Exception) {
                window.alert("Error fetching data: ${e.message}")
            }
        }

        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text(cityData.size.toString())
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}
