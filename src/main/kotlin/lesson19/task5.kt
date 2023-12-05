package lesson19

fun main() {
    val listOnPersons = mutableListOf<Person>()

    for (i in 0 until 5) {
        print("Заполните данные о себе. \nВведите имя: ")
        val name = readln()

        println("Укажите пол, выбрав один из вариантов:")
        for (i in Sex.values()) println(i.getSexName())

        var sex = Sex.MALE
        do {
            when (readln().lowercase()) {
                Sex.MALE.getSexName().lowercase() -> sex = Sex.MALE
                Sex.FEMALE.getSexName().lowercase() -> sex = Sex.FEMALE
                else -> println("Повторите попытку.")
            }
        } while ((sex != Sex.MALE) && (sex != Sex.FEMALE))

        val person = Person(name, sex)
        println("Имя: ${person.getName()}, пол: ${person.getSex()}")
        listOnPersons.add(person)
    }

    listOnPersons.forEach { println("Имя: ${it.getName()}, пол: ${it.getSex()} ") }

}

class Person(
    private val name: String,
    private var sex: Sex,
) {
    fun getName() = name
    fun getSex() = sex.getSexName()
}

enum class Sex(private val sexName: String) {
    MALE("Мужчина"),
    FEMALE("Женщина");

    fun getSexName() = sexName
}