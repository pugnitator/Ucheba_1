package lesson20

fun main() {

    val listOfObject = mutableListOf<String>("Кнопка 1", "Кнопка 2", "Кнопка 3")

    listOfObject.map {
        { webObject: String -> String
            println("Нажат элемент $webObject")
        }(it)
    }. forEach { it }

}