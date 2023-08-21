package lesson4

fun main() {

    print("Введите вес груза в кг: ")
    val cargoWeight = readln().toInt()

    print("Введите объем груза в литрах: ")
    val cargoVolume = readln().toInt()

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории \"Average\": " +
                "${AVERAGE_MIN_WEIGHT <= cargoWeight && cargoWeight <= AVERAGE_MAX_WEIGHT && cargoVolume < AVERAGE_VOLUME}"
    )
}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_VOLUME = 100