package custom_layout

import ErgoGray
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ipBoxD() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        repeat(4) {
            Box(
                modifier = Modifier
                    .background(color = ErgoGray, shape = AbsoluteRoundedCornerShape(8.dp))
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .border(BorderStroke(5.dp, Color.DarkGray), shape = AbsoluteRoundedCornerShape(5.dp)),
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}