package lesson21

fun main() {
    val player = Hero("ChuvachoG", 100, 60)
    println(player.isHealthy())
}

class Hero(
    private val name: String,
    val maxHealth: Int,
    var currentHealth: Int = maxHealth,
) {
    fun interact(): Boolean {
        println("Взаимодействовать с предметом?")
        return readln().lowercase() == "да"
    }
}

fun Hero.isHealthy(): Boolean = currentHealth == maxHealth