package lesson16

fun main() {
    val player1 = Player("Hero")
    val player2 = Player("Villain")

    player1.takeDamage(player2.getAttackDamage())
    player1.heal(5)
    player1.takeDamage(100)
}

class Player(
    val name: String,
    private var health: Int = HEALTH,
    private val attackDamage: Int = ATTACK_DAMAGE,
) {
    fun getHealth() = health
    fun getAttackDamage() = attackDamage
    fun takeDamage(damage: Int) {
        val currentHealth = health - damage
        if (currentHealth <= HEALTH_TO_DIE) {
            println("Урон от удара: $damage. Game over.")

            for (i in (1..SECONDS_TO_REVIVAL).reversed()) {
                println("До возрождения $i сек.")
                Thread.sleep(1000)
            }

            health = HEALTH
            println("Возрождение на базе. Здоровье: $health")
        } else {
            health = currentHealth
            println("Урон от удара: $damage, текущее здоровье: $health")
        }
    }

    fun heal(amountOfHeal: Int) {
        val currentHealth = health + amountOfHeal
        health = if (currentHealth > HEALTH) HEALTH
        else currentHealth
        println("Здоровье восстановлено на $amountOfHeal, текущее здоровье: $health")
    }
}


const val HEALTH = 100
const val HEALTH_TO_DIE = 0
const val ATTACK_DAMAGE = 10
const val SECONDS_TO_REVIVAL = 5