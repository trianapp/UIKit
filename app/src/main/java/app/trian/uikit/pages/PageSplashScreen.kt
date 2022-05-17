package app.trian.uikit.pages

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import app.trian.uikit.R
import app.trian.uikit.ui.theme.MyUiKitTheme
import kotlinx.coroutines.CoroutineScope

/*
* Page splash screen
* Created at 04/12/21 16.58
* Created by Trian Damai
*/

@Composable
fun PageSplashScreen(
    modifier: Modifier = Modifier,
    navigation: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) {
    Scaffold {
        Box(modifier = modifier.fillMaxSize()){
            Image(
                modifier=modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.bg_splashscreen),
                contentDescription = ""
            )
        }
    }

}

@Preview(
    name = "preview SplashScreen light mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "preview SplashScreen light small",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 400
)
@Preview(
    name = "preview SplashScreen light large",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 600
)
@Composable
fun PreviewSplashScreen() {
    MyUiKitTheme {
        PageSplashScreen()
    }
}