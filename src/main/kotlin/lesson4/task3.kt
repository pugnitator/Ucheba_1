package lesson4

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "зима"

    val conditionsAreFavorable =
        isSunny && isAwningOpen && (airHumidity == CONST_AIR_HUMIDITY) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsAreFavorable")

}

const val CONST_AIR_HUMIDITY = 20