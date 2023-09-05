package lesson8

fun main() {

    var ingredientsForTheDish = arrayOf("0")

    print("Введите кол-во ингредиентов в блюде: ")
    val countOfIngredients = readln().toIntOrNull()
    if (countOfIngredients == null) {
        println("Введено неверное значение. Попробуйте заново.")
        return
    }

    for (i in 0 until countOfIngredients) {
        print("Введите название ингредиента ${i + 1}: ")
        val newIngredient = readln()
        if (i == 0) ingredientsForTheDish[i] = newIngredient
        else ingredientsForTheDish += newIngredient
    }

    println("\nСоздан рецепт из $countOfIngredients ингредиентов: ")
    for (i in ingredientsForTheDish) println(i)

}