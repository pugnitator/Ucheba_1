package lesson19

fun main() {
    val spaceShip = Spaceship("Флостон Парадайс")
    println(spaceShip.performAnAction(SpaceshipFunction.LAND))
    println(spaceShip.performAnAction(SpaceshipFunction.SHOOT_BACK))
    println(spaceShip.performAnAction(SpaceshipFunction.TAKE_OFF))
}

class Spaceship(val name: String) {
    fun performAnAction(action: SpaceshipFunction): String = action.performAction()
}

enum class SpaceshipFunction(private val funName: String) {
    TAKE_OFF("Взлететь") {
        override fun performAction(): String = TODO("Описать функцию")
    },
    LAND("Приземлиться") {
        override fun performAction() = "Приземлиться"
    },
    SHOOT_BACK("Отстреливаться от астероидов") {
        override fun performAction() = "Стрелять"
        //TODO нужна информация о доп логике
    };

    abstract fun performAction(): String
}