package lesson20

fun main() {
    val robot = Robot()
    robot.say()

    robot.setModifier({ phrase: String -> String
        phrase.reversed() }(robot.listOfPhrases.random()))
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
    private var modifiers: String = { phrase: String -> String
        phrase
    }(listOfPhrases.random())
    fun say() = println(modifiers)
    fun setModifier(modifier: String) {
        modifiers = modifier
    }
}