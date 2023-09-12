package lesson9

fun main() {

    val fiveIngredients = mutableListOf<String>()
    var countOfIngredients = 1

    while (fiveIngredients.size < 5) {
        println("Введите название ингредиента $countOfIngredients: ")
        val ingredient = readln().toString().lowercase()
        if (!fiveIngredients.contains<Any>(ingredient)) {
            fiveIngredients.add(ingredient)
            countOfIngredients += 1
        } else println("Вы ввели ингредиент, который уже содержится в списке. Он не будет записан")
    }
    println(fiveIngredients)

}



