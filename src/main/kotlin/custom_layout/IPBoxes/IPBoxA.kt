package custom_layout.IPBoxes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import custom_res.ErgoGreen
import custom_res.ErgoRed
import ipAddress0
import ipAddress1
import ipAddress2
import ipAddress3

@Composable
fun ipBoxA(pingSuccessfulA: Boolean, pingSuccessfulB: Boolean, pingSuccessfulC: Boolean, pingSuccessfulD: Boolean) {

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
                    0 -> ipAddress0
                    1 -> ipAddress1
                    2 -> ipAddress2
                    3 -> ipAddress3
                    else -> {}
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}