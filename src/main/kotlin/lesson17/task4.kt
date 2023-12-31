package lesson17

fun main() {
    val package1 = Package(123, "Склад поставщика")

    package1.moveCargo("Распределительный центр")
    println(package1.getPackageInfo())

    println()

    package1.moveCargo("Пункт выдачи")
    println(package1.getPackageInfo())
}

class Package(
    private val packageNumber: Int,
    currentLocation: String,
) {
    private var numberOfMovements: Int = 0
    private var currentLocation = currentLocation
        set(value) {
            field = value
            numberOfMovements += 1
        }

    fun moveCargo(distributionPointAddress: String) {
        currentLocation = distributionPointAddress
    }

    fun getPackageInfo() = """
        Номер посылки: $packageNumber
        Местонахождение: $currentLocation
        Общее кол-во перемещений:$numberOfMovements
    """.trimIndent()
}