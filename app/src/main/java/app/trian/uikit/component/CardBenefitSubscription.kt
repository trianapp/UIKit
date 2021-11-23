package app.trian.uikit.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.uikit.R
import app.trian.uikit.ui.theme.MyUiKitTheme

/*
* Card Benefits Subscription
* Created at 23/11/21 19.34
* Created by Trian Damai
*/

@Composable
fun CardBenefitSubscription(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(vertical = 6.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colors.surface)
    ) {
        Column(
            modifier = modifier
                .background(Color.Transparent)
                .padding(vertical = 16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Unlock Monumental Habits",
                modifier=modifier.fillMaxWidth().padding(horizontal = 16.dp),
                textAlign = TextAlign.Center,
                color=MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h6
            )
            Spacer(modifier = modifier.height(16.dp))
            Divider()
// =============
            Spacer(modifier = modifier.height(8.dp))
            Row(
                modifier = modifier
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
               Box(
                   modifier = modifier
                       .size(30.dp)
                       .padding(all = 4.dp)
                       .clip(CircleShape)
                       .background(MaterialTheme.colors.primary),
                   contentAlignment = Alignment.Center
               ) {
                   Image(painter = painterResource(id = R.drawable.ic_checklis_benefit), contentDescription = "Checklist")
               }
                Spacer(modifier = modifier.width(16.dp))
                Text(
                    text = "Unlimited habits",
                    style = MaterialTheme.typography.subtitle2,
                    color = MaterialTheme.colors.onSurface
                )
            }
            Spacer(modifier = modifier.height(8.dp))
            Divider()
//  ================
            Spacer(modifier = modifier.height(8.dp))
            Row(
                modifier = modifier
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = modifier
                        .size(30.dp)
                        .padding(all = 4.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.primary),
                    contentAlignment = Alignment.Center
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_checklis_benefit), contentDescription = "Checklist")
                }
                Spacer(modifier = modifier.width(16.dp))
                Text(
                    text = "Access to all courses",
                    style = MaterialTheme.typography.subtitle2,
                    color = MaterialTheme.colors.onSurface
                )
            }
            Spacer(modifier = modifier.height(8.dp))
            Divider()
//  ==============
            Spacer(modifier = modifier.height(8.dp))
            Row(
                modifier = modifier
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = modifier
                        .size(30.dp)
                        .padding(all = 4.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.primary),
                    contentAlignment = Alignment.Center
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_checklis_benefit), contentDescription = "Checklist")
                }
                Spacer(modifier = modifier.width(16.dp))
                Text(
                    text = "Access to all avatar illustrations",
                    style = MaterialTheme.typography.subtitle2,
                    color = MaterialTheme.colors.onSurface
                )
            }

        }

    }
}


@Preview(
    name = "preview Benefit Subs light mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "preview Benefit Subs light small",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 400
)
@Preview(
    name = "preview Benefit Subs light large",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 600
)
@Composable
fun PreviewBenefitSubs() {
    MyUiKitTheme {
        CardBenefitSubscription()
    }
}