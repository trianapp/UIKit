package app.trian.uikit.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable



private val LightColorPalette = lightColors(
    background = Background,
    onBackground = onBackground,
    primary = Primary,
    primaryVariant = PrimaryVariant,
    surface= Surface,
    onSurface = onSurface,
    secondary = Secondary,
    secondaryVariant = SecondaryVariant
)

@Composable
fun MyUiKitTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = LightColorPalette
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}