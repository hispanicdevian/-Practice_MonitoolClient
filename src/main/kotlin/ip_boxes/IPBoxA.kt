package ip_boxes

import CustomGreen
import CustomRed
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import engine.EngineIPList.Companion.ipAddress0
import engine.EngineIPList.Companion.ipAddress1
import engine.EngineIPList.Companion.ipAddress2
import engine.EngineIPList.Companion.ipAddress3

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
                    .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                    .padding(5.dp)
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .background((if (pingSuccessfulList[it]) CustomGreen else CustomRed), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
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