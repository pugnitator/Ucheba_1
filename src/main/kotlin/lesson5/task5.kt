package lesson5

import kotlin.random.Random

fun main() {

    val winningNumber1 = Random.nextInt(1, 100)
    val winningNumber2 = Random.nextInt(1, 100)

    println("Испытайте удачу! Угадайте 2 загаданных целых числа от 1 до 100 (включительно) и выиграйте главный приз.")

    print("Введите первое число: ")
    val number1 = readln().toIntOrNull()
    print("Введите второе число: ")
    val number2 = readln().toIntOrNull()

    if (number1 == null || number2 == null) {
        println("\nОдно или несколько введённых значений не являются целыми числами, попробуйте снова.")
        return
    } else if (number1 !in 1..100 || number2 !in 1..100) {
        println("\nОдно или несколько введённых значений не принадлежат диапазону от 1 до 100, попробуйте снова.")
        return
    }

    val isNumber1Win = (number1 == winningNumber1 || number1 == winningNumber2)
    val isNumber2Win = (number2 == winningNumber1 || number2 == winningNumber2)
    val isNumbersWin = ((number1 == winningNumber1 && number2 == winningNumber2) ||
            (number1 == winningNumber2 && number2 == winningNumber1))

    if (isNumbersWin) println("\nПоздравляем! Вы выиграли главный приз!")
    else if (isNumber1Win || isNumber2Win) println("\nВы выиграли утешительный приз!")
    else println("\nНеудача! Крутите барабан!")

    println("Для победы необходимо было ввести числа $winningNumber1 и $winningNumber2.")

}



