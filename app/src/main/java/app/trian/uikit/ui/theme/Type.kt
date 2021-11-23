package app.trian.uikit.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import app.trian.uikit.R

val fontHeading = FontFamily(
    Font(R.font.klasik_regular, FontWeight.Bold),
    Font(R.font.klasik_regular, FontWeight.SemiBold),
    Font(R.font.klasik_regular, FontWeight.Normal),
    Font(R.font.klasik_regular, FontWeight.Medium),
    Font(R.font.klasik_regular, FontWeight.Light),
    Font(R.font.klasik_regular, FontWeight.Thin),
)

val fontBody = FontFamily(
    Font(R.font.menrope_bold,FontWeight.Bold),
    Font(R.font.menrope_semibold,FontWeight.SemiBold),
    Font(R.font.menrope_regular,FontWeight.Normal),
    Font(R.font.menrope_medium,FontWeight.Medium),
    Font(R.font.menrope_light,FontWeight.Light),
    Font(R.font.menrope_thin,FontWeight.Thin),
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Light,
        letterSpacing = (-1.5).sp,
        fontSize = 96.sp
    ),
    h2 = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Light,
        letterSpacing = (0.5).sp,
        fontSize = 60.sp
    ),
    h3 = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 48.sp
    ),
    h4 = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Normal,
        letterSpacing = (0.25).sp,
        fontSize = 34.sp
    ),
    h5 = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.15.sp,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = fontBody,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.15.sp,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = fontBody,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.15.sp,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = fontBody,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.5.sp,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = fontBody,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.25.sp,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.W500,
        letterSpacing = 1.25.sp,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = fontBody,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.4.sp,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = fontHeading,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.5.sp,
        fontSize = 10.sp
    )

)