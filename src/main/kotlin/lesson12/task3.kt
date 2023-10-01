package lesson12

fun main() {
    val weatherProgram1 = WeatherProgram2(45.4F, 10.4F, true, 740)
    val weatherProgram2 = WeatherProgram2(25.7F, 19.4F, false, 755)
    val weatherProgram3 = WeatherProgram2(23.7F, 11.4F, false, 758)
}
class WeatherProgram2(
    daytimeTemperature: Float = 0.0F,
    nightTemperature: Float = 0.0F,
    isItRain: Boolean = false,
    atmosphericPressure: Int = 760,
) {
    init {
        println("$daytimeTemperature, $nightTemperature, $isItRain, $atmosphericPressure.")
    }
}