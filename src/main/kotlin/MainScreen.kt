import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_layout.IPBoxes.ipBoxA
import custom_layout.IPBoxes.ipBoxB
import custom_layout.IPBoxes.ipBoxC
import custom_layout.IPBoxes.ipBoxD
import custom_res.ErgoGray
import custom_res.Purple40
import engine.pingEngineAPI
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive

@Composable
@Preview
fun mainScreen() {
// Go to /SettingScreen.kt for IP Variables
    var pingSuccessful0 by remember { mutableStateOf(false) }
    var pingSuccessful1 by remember { mutableStateOf(false) }
    var pingSuccessful2 by remember { mutableStateOf(false) }
    var pingSuccessful3 by remember { mutableStateOf(false) }
    var pingSuccessful4 by remember { mutableStateOf(false) }
    var pingSuccessful5 by remember { mutableStateOf(false) }
    var pingSuccessful6 by remember { mutableStateOf(false) }
    var pingSuccessful7 by remember { mutableStateOf(false) }
    var pingSuccessful8 by remember { mutableStateOf(false) }
    var pingSuccessful9 by remember { mutableStateOf(false) }
    var pingSuccessful10 by remember { mutableStateOf(false) }
    var pingSuccessful11 by remember { mutableStateOf(false) }

// Full Container Box
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ErgoGray)
    ) {
        TopAppBar(
            backgroundColor = Purple40,
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
        ) {
            Text(
                "Monitool Client",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
            )
        }

// Settings Button
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 15.dp, end = 15.dp),
        ) {
            // Box in the top-right corner
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(bounded = false, radius = 20.dp),
                        onClick = {  }
                    )
            ) {
                Image(
                    painter = painterResource("SettingsPng240F.png"),
                    contentDescription = "Sample",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

// Coroutine Call to App Engines
        LaunchedEffect(Unit) {
            while (isActive) {
                val results = listOf(

                    async { pingEngineAPI(ipAddress0) },
                    async { pingEngineAPI(ipAddress1) },
                    async { pingEngineAPI(ipAddress2) },
                    async { pingEngineAPI(ipAddress3) },
                    async { pingEngineAPI(ipAddress4) },
                    async { pingEngineAPI(ipAddress5) },
                    async { pingEngineAPI(ipAddress6) },
                    async { pingEngineAPI(ipAddress7) },
                    async { pingEngineAPI(ipAddress8) },
                    async { pingEngineAPI(ipAddress9) },
                    async { pingEngineAPI(ipAddress10) },
                    async { pingEngineAPI(ipAddress11) }
                    // Add as needed
                )

// Engine Request Results
                pingSuccessful0 = results[0].await()
                pingSuccessful1 = results[1].await()
                pingSuccessful2 = results[2].await()
                pingSuccessful3 = results[3].await()
                pingSuccessful4 = results[4].await()
                pingSuccessful5 = results[5].await()
                pingSuccessful6 = results[6].await()
                pingSuccessful7 = results[7].await()
                pingSuccessful8 = results[8].await()
                pingSuccessful9 = results[9].await()
                pingSuccessful10 = results[10].await()
                pingSuccessful11 = results[11].await()
                // Add as needed

                delay(10000) // this is in ms, delay for 10 second
            }
        }

// Row Container for Columns of Light Changing Boxes
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 55.dp)
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
// Box Set A
            ipBoxA(pingSuccessful0, pingSuccessful1, pingSuccessful2, pingSuccessful3)
            Spacer(modifier = Modifier.width(20.dp))
// Box Set B
            ipBoxB(pingSuccessful4, pingSuccessful5, pingSuccessful6, pingSuccessful7)
            Spacer(modifier = Modifier.width(20.dp))
// Box Set C
            ipBoxC(pingSuccessful8, pingSuccessful9, pingSuccessful10, pingSuccessful11)
            Spacer(modifier = Modifier.width(20.dp))
// Box Set D
            ipBoxD()
        }
    }
}