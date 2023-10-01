package lesson12

fun main() {

    val weatherProgram1 =
        WeatherProgram().createWeatherProgram(45.4F, 10.4F, true, 740)
    val weatherProgram2 =
        WeatherProgram().createWeatherProgram(25.7F, 19.4F, false, 755)
}
class WeatherProgram() {
    var daytimeTemperature = 0.0F
    var nightTemperature = 0.0F
    var isItRain = false
    var atmosphericPressure = 760

    fun createWeatherProgram(
        inputDaytimeTemperature: Float,
        inputNightTemperature: Float,
        inputIsItRain: Boolean,
        inputAtmosphericPressure: Int
    ): WeatherProgram {
        val weatherProgram = WeatherProgram()
        weatherProgram.daytimeTemperature = inputDaytimeTemperature
        weatherProgram.nightTemperature = inputNightTemperature
        weatherProgram.isItRain = inputIsItRain
        weatherProgram.atmosphericPressure = inputAtmosphericPressure

        println("${weatherProgram.daytimeTemperature}, ${weatherProgram.nightTemperature}, ${weatherProgram.isItRain}, " +
                "${weatherProgram.atmosphericPressure}")

        return weatherProgram
    }
}