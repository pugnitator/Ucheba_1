package lesson17

fun main() {
    val ship1 = Ship(30, "Кронштадт")
    ship1.name = "Тополь"
    println(ship1.name)
}

class Ship(
    val averageSpeed: Int,
    val homePort: String,
) {
    var name = "Аврора"
        set(value) {
            println("Изменить имя корабля невозможно")
        }
}