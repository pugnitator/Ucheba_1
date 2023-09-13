package lesson9

fun main() {

    val listOfIngredients = sortedSetOf<String>()
    var countOfIngredients = 1
    val numberOfIngredients = 5

    while (listOfIngredients.size < numberOfIngredients) {
        println("Введите название ингредиента $countOfIngredients: ")
        val ingredient = readln().toString().lowercase()
        if (!listOfIngredients.contains<Any>(ingredient)) {
            listOfIngredients.add(ingredient)
            countOfIngredients += 1
        } else println("Вы ввели ингредиент, который уже содержится в списке, он не будет записан.")
    }

    println("${listOfIngredients.joinToString().replaceFirstChar { it.uppercaseChar() }}.")

}





