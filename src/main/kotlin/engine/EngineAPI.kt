package engine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL

suspend fun pingEngineAPI(ip: String): Boolean = withContext(Dispatchers.IO) {
    try {
        val url = URL("http://xxxxxxxxxx:8080/pingMotor") // Replace IP or Hostname to match the API
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.outputStream.write(("ip=$ip").toByteArray(Charsets.UTF_8))
        connection.connect()

// This Handle the Response From The API
        val response = connection.inputStream.bufferedReader().use { it.readText() }
        connection.disconnect()

        return@withContext response == "true"
    } catch (e: Exception) {
        println("Error in pingEngineAPI: ${e.message}")
        return@withContext false
    }
}