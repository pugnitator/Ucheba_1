package lesson14

fun main() {
    val planetTerminus = Planet("Терминус", true, true)
    val satelliteSabina = Satellite("Сабина", true, false)
    val satelliteTitus = Satellite("Титус", true, false)

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
    val numberOfSatellite: Int? = listOfSatellites?.size ?: 0
) : CelestialBody(name, isThereAnAtmosphere, isItSuitableForDisembarkation) {
    fun addSatellites(satellite: Satellite): MutableList<Satellite>? {
        listOfSatellites?.add(satellite)
        return listOfSatellites
    }

    fun getCelestialBodyInfo(): String {
        return """
            Название планеты: $name
            Список спутников: 
            ${listOfSatellites?.forEach { println(it.name) }}
        """.trimIndent()
    }
}