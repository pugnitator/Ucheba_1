package lesson18

fun main() {
    val fox = TamagotchiFox("Лисичка")
    val dog = TamagotchiDog("Пёсик")
    val cat = TamagotchiCat("Котик")

    fox.eat()
    fox.sleep()
    fox.play()

    dog.eat()
    dog.sleep()
    dog.play()

    cat.eat()
    cat.sleep()
    cat.play()
}

abstract class TamagotchiCreature(
    protected val name: String,
    protected val foodConsumed: String,
) {
    fun play() = println("$name - играть")
    fun sleep() = println("$name - спать")
    fun eat() = println("$name - есть $foodConsumed")
}

class TamagotchiFox(name: String) : TamagotchiCreature(name, foodConsumed = "ягоды")

class TamagotchiDog(name: String) : TamagotchiCreature(name, foodConsumed = "кости")

class TamagotchiCat(name: String) : TamagotchiCreature(name, foodConsumed = "рыбу")