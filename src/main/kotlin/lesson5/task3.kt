package lesson5

fun main() {

    println("Испытайте удачу! Угадайте 2 загаданных целых числа от 1 до 100 (включительно) и выиграйте главный приз.")

    print("Введите первое число: ")
    val number1 = readln().toIntOrNull()
    print("Введите второе число: ")
    val number2 = readln().toIntOrNull()

    if (number1 == null || number2 == null) {
        println("Одно или несколько введённых значений не являются целыми числами, попробуйте снова.")
        return
    } else if (number1 !in 1..100 || number2 !in 1..100) {
        println("Одно или несколько введённых значений не принадлежат диапазону от 1 до 100, попробуйте снова.")
        return
    }

    val isNumber1Win = (number1 == WINNING_NUMBER_1 || number1 == WINNING_NUMBER_2)
    val isNumber2Win = (number2 == WINNING_NUMBER_1 || number2 == WINNING_NUMBER_2)
    val isNumbersWin = ((number1 == WINNING_NUMBER_1 && number2 == WINNING_NUMBER_2) ||
            (number1 == WINNING_NUMBER_2 && number2 == WINNING_NUMBER_1))

    if (isNumbersWin) println("Поздравляем! Вы выиграли главный приз!")
    else if (isNumber1Win || isNumber2Win) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Для победы необходимо было ввести числа $WINNING_NUMBER_1 и $WINNING_NUMBER_2.")

}

const val WINNING_NUMBER_1 = 32
const val WINNING_NUMBER_2 = 50