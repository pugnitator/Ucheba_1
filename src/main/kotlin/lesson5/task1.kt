package lesson5

fun main() {

    val number1 = 8
    val number2 = 3
    val captchaRightAnswer = number1 + number2

    print("Решите уровнение: $number1 + $number2. Ответ (введите целое число): ")
    val enteredValue = readln().toIntOrNull()

    if (enteredValue == null) println("Вы ввели не целое число, начните заново.")
    else if (enteredValue == captchaRightAnswer) println("Добро пожаловать!")
    else println("Доступ запрещён.")

}