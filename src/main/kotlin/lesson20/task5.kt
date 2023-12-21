package lesson20

fun main() {
    val robot = Robot()
    robot.say()

    robot.setModifier({ phrase: String -> Unit
        println(phrase.reversed()) }(robot.listOfPhrases.random()))
    robot.say()
}

class Robot(
    val listOfPhrases: MutableList<String> = mutableListOf(
        "Одна ошибка - и ты ошибся",
        "Утро вечера мудренее",
        "Действуй, сестра",
        "Мне нужна твоя одежда, ботинки и мотоцикл",
        "Убить всех человеков"
    ),
) {
    private var modifiers: Unit = { phrase: String -> Unit
        println(phrase)
    }(listOfPhrases.random())
    fun say() = modifiers
    fun setModifier(modifier: Unit) {
        modifiers = modifier
    }
}