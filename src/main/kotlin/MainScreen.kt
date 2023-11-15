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

@Composable
@Preview
fun mainScreen() {

    var snmpTempResultA by remember { mutableStateOf("") }
    var snmpHumidResultA by remember { mutableStateOf("") }
    var snmpTempResultB by remember { mutableStateOf("") }
    var snmpHumidResultB by remember { mutableStateOf("") }
    var severSuccessful1 by remember { mutableStateOf(false) }
    var severSuccessful2 by remember { mutableStateOf(false) }
    var severSuccessful3 by remember { mutableStateOf(false) }
    var severSuccessful4 by remember { mutableStateOf(false) }
    var severSuccessful5 by remember { mutableStateOf(false) }
    var severSuccessful6 by remember { mutableStateOf(false) }
    var severSuccessful7 by remember { mutableStateOf(false) }
    var severSuccessful8 by remember { mutableStateOf(false) }
    var severSuccessful9 by remember { mutableStateOf(false) }
    var severSuccessful10 by remember { mutableStateOf(false) }
    var severSuccessful11 by remember { mutableStateOf(false) }
    var severSuccessful12 by remember { mutableStateOf(false) }

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
        /*
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

                severSuccessful1 = results[0].await() as Boolean
                severSuccessful2 = results[1].await() as Boolean
                severSuccessful3 = results[2].await() as Boolean
                severSuccessful4 = results[3].await() as Boolean
                severSuccessful5 = results[4].await() as Boolean
                severSuccessful6 = results[5].await() as Boolean
                severSuccessful7 = results[6].await() as Boolean
                severSuccessful8 = results[7].await() as Boolean
                severSuccessful9 = results[8].await() as Boolean
                severSuccessful10 = results[9].await() as Boolean
                severSuccessful11 = results[10].await() as Boolean
                severSuccessful12 = results[11].await() as Boolean
                // update more as needed

                delay(10000) // delay for 10 second
            }
        }
*/
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
                            .border(BorderStroke(1.dp, Color.Green))
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
                            .border(BorderStroke(1.dp, Color.Green))
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
                            .border(BorderStroke(1.dp, Color.Green))
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
                            .border(BorderStroke(1.dp, Color.Green))
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}






