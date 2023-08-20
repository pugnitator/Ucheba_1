package lesson4

fun main() {

    val sunnyWeather = true
    val awningIsOpen = true
    val airHumidity = 20
    val season = "зима"

    val conditionsAreFavorable =
        sunnyWeather && awningIsOpen && (airHumidity == constAirHumidity) && (season == constSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsAreFavorable")

}

const val constAirHumidity = 20
const val constSeason = "лето"