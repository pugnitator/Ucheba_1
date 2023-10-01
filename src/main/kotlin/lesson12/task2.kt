package lesson12

fun main() {
    val weatherProgram1 = WeatherProgram1(45.4F, 10.4F, true, 740)
    val weatherProgram2 = WeatherProgram1(25.7F, 19.4F, false, 755)
    val weatherProgram3 = WeatherProgram1(31.3F, 14.8F, false, 765)
}

class WeatherProgram1(
    daytimeTemperature: Float = 0.0F,
    nightTemperature: Float = 0.0F,
    isItRain: Boolean = false,
    atmosphericPressure: Int = 0,
) {
    init {
        println("$daytimeTemperature, $nightTemperature, $isItRain, $atmosphericPressure.")
    }
}