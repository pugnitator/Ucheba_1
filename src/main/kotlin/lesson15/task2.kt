package lesson15

import java.time.LocalDate

fun main() {
    val temperature1 = Temperature(LocalDate.of(2023, 11, 1), 10.12f)
    val precipitationAmount = PrecipitationAmount(LocalDate.of(2023, 11, 11), 10.12f)
    val server = WeatherServer()

    server.sendToTheServer(temperature1)
    server.sendToTheServer(precipitationAmount)
}

class WeatherServer() {
    fun sendToTheServer(data: Any) {
        when (data) {
            is Temperature -> println(data.getInfo())
            is PrecipitationAmount -> println(data.getInfo())
            else -> println("Ошибка отправки.")
        }
    }
}

abstract class WeatherStationStats(val type: String) {
    abstract fun getInfo(): String
}

class Temperature(
    val date: LocalDate,
    val temperature: Float,
) : WeatherStationStats(type = "Температура") {
    override fun getInfo(): String {
        return "Дата: $date, температура: $temperature"
    }
}

class PrecipitationAmount(
    val date: LocalDate,
    val precipitationAmount: Float,
) : WeatherStationStats(type = "Количество осадков") {

    override fun getInfo(): String {
        return "Дата: $date, количество осадков: $precipitationAmount"
    }
}

