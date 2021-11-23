package app.trian.uikit.pages

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import app.trian.uikit.R
import app.trian.uikit.ui.theme.MyUiKitTheme
import kotlinx.coroutines.CoroutineScope

/*
* Page reset password
* Created at 23/11/21 20.57
* Created by Trian Damai
*/

@Composable
fun PageResetPassword(
    modifier: Modifier = Modifier,
    navigation: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) {
    var email by remember {
        mutableStateOf("triandamai@gmail.com")
    }
    Scaffold(
        topBar = {
                 TopAppBar(
                     elevation=0.dp,
                     backgroundColor = MaterialTheme.colors.background.copy(alpha=0.4f),
                     navigationIcon = {

                    },
                     title = {

                     }
                 )
        },
        backgroundColor = MaterialTheme.colors.background.copy(alpha=0.4f),
    ) {
        Column(
            modifier=modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = modifier.height(30.dp))
            Text(
                text = "FORGOT YOUR PASSWORD",
                style=MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onBackground
            )
            Spacer(modifier = modifier.height(40.dp))
            Image(
                painter = painterResource(id = R.drawable.bg_reset_password),
                contentDescription ="Bg Reset Password" ,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = modifier.height(40.dp))
//  ==========
            Box(
                modifier = modifier
                    .padding(all = 16.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colors.surface)

            ) {
                Column(
                    modifier = modifier
                        .padding(all = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = "Enter your registered email below to receive password reset instruction",
                        textAlign= TextAlign.Center,
                        color=MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.body2
                    )
                    Spacer(modifier = modifier.height(40.dp))
                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = email,
                        textStyle=MaterialTheme.typography.body2,
                        colors = TextFieldDefaults.textFieldColors(
                            textColor=MaterialTheme.colors.primary.copy(alpha = 0.8f),
                            backgroundColor = MaterialTheme.colors.background.copy(0.4f),
                            cursorColor = Color.Black,
                            disabledLabelColor = MaterialTheme.colors.background,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        onValueChange = {

                        },
                        shape = RoundedCornerShape(8.dp),
                        singleLine = true
                    )
                    Spacer(modifier = modifier.height(10.dp))
                    Button(
                        modifier = modifier.fillMaxWidth().height(50.dp).clip(RoundedCornerShape(12.dp)),
                        elevation = ButtonDefaults.elevation(
                            defaultElevation = 0.1.dp
                        ),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = "Send Reset Link",
                            color = MaterialTheme.colors.onSurface
                        )
                    }
                }
            }
//  ===========
            Spacer(modifier = modifier.height(30.dp))
            Row {
                Text(
                    text = "Remember password?",
                    style=MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.onBackground
                )
                Text(
                    text = "Login",
                    style=MaterialTheme.typography.caption.copy(
                        fontWeight = FontWeight.SemiBold
                    ),
                    color = MaterialTheme.colors.onBackground
                )
            }
        }
    }
}

@Preview(
    name = "preview PageResetPassword light mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showSystemUi = true,
    showBackground = true,
    apiLevel = 29
)
@Composable
fun PreviewPageResetPassword() {
    MyUiKitTheme {
        PageResetPassword()
    }
}