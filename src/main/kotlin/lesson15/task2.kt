package lesson15

import java.time.LocalDate


fun main() {
    val temperature1 = Temperature (LocalDate(), 10.12f)
    val precipitationAmount = PrecipitationAmount (LocalDate(2023,11, 11), 10.12f )
    val server = WeatherServer()

    server.sendToTheServer(temperature1)
    server.sendToTheServer(precipitationAmount)
}

class WeatherServer() {
    fun sendToTheServer(data: Any) {

        if (data is Temperature) println(data.getInfo())
        else if (data is PrecipitationAmount) println(data.getInfo())
        else println("Ошибка отправки.")
    }
}

abstract class WeatherStationStats(val type: String) {
    abstract fun getInfo()
}

class Temperature(
    val date: LocalDate,
    val temperature: Float,
) : WeatherStationStats(type = "Температура") {
    override fun getInfo() {
        return println("Дата: ${date.toString()}, температура: $temperature")
    }
}

class PrecipitationAmount(
    val date: LocalDate,
    val precipitationAmount: Float,
) : WeatherStationStats(type = "Количество осадков") {

    override fun getInfo() {
        return println("Дата: $date, количество осадков: $precipitationAmount")
    }
}
