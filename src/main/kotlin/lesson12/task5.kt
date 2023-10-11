package lesson12

import kotlin.math.roundToInt
import kotlin.random.Random.Default.nextBoolean
import kotlin.random.Random.Default.nextDouble

fun main() {
    val weatherList = mutableListOf<WeatherProgram2>()
    var averageDaytimeTemperature = 0.00f
    var averageNightTemperature = 0.00f
    var averageAtmosphericPressure = 0.00f
    var numberOfRainyDay = 0

    for (i in 0 until 10) {
        val weatherProgram = createRandomWeatherProgram()
        weatherList.add(i, weatherProgram)
    }

    for (i in 0 until weatherList.size) {
        averageDaytimeTemperature += weatherList[i].daytimeTemperature
        averageNightTemperature += weatherList[i].nightTemperature
        averageAtmosphericPressure += weatherList[i].atmosphericPressure

        if (weatherList[i].isItRain) numberOfRainyDay += 1
        else continue
    }
    averageDaytimeTemperature = calculateTheAverageValue(averageDaytimeTemperature, weatherList.size)
    averageNightTemperature = calculateTheAverageValue(averageNightTemperature, weatherList.size)
    averageAtmosphericPressure = calculateTheAverageValue(averageAtmosphericPressure, weatherList.size)

    println("""
        Средняя температура днём: $averageDaytimeTemperature
        Средняя температура ночью: $averageNightTemperature
        Среднее атмосферное давление: $averageAtmosphericPressure
        Количество дождливых дней: $numberOfRainyDay из ${weatherList.size}
    """.trimIndent())
}

class WeatherProgram2(
    val daytimeTemperature: Float,
    val nightTemperature: Float,
    val isItRain: Boolean,
    val atmosphericPressure: Float,
) {

    init {
        println("$daytimeTemperature, $nightTemperature, $isItRain, $atmosphericPressure.")
    }

}

fun randomFloat(from: Float, until: Float): Float {
    return nextDouble(from.toDouble(), until.toDouble()).toFloat()
}

fun roundToHundredths(variable: Float): Float {
    return ((variable * 100).roundToInt() / 100.0).toFloat()
}

fun createRandomWeatherProgram(): WeatherProgram2 {
    return WeatherProgram2(
        roundToHundredths(randomFloat(-30.0F, 50.0F)),
        roundToHundredths(randomFloat(-30.0F, 50.0F)),
        nextBoolean(),
        roundToHundredths(randomFloat(700.0F, 800.0F))
    )
}

fun calculateTheAverageValue(sumOfVariables: Float, numberOfDays: Int): Float {
    return roundToHundredths(sumOfVariables / numberOfDays)
}

