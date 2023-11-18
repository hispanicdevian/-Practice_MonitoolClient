package engine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

suspend fun pingEngineAPI(ip: String): Boolean = withContext(Dispatchers.IO) {
    try {
        val client = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI("http://xxxxxxxx/pingMotor")) // replace with your server's URL
            .POST(HttpRequest.BodyPublishers.ofString("ip=$ip"))
            .header("Content-Type", "application/x-www-form-urlencoded")
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        val responseBody = response.body()
        return@withContext responseBody == "true"
    } catch (e: IOException) {
        println("Error in pingEngineAPI: ${e.message}")
        return@withContext false
    }
}
