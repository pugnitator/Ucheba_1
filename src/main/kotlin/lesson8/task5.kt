package lesson8

fun main() {

    print("Введите кол-во ингредиентов в блюде: ")
    val countOfIngredients = readln().toIntOrNull()
    if (countOfIngredients == null) {
        println("Введено неверное значение. Попробуйте заново.")
        return
    }
    print("Введите названия ингредиентов:\n")
    val ingredientsForTheDish = Array(countOfIngredients) { readln() }

    println("\nСоздан рецепт из $countOfIngredients ингредиентов: ")
    for (i in ingredientsForTheDish) println("${ingredientsForTheDish.indexOf(i) + 1}. $i")

}