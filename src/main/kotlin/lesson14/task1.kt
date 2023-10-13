package lesson14

fun main() {
    val liner = Liner("Титаник")
    val icebreaker = Icebreaker("Крушитель")
    val cargoShip = CargoShip("Грузовик")
}

open class Liner(
    val name: String,
    val speed: Float = 700.0f,
    val loadCapacity: Float = 30.0f,
    val capacity: Int = 3000,
) {
    fun transportPeople() {
        println("Перевозить людей.")
    }
}

class Icebreaker(
    name: String,
    val speedWhenPassingIce: Int = 20,
) : Liner(name, speed = 30.0f, loadCapacity = 1.0f, capacity = 50) {
    fun breakTheIce() {
        println("Ломать лёд.")
    }
}

class CargoShip(
    name: String,
) : Liner(name, speed = 35.0f, loadCapacity = 30000.0f, capacity = 70) {
    fun loadTheCargo() {
        println("Погрузить.")
    }
    fun unloadTheCargo() {
        println("Разрузить.")
    }
}