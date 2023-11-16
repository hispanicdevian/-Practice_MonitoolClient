package engine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL

suspend fun pingEngineAPI(ip: String): Boolean = withContext(Dispatchers.IO) {
    try {
        val url = URL("http://IP Here:8080/pingMotor") // replace with your server's URL
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.outputStream.write(("ip=$ip").toByteArray(Charsets.UTF_8))
        connection.connect()

        val response = connection.inputStream.bufferedReader().use { it.readText() } // response from the server
        connection.disconnect()

        return@withContext response == "true"
    } catch (e: Exception) {
        println("Error in pingEngineAPI: ${e.message}")
        return@withContext false
    }
}