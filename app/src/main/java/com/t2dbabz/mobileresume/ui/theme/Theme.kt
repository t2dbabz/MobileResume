package com.t2dbabz.mobileresume.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = MarineBlue,
    primaryVariant = Purple700,
    secondary = Teal200,
    onPrimary = Cultured,
    onBackground = Cultured,
    onSurface = DavysGrey
)

private val LightColorPalette = lightColors(
    primary = Cultured,
    primaryVariant = Purple700,
    secondary = Teal200,
    onPrimary = ErrieBlack,
    background = Cultured,
    onBackground = ErrieBlack,
    onSurface = DavysGrey


    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MobileResumeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}