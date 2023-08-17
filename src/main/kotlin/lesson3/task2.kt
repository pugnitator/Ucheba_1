package lesson3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    var age: Byte = 20

    println("ФИО: $surname $name $patronymic, возраст: $age.")

    surname = "Сидорова"
    age = 22

    println("ФИО: $surname $name $patronymic, возраст: $age.")
}