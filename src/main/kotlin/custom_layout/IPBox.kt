package custom_layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ipBox() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 55.dp)
            .padding(bottom = 10.dp)
            .padding(horizontal = 15.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(4) {
            Column(
                modifier = Modifier
                    .fillMaxSize(1f)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(15.dp))
                repeat(4) {
                    Box(
                        modifier = Modifier
                            .weight(1f, fill = true)
                            .aspectRatio(1.5f)
                            .border(BorderStroke(1.dp, Color.Green))
                    ) {
                        //Spacer(modifier = Modifier.height(15.dp))
                    }
                }
            }

        }
    }
}
