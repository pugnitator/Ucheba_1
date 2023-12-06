package lesson20

fun main() {
    val hero = Hero("Шепард", 1000)
    hero.currentHealth -= 400
    println("Текущее здоровье: ${hero.currentHealth}");

    { isItEaten: Boolean, inputHero: Hero -> Int
        if (isItEaten == true) {
            inputHero.currentHealth = inputHero.maxHealth
            println("Здоровье восстановлено. Текущее здоровье: ${inputHero.currentHealth}")
        }
    }(hero.interact(), hero)

}

class Hero(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int = maxHealth,
) {
    fun interact(): Boolean {
        println("Взаимодействовать с предметом?")
        return readln().lowercase() == "да"
    }
}