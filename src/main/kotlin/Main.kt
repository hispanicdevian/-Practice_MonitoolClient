import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

/*
// to start in full screen mode
fun main() {
    application {
        val windowState = rememberWindowState(size = DpSize.Unspecified)
        Window(onCloseRequest = ::exitApplication, state = windowState) {
            mainScreen()
        }
    }
}
*/

fun main() {
    application {
        Window(onCloseRequest = ::exitApplication) {
            mainScreen()
        }
    }
}
