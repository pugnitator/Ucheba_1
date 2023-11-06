package lesson15

import java.util.*


class WeatherServer(
    val listOfTemperature: MutableList<Temperature>,

    ) {
    fun sendTemperatureMassage(temperature: Temperature) {
        return println("Дата: ${temperature.date}, температура: ${temperature.temperature}")
    }

    fun sendPrecipitationAmountMassage (precipitationAmount: PrecipitationAmount) {
        return println("Дата: ${precipitationAmount.date}, температура: ${precipitationAmount.precipitationAmount}")
    }

    fun sendToTheServer (data: Any) {



        if (data == Temperature) {

        } else if (data == PrecipitationAmount) {

        }else println("Ошибка отправки.")
    }
}

abstract class WeatherStationStats(val type: String)
class Temperature(
    type: String = "Температура",
    val date: Date,
    val temperature: Float,
) : WeatherStationStats(type)

class PrecipitationAmount(
    type: String = "Количество осадков",
    val date : Date,
    val precipitationAmount: Float,
) : WeatherStationStats (type)
