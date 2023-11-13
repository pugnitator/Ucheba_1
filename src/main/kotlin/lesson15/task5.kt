package lesson15

fun main() {

    val passengerCar = PassengerCar("volvo", 3, )

}

abstract class Car(
    val model: String,
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    var currentNumberOfPassengers: Int = 0,
) : FunctionsForAllCar

class Truck(
    model: String,
    maxNumberOfPassengers: Int,
    minNumberOfPassengers: Int = 1,
    currentNumberOfPassengers: Int,
) : Car(model, maxNumberOfPassengers, minNumberOfPassengers = 1, currentNumberOfPassengers = 0,)

class PassengerCar(
    model: String,
    maxNumberOfPassengers: Int,
    minNumberOfPassengers: Int,
    currentNumberOfPassengers: Int,
    val maxLoadCapacity: Float,
    var currentCargoAmount: Float = 0.00f,
) : Car(model, maxNumberOfPassengers, minNumberOfPassengers = 1, currentNumberOfPassengers = 0,)

interface FunctionsForAllCar {
    fun startDrive() {
        println("Начать движение.")
    }

    fun stopDrive() {
        println("Прекратить движение.")
    }

    fun loadPassengers(numberOfPeople: Int) {
        println("В автомобиль сели $numberOfPeople человек(а)")
    }

    fun unloadPassengers(numberOfPeople: Int) {
        println("Из автомобиля вышли $numberOfPeople человек(а)")
    }

    fun transportPassengers(pointA: String, pointB: String) {
        println("Забрать пассажиров по адресу $pointA и привезти по адресу $pointB")
    }
}

interface ActionsWithCargo {
    fun loadCargo(cargoWeight: Float) {
        println("Загрузить груз весом $cargoWeight")
    }

    fun unloadCargo(cargoWeight: Float) {
        println("Выгрузить груз весом $cargoWeight")
    }

    fun transportCargo(pointA: String, pointB: String) {
        println("Забрать груз по адресу $pointA и привезти по адресу $pointB")
    }
}