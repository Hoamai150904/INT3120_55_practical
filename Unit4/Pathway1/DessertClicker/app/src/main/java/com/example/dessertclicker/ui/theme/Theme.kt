package com.example.dessertclicker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// nghĩa bảng màu cho dark theme
private val DarkColorPalette = darkColorScheme(
    primary = Purple200,
    secondary = Pink600
)

// Định nghĩa bảng màu cho light theme
private val LightColorPalette = lightColorScheme(
    primary = Green600,
    secondary = Pink600
)

@Composable
fun DessertClickerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    // Thay thế 'colors' bằng 'colorScheme' theo Material3
    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
