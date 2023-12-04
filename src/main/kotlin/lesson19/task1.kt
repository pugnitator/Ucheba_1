package lesson19

fun main() {
    for (i in Fish.values()) println(i.fishName)
}

enum class Fish(val fishName: String){
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}