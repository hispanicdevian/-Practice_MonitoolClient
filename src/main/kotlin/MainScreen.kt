import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_layout.*
import engine.pingEngineAPI
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive

@Composable
@Preview
fun mainScreen() {

    var ipSuccessful0 by remember { mutableStateOf(false) }
    var ipSuccessful1 by remember { mutableStateOf(false) }
    var ipSuccessful2 by remember { mutableStateOf(false) }
    var ipSuccessful3 by remember { mutableStateOf(false) }
    var ipSuccessful4 by remember { mutableStateOf(false) }
    var ipSuccessful5 by remember { mutableStateOf(false) }
    var ipSuccessful6 by remember { mutableStateOf(false) }
    var ipSuccessful7 by remember { mutableStateOf(false) }
    var ipSuccessful8 by remember { mutableStateOf(false) }
    var ipSuccessful9 by remember { mutableStateOf(false) }
    var ipSuccessful10 by remember { mutableStateOf(false) }
    var ipSuccessful11 by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        TopAppBar(
            backgroundColor = Color.DarkGray,
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
                    // add more as needed
                )

                ipSuccessful0 = results[0].await() as Boolean
                ipSuccessful1 = results[1].await() as Boolean
                ipSuccessful2 = results[2].await() as Boolean
                ipSuccessful3 = results[3].await() as Boolean
                ipSuccessful4 = results[4].await() as Boolean
                ipSuccessful5 = results[5].await() as Boolean
                ipSuccessful6 = results[6].await() as Boolean
                ipSuccessful7 = results[7].await() as Boolean
                ipSuccessful8 = results[8].await() as Boolean
                ipSuccessful9 = results[9].await() as Boolean
                ipSuccessful10 = results[10].await() as Boolean
                ipSuccessful11 = results[11].await() as Boolean
                // update more as needed

                delay(10000) // delay for 10 second
            }
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 55.dp)
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
// Box Set 1
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
                            .weight(1f, fill = false)
                            .aspectRatio(1.5f)
                            .border(BorderStroke(5.dp, Color.DarkGray))
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
// Box Set 2
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
                            .weight(1f, fill = false)
                            .aspectRatio(1.5f)
                            .border(BorderStroke(5.dp, Color.DarkGray))
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
// Box Set 3
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
                            .weight(1f, fill = false)
                            .aspectRatio(1.5f)
                            .border(BorderStroke(5.dp, Color.DarkGray))
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
// Box Set 4
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
                            .weight(1f, fill = false)
                            .aspectRatio(1.5f)
                            .border(BorderStroke(5.dp, Color.DarkGray))
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}






