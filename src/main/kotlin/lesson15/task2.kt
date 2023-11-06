package lesson15

import java.util.*

fun main() {
    val temperature1 = Temperature(, Date(2023,11, 11), 10.12f )
    val precipitationAmount = PrecipitationAmount ("Температура", Date(2023,11, 11), 10.12f )
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
    type: String,
    val date: Date,
    val temperature: Float,
) : WeatherStationStats(type = "Температура") {
    override fun getInfo() {
        return println("Дата: $date, температура: $temperature")
    }
}

class PrecipitationAmount(
    type: String,
    val date: Date,
    val precipitationAmount: Float,
) : WeatherStationStats(type = "Температура") {
    override fun getInfo() {
        return println("Дата: $date, температура: $precipitationAmount")
    }
}
