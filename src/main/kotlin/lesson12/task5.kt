package lesson12

import kotlin.random.Random

fun main() {
    val weatherList = mutableListOf<WeatherProgram2>()
    for (i in 0..10) {
        val weatherProgram = WeatherProgram2((Random.nextFloat(-30.0F, 50.0F)), (Random.nextFloat(-30.0F, 50.0F)), true, (Random.nextFloat(700.0F, 800.0F )))
        weatherList.add(i, )
    }
    val weatherProgram1 = WeatherProgram2(45.4F, 10.4F, true, 740.0F)
    val weatherProgram2 = WeatherProgram2(25.7F, 19.4F, false, 755.0F)
    val weatherProgram3 = WeatherProgram2(23.7F, 11.4F, false, 758.0F)
}

class WeatherProgram2(
    val daytimeTemperature: Float,
    val nightTemperature: Float,
    val isItRain: Boolean,
    val atmosphericPressure: Float,
) {

    var averageDaytimeTemperature = Float
    var averageAtmosphericPressure = Float

    constructor(
        daytimeTemperature: Float,
        nightTemperature: Float,
        isItRain: Boolean,
        atmosphericPressure: Float,
        averageDaytimeTemperature: Float,
        averageAtmosphericPressure: Float,
        ) : this(daytimeTemperature, nightTemperature, isItRain, atmosphericPressure) {

        this.averageDaytimeTemperature = averageDaytimeTemperature

    }

    init {
        println("$daytimeTemperature, $nightTemperature, $isItRain, $atmosphericPressure.")
    }
}

fun Random.nextFloat(from: Float, until: Float): Float {
    return Random.nextDouble(from.toDouble(), until.toDouble()).toFloat()
}
const val TEMPERATURE_RANGE = (-50.0F..50.0F)