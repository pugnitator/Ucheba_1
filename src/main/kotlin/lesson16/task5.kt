package lesson16

fun main() {
    val player1 = Player("Hero")
    val player2 = Player("Villain")

    player1.takeDamage(player2.getAttackDamage())
    player1.heal(5)
    player1.takeDamage(100)
    player1.heal(100)
}

class Player(
    private val name: String,
    private var health: Int = HEALTH,
    private var attackDamage: Int = ATTACK_DAMAGE,
) {
    fun getHealth() = health

    fun getAttackDamage() = attackDamage

    fun takeDamage(damage: Int) {
        val currentHealth = health - damage
        if (currentHealth <= HEALTH_TO_DIE) println(dai())
        else {
            health = currentHealth
            println("Урон от удара: $damage, текущее здоровье: $health")
        }
    }

    fun heal(amountOfHeal: Int) {
        when (health) {
            HEALTH_TO_DIE -> {
                println("Вы мертвы, лечение вас не спасёт.")
                return
            }

            else -> {
                val currentHealth = health + amountOfHeal
                health = if (currentHealth > HEALTH) HEALTH
                else currentHealth
                println("Здоровье восстановлено на $amountOfHeal, текущее здоровье: $health")
            }
        }
    }

    private fun dai(): String {
        health = VALUE_FOR_THE_DEATH
        attackDamage = VALUE_FOR_THE_DEATH
        return "Game over. Здоровье: $health, сила удара: $attackDamage."
    }
}


const val HEALTH = 100
const val HEALTH_TO_DIE = 0
const val ATTACK_DAMAGE = 10
const val VALUE_FOR_THE_DEATH = 0