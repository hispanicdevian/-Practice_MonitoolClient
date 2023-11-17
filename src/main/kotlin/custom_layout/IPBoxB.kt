package custom_layout

import ErgoGreen
import ErgoRed
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import views.ipAddress4
import views.ipAddress5
import views.ipAddress6
import views.ipAddress7

@Composable
fun ipBoxB(pingSuccessfulA: Boolean, pingSuccessfulB: Boolean, pingSuccessfulC: Boolean, pingSuccessfulD: Boolean) {

    val pingSuccessfulList = listOf(pingSuccessfulA, pingSuccessfulB, pingSuccessfulC, pingSuccessfulD)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        repeat(4) {
            Box(
                modifier = Modifier
                    .background(color = Color.DarkGray, shape = AbsoluteRoundedCornerShape(8.dp))
                    .padding(5.dp)
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .background((if (pingSuccessfulList[it]) ErgoGreen else ErgoRed), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            ) {
                when (it) {
                    0 -> ipAddress4
                    1 -> ipAddress5
                    2 -> ipAddress6
                    3 -> ipAddress7
                    else -> {}
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}