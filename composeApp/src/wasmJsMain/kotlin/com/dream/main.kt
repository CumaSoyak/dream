package com.dream

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("PeopleInSpace", canvasElementId = "peopleInSpaceCanvas") {
        ComposeViewport(document.body!!) {
           // App()
           // PeopleInSpaceScreen()
        }
    }
}