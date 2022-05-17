package app.trian.uikit.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.trian.uikit.R
import app.trian.uikit.ui.theme.MyUiKitTheme

/*
* Card Deal Subscription
* Created at 23/11/21 20.15
* Created by Trian Damai
*/

@Composable
fun CardDealSubscription(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colors.surface),
    ) {
        //pojok kanan bawah
        Image(
            modifier=modifier.align(Alignment.BottomEnd),
            painter = painterResource(id = R.drawable.bg_deal_subscription),
            contentDescription = "Deal"
        )
        //sebelah kiri
        Column(
            modifier = modifier
                .align(Alignment.CenterStart)
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    bottom = 16.dp
                )
        ) {
            Text(
                text="60% off your upgrade",
                color=MaterialTheme.colors.primary,
                style = MaterialTheme.typography.h6
            )
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text="Expires in",
                color= MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.caption.copy(fontSize = 12.sp)
            )
            Spacer(modifier = modifier.height(10.dp))
            Row(
                modifier = modifier
            ) {
                Box(
                    modifier = modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Gray.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text="23",
                        style=MaterialTheme.typography.subtitle2,
                        color = MaterialTheme.colors.onSurface
                    )
                }
                Box(
                    modifier = modifier
                        .height(30.dp)
                        .width(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(text=":")
                }
                Box(
                    modifier = modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Gray.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text="56",
                        style=MaterialTheme.typography.subtitle2,
                        color = MaterialTheme.colors.onSurface
                    )
                }
                Box(
                    modifier = modifier
                        .height(30.dp)
                        .width(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(text=":")
                }
                Box(
                    modifier = modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Gray.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text="48",
                        style=MaterialTheme.typography.subtitle2,
                        color = MaterialTheme.colors.onSurface
                    )
                }
            }

        }

    }
}

@Preview(
    name = "preview CardDealSubs light mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "preview CardDealSubs light small",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 300
)
@Preview(
    name = "preview CardDealSubs light large",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 500
)
@Composable
fun PreviewCardDealSubs() {
    MyUiKitTheme {
        CardDealSubscription()
    }
}