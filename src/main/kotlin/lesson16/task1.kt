package lesson16

fun main() {
    val dice = Dice()
    println("На кубике выпало ${dice.getValueOnTheDice()}")
}

class Dice(
    private val valueOnTheDice: Int = (1..6).random(),
) {
    fun getValueOnTheDice() = valueOnTheDice
}