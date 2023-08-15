package lesson2

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTimeInMinutes = 457

    val travelTimeInHours = travelTimeInMinutes / 60
    val remainingTravelTimeInMinutes = travelTimeInMinutes % 60

    val arrivalMinutes = (departureMinutes + remainingTravelTimeInMinutes) % 60
    val arrivalHour = ((departureHour + travelTimeInHours) + (departureMinutes + remainingTravelTimeInMinutes) / 60) % 24

    println(String.format("Время прибытия поезда: %02d:%02d", arrivalHour, arrivalMinutes))

}