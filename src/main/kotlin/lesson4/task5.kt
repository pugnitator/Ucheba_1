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
    } else println("Продолжение следует.")

}