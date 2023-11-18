package views

import ErgoGray
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import setting_boxes.settingBoxA
import setting_boxes.settingBoxB
import setting_boxes.settingBoxC
import setting_boxes.settingBoxD

@Composable
@Preview
fun settingScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp)
            .background(ErgoGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(12.dp))
// Box Set A
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxA()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set B
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxB()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set C
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxC()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set D
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxD()
            }
        }
    }
}