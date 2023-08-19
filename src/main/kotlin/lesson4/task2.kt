package lesson4

fun main() {

    print("Введите вес груза в кг: ")
    val cargoWeight = readln().toInt()

    print("Введите объем груза в литрах: ")
    val cargoVolume = readln().toInt()

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории \"Average\": " +
                "${averageMinWeight <= cargoWeight && cargoWeight <= averageMaxWeight && cargoVolume < averageVolume}"
    )
}

const val averageMinWeight = 35
const val averageMaxWeight = 100
const val averageVolume = 100