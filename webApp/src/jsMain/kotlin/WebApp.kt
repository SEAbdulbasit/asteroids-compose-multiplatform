package com.example.musicapp_kmp

import CommonMainWeb
import androidx.compose.ui.ExperimentalComposeUiApi
import org.jetbrains.skiko.wasm.onWasmReady
import androidx.compose.ui.window.CanvasBasedWindow

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Asteroids Web") {
            CommonMainWeb()
        }
    }
}