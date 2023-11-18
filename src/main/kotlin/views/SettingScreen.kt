package views

import ErgoGray
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val ipAddress0 = "8.8.8.8"
val ipAddress1 = "192.168.100.6"
val ipAddress2 = "192.168.100.7"
val ipAddress3 = "192.168.232.254"
val ipAddress4 = "192.168.232.59"
val ipAddress5 = "archlinux.org"
val ipAddress6 = "debian.org"
val ipAddress7 = "fedoraproject.org"
val ipAddress8 = "google.com"
val ipAddress9 = "ubuntu.com"
val ipAddress10 = "linuxmint.com"
val ipAddress11 = "opensuse.org"

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
                //settingBoxA()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set B
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                //settingBoxB()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set C
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                //settingBoxC()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set D
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                //settingBoxD()
            }
        }
    }
}