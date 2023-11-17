package views

import Purple40
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

const val ipAddress0 = "8.8.8.8"
const val ipAddress1 = "192.168.100.6"
const val ipAddress2 = "192.168.100.7"
const val ipAddress3 = "192.168.232.254"
const val ipAddress4 = "192.168.232.59"
const val ipAddress5 = "archlinux.org"
const val ipAddress6 = "debian.org"
const val ipAddress7 = "fedoraproject.org"
const val ipAddress8 = "google.com"
const val ipAddress9 = "ubuntu.com"
const val ipAddress10 = "linuxmint.com"
const val ipAddress11 = "opensuse.org"

@Composable
@Preview
fun settingScreen() {
    Column( modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier
            .background(color = Purple40, shape = AbsoluteRoundedCornerShape(8.dp))
            .size(300.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
        }
    }

}