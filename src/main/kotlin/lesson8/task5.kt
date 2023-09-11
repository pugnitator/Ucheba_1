package lesson8

fun main() {

    print("Введите кол-во ингредиентов в блюде: ")
    val countOfIngredients = readln().toIntOrNull()
    if (countOfIngredients == null) {
        println("Введено неверное значение. Попробуйте заново.")
        return
    }
//    for (i in 0 until countOfIngredients) {
    print("Введите названия ингредиентов: ")
    val ingredientsForTheDish = Array(countOfIngredients) { readln() }
    println(ingredientsForTheDish.size)

    println("\nСоздан рецепт из $countOfIngredients ингредиентов: ")
    for (i in ingredientsForTheDish) println(i)

}