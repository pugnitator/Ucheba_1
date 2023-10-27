package lesson14

fun main() {
    val satelliteSabina = Satellite("Сабина", true, false)
    val satelliteTitus = Satellite("Титус", true, false)
    val planetTerminus = Planet("Терминус", true, true, mutableListOf(satelliteTitus, satelliteSabina))

    println(planetTerminus.getPlanetInfo())
}

abstract class CelestialBody(
    val name: String,
    val isThereAnAtmosphere: Boolean,
    val isItSuitableForDisembarkation: Boolean,
)

class Satellite(
    name: String,
    isThereAnAtmosphere: Boolean,
    isItSuitableForDisembarkation: Boolean,
) : CelestialBody(name, isThereAnAtmosphere, isItSuitableForDisembarkation)

class Planet(
    name: String,
    isThereAnAtmosphere: Boolean,
    isItSuitableForDisembarkation: Boolean,
    val listOfSatellites: MutableList<Satellite>? = null,
    val numberOfSatellite: Int = listOfSatellites?.size ?: 0,
) : CelestialBody(name, isThereAnAtmosphere, isItSuitableForDisembarkation) {

    fun getPlanetInfo(): String {
        return "Название планеты: $name\nСписок спутников: ${listOfSatellites?.joinToString { it.name } ?: "нет спутников"}"
    }
}