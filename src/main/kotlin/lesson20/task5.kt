package lesson20

class Robot(
    val listOfModifiers: MutableList<Unit> = mutableListOf(
        {phrase: String -> println(phrase.reversed())}(a),

    ),
    val listOfPhrases: MutableList<String> = mutableListOf<String>(
        "Одна ошибка - и ты ошибся",
        "Утро вечера мудренее",
        "Действуй, сестра",
        "Мне нужна твоя одежда, ботинки и мотоцикл",
        "Убить всех человеков"
    )

) {

    fun say() {

        listOfPhrases.random()

    }

    fun setModifier(modifier: Unit) : String {

    }


}