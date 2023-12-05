package lesson19

fun main() {
    val listOnPersons = mutableListOf<Person>()

    for (i in 0 until NUMBER_OF_PEOPLE_TO_PRINT) {
        print("Заполните данные о себе. \nВведите имя: ")
        val person = Person(readln())

        println("Укажите пол, выбрав один из вариантов:")
        for (i in Sex.values()) println(i.getSexName())
        person.setSex()

        listOnPersons.add(person)
    }

    listOnPersons.forEach { println("Имя: ${it.getName()}, пол: ${it.getSex()} ") }
}

class Person(
    private val name: String,
    private var sex: Sex = Sex.IS_EMPTY,
) {
    fun setSex() {
        var inputSex: Sex
        do {
            inputSex = when (readln().lowercase()) {
                Sex.MALE.getSexName().lowercase() -> Sex.MALE
                Sex.FEMALE.getSexName().lowercase() -> Sex.FEMALE
                else -> {
                    println("Повторите попытку.")
                    Sex.IS_EMPTY
                }
            }
        } while (inputSex == Sex.IS_EMPTY)
        sex = inputSex
    }

    fun getName() = name
    fun getSex() = sex.getSexName()
}

enum class Sex(private val sexName: String) {
    IS_EMPTY("Не указано"),
    MALE("Мужчина"),
    FEMALE("Женщина");

    fun getSexName() = sexName
}

const val NUMBER_OF_PEOPLE_TO_PRINT = 5