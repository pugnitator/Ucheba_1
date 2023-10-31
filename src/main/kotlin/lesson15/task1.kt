package lesson15

fun main() {
    val seagull = Seagull("Пэдро", 2, "Испания")
    val carp = CrucianCarp("Геннадий", 25, "Россия")
    val duck = Duck("Икви", 4, "Грузия")

    seagull.rise()
    seagull.land()
    seagull.fly()
    seagull.fall()

    println()

    carp.startSwimming()
    carp.finishSwimming()
    carp.dive()
    carp.sink()
    carp.surface()

    println()

    duck.rise()
    duck.land()
    duck.fly()
    duck.fall()
    duck.startSwimming()
    duck.finishSwimming()
    duck.dive()
    duck.sink()
    duck.surface()
}

class Seagull (
    val name: String,
    val age: Int,
    val habitat: String,
) : FlyingCreature {
    override fun rise() {
        println("Взлететь")
    }
    override fun land() {
        println("Приземлиться")
    }
    override fun fly() {
        println("Парить")
    }
    override fun fall() {
        println("Падать")
    }
}

class CrucianCarp (
    val name: String,
    val age: Int,
    val habitat: String,
) : SwimmingCreature {
    override fun startSwimming() {
        println("Плыть под водой в заданном направлении")
    }
    override fun finishSwimming() {
        println("Перестать плыть")
    }
    override fun dive() {
        println("Погружаться")
    }
    override fun surface() {
        println("Всплывать")
    }
    override fun sink() {
        println("Тонуть")
    }
}

class Duck (
    val name: String,
    val age: Int,
    val habitat: String,
) : FlyingCreature, SwimmingCreature {
    override fun startSwimming() {
        println("Плыть по воде в заданном направлении")
    }
    override fun finishSwimming() {
        println("Перестать плыть")
    }
    override fun dive() {
        println("Нырнуть")
    }
    override fun surface() {
        println("Вынырнуть")
    }
    override fun sink() {
        println("Тонуть")
    }
    override fun rise() {
        println("Взлетать с разбегом (по воде/морю)")
    }
    override fun land() {
        println("Приземляться (на землю/воду)")
    }
    override fun fly() {
        println("Лететь")
    }
    override fun fall() {
        println("Падать")
    }

}

interface SwimmingCreature {
    fun startSwimming()
    fun finishSwimming()
    fun dive()
    fun surface()
    fun sink()
}

interface FlyingCreature {
    fun rise()
    fun land()
    fun fly()
    fun fall()
}