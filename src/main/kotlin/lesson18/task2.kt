package lesson18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    println(dice4.getDroppedNumber())
    println(dice6.getDroppedNumber())
    println(dice8.getDroppedNumber())
}

abstract class Dice(protected val numberOfFaces: Int) {
    fun getDroppedNumber(): Int = (FIRST_NUMBER_ON_THE_DICE..numberOfFaces).random()
}

class Dice4 : Dice(numberOfFaces = 4)

class Dice6 : Dice(numberOfFaces = 6)

class Dice8 : Dice(numberOfFaces = 8)

const val FIRST_NUMBER_ON_THE_DICE = 1