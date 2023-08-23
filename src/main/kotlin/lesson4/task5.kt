package lesson4

fun main() {
    print("Корабль повреждён? Введите \"true\" или \"false\": ")
    val isDamaged = readln().toBooleanStrictOrNull()

    if (isDamaged == null) {
        println("Введено неверное значение. Начните заново.")
        return
    } else print("Погода благоприятная? Введите \"true\" или \"false\": ")
    val isTheWeatherGood = readln().toBooleanStrictOrNull()

    if (isTheWeatherGood == null) {
        println("Введено неверное значение. Начните заново.")
        return
    } else print("Численность экипажа: ")
    val numberOfCrew = readln().toIntOrNull()

    if (numberOfCrew == null) {
        println("Введено неверное значение. Начните заново.")
        return
    } else print("Количество груза: ")
    val numberOfCargo = readln().toIntOrNull()

    if (numberOfCargo == null) {
        println("Введено неверное значение. Начните заново.")
        return
    } else println(
        "Может ли корабль отправится в плавание: " +
                "${
                    ((!isDamaged && numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW) || 
                            (isDamaged && numberOfCrew == NUMBER_OF_CREW_FOR_DAMAGED_SHIP)) && 
                            isTheWeatherGood && numberOfCargo > MIN_NUMBER_OF_CARGO
                }"
    )
}

const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val NUMBER_OF_CREW_FOR_DAMAGED_SHIP = 70
const val MIN_NUMBER_OF_CARGO = 50

