package lesson14

fun main() {
    val liner = Liner1("Титаник")
    val icebreaker = Icebreaker1("Крушитель")
    val cargoShip = CargoShip1("Грузовик")

    liner.getShipInfo()
    liner.loading()
    println()

    icebreaker.getShipInfo()
    icebreaker.loading()
    println()

    cargoShip.getShipInfo()
    cargoShip.loading()
}

open class Liner1(
    val name: String,
    val speed: Float = 700.0f,
    val loadCapacity: Float = 30.0f,
    val capacity: Int = 3000,
) {
    open fun loading() {
        println("Выдвигает горизонтальный трап со шкафута.")
    }

    open fun getShipInfo() {
        println(
            """
            Название: $name
            Скорость: $speed
            Грузоподъемность: $loadCapacity
            Вместимость: $capacity  
        """.trimIndent()
        )
    }
}

class Icebreaker1(
    name: String,
    speed: Float = 30.0f,
    loadCapacity: Float = 1.0f,
    capacity: Int = 50,
    val speedWhenPassingIce: Float = 20.0f,
) : Liner1(name, speed, loadCapacity, capacity) {
    override fun loading() {
        println("Активирует погрузочный кран.")
    }

    override fun getShipInfo() {
        super.getShipInfo()
        println("Скорость при прохождении льда: $speedWhenPassingIce")
    }
}

class CargoShip1(
    name: String,
    speed: Float = 35.0f,
    loadCapacity: Float = 30000.0f,
    capacity: Int = 70,
) : Liner1(name, speed, loadCapacity, capacity) {
    override fun loading() {
        println("Открывает ворота со стороны кормы.")
    }

    fun unloadTheCargo() {
        println("Разрузить.")
    }
}