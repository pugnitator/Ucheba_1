package lesson20

fun main() {
    val robot = Robot()
    robot.setModifier ({ it: String -> String
        it.reversed()
    }())
}



class Robot(
    val listOfModifiers: MutableList<(Unit)> = mutableListOf(),
    val listOfPhrases: MutableList<String> = mutableListOf(
        "Одна ошибка - и ты ошибся",
        "Утро вечера мудренее",
        "Действуй, сестра",
        "Мне нужна твоя одежда, ботинки и мотоцикл",
        "Убить всех человеков"
    ),
) {

    fun say() = println(listOfModifiers.last())
    fun setModifier(modifier: String) {listOfModifiers.add(modifier)}

}