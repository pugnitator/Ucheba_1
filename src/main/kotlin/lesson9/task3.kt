package lesson9

fun main() {

// Порядок ингредиентов: яйца. молоко, масло сливочное
    val ingredientsForOneDish = arrayListOf(2, 50, 15)

    print("Какое количество порций приготовим: ")
    val numberOfServings = readln().toIntOrNull()
    if (numberOfServings == null) {
        println("Введено неверное значение. Попробуйте ещё раз.")
        return
    }

    val ingredientsForXDishes = ingredientsForOneDish.map { it * numberOfServings }

    println(
        "На $numberOfServings порций вам понадобятся: яиц - ${ingredientsForXDishes[0]} шт, " +
                "молока - ${ingredientsForXDishes[1]} мл, " +
                "сливочного масла - ${ingredientsForXDishes[2]}гр.)"
    )
}
