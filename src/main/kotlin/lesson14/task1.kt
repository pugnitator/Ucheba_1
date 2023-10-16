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
    speed: Float = 30.0f,
    loadCapacity: Float = 1.0f,
    capacity: Int = 50,
    val speedWhenPassingIce: Int = 20,
) : Liner(name, speed, loadCapacity, capacity) {
    fun breakTheIce() {
        println("Ломать лёд.")
    }
}

class CargoShip(
    name: String,
    speed: Float = 35.0f,
    loadCapacity: Float = 30000.0f,
    capacity: Int = 70,
) : Liner(name, speed, loadCapacity , capacity) {
    fun loadTheCargo() {
        println("Погрузить.")
    }
    fun unloadTheCargo() {
        println("Разрузить.")
    }
}