package lesson15

fun main() {
    val seagull = Seagull("Пэдро", 2, "Испания")
    val carp = CrucianCarp("Геннадий", 25, "Россия")
    val duck = Duck("Икви", 4, "Грузия")

    seagull.toRise()
    seagull.toLand()
    seagull.fly()
    seagull.fall()

    println()

    carp.startSwimming()
    carp.finishSwimming()
    carp.toDive()
    carp.toSink()
    carp.toSurface()

    println()

    duck.toRise()
    duck.toLand()
    duck.fly()
    duck.fall()
    duck.startSwimming()
    duck.finishSwimming()
    duck.toDive()
    duck.toSink()
    duck.toSurface()
}

class Seagull (
    val name: String,
    val age: Int,
    val habitat: String,
) : FlyingCreature {
    override fun toRise() {
        println("Взлететь")
    }
    override fun toLand() {
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
    override fun toDive() {
        println("Погружаться")
    }
    override fun toSurface() {
        println("Всплывать")
    }
    override fun toSink() {
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
    override fun toDive() {
        println("Нырнуть")
    }
    override fun toSurface() {
        println("Вынырнуть")
    }
    override fun toSink() {
        println("Тонуть")
    }
    override fun toRise() {
        println("Взлетать с разбегом (по воде/морю)")
    }
    override fun toLand() {
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
    fun toDive()
    fun toSurface()
    fun toSink()
}

interface FlyingCreature {
    fun toRise()
    fun toLand()
    fun fly()
    fun fall()
}