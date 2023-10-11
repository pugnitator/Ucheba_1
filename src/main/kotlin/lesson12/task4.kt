package lesson12

fun main() {
    val weatherProgram1 = WeatherProgram3(45.4F, 10.4F, true, 740)
    val weatherProgram2 = WeatherProgram3(25.7F, 19.4F, false, 755)
    val weatherProgram3 = WeatherProgram3(23.7F, 11.4F, false, 758)
}
class WeatherProgram3(
    val daytimeTemperature: Float = 0.0F,
    val nightTemperature: Float = 0.0F,
    val isItRain: Boolean = false,
    val atmosphericPressure: Int = 760,
) {
    init {
        println("$daytimeTemperature, $nightTemperature, $isItRain, $atmosphericPressure.")
    }
}