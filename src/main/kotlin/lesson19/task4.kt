package lesson19

import lesson19.Patron.*

fun main() {
    val tank = Tank("Катюша")
    tank.shoot()

    tank.loadWeapon(BLUE)
    tank.shoot()

    tank.loadWeapon(RED)
    tank.shoot()
}

class Tank(
    private val name: String,
    private var typeOfPatrons: Patron = EMPTY,
) {
    fun loadWeapon(patron: Patron) {
        typeOfPatrons = patron
        when (typeOfPatrons) {
            EMPTY -> println("Оружие разряжено.")
            BLUE -> println("Оружие заряжено патронами с ударной силой ${BLUE.getPatronImpactForce()}")
            GREEN -> println("Оружие заряжено патронами с ударной силой ${GREEN.getPatronImpactForce()}")
            RED -> println("Оружие заряжено патронами с ударной силой ${RED.getPatronImpactForce()}")
            else -> println("Ошибка. Обратитесь в техподдержку.")
        }
    }

    fun shoot() {
        when (typeOfPatrons) {
            EMPTY -> println("Для выстрела перезарядите оружие.")
            BLUE -> println("Выстрел нанёс урон ${BLUE.getPatronImpactForce()}")
            GREEN -> println("Выстрел нанёс урон ${GREEN.getPatronImpactForce()}")
            RED -> println("Выстрел нанёс урон ${RED.getPatronImpactForce()}")
            else -> println("Ошибка. Обратитесь в техподдержку.")
        }
    }
}

enum class Patron(private val impactForce: Int) {
    EMPTY(0),
    BLUE(5),
    GREEN(10),
    RED(20);

    fun getPatronImpactForce() = impactForce
}