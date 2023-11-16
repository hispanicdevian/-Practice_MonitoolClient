import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

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
