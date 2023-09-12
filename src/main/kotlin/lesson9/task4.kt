package lesson9

fun main() {
    print("Введите 5 ингредиентов через запятую без пробелов: ")
    val fiveIngredients = readln().lowercase().split(',').toMutableList()

    if (fiveIngredients.size != 5) {
        println("Нужно ввести 5 ингредиентов. Попробуйте снова.")
        return
    }

    fiveIngredients.sort()
    println(fiveIngredients)
}