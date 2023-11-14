package lesson15

fun main() {

    val passengerCar = PassengerCar("volvo", 3, 0)
    val numberOfPeopleToTransport = 6
    passengerCar.transportPassengers(numberOfPeopleToTransport, passengerCar.maxNumberOfPassengers)



//    val truck = Truck("Камаз", 1, 1, 1, 2.0f)
//    truck.loadPassengers(1)
//    truck.startDrive()
//    truck.stopDrive()
//    truck.loadCargo(2.0f)
//    truck.startDrive()
//    truck.transportCargo("Внуково", "Калуга")
//    truck.stopDrive()
//    truck.unloadCargo(2.0f)

}

abstract class Car(
    val model: String,
    val maxNumberOfPassengers: Int,
    var currentNumberOfPassengers: Int,
) : FunctionsForAllCar

class PassengerCar(
    model: String,
    maxNumberOfPassengers: Int,
    currentNumberOfPassengers: Int,
) : Car(model, maxNumberOfPassengers, currentNumberOfPassengers)


class Truck(
    model: String,
    maxNumberOfPassengers: Int,
    currentNumberOfPassengers: Int,
    val maxLoadCapacity: Float,
    var currentCargoAmount: Float = 0.00f,
) : Car(model, maxNumberOfPassengers, currentNumberOfPassengers), ActionsWithCargo

interface FunctionsForAllCar {
    fun startDrive() {
        println("Начать движение.")
    }

    fun stopDrive() {
        println("Прекратить движение.")
    }

    fun loadPassengers(numberOfPeople: Int, maxNumberOfPeople: Int): Int {
        var numberOfLoadPeople = 0
        if (numberOfPeople > maxNumberOfPeople) numberOfLoadPeople = maxNumberOfPeople
        else numberOfLoadPeople = numberOfPeople
        println("Произведена посадка $numberOfLoadPeople пассажира(ов)")
        return numberOfLoadPeople
    }

    fun unloadPassengers() {
        println("Из автомобиля вышли пассажиры.")
    }

    fun transportPassengers(numberOfPeopleToTransport: Int, maxLoadCapacity: Int) {
        var undeliveredPeople = numberOfPeopleToTransport
        var peopleOnTheTrip = 0
        var tripNumber = 1
        do {
            println("Поездка $tripNumber")
            peopleOnTheTrip = loadPassengers(undeliveredPeople, maxLoadCapacity)
            startDrive()
            stopDrive()
            unloadPassengers()
            undeliveredPeople -= peopleOnTheTrip
            tripNumber += 1
            println()
        } while (undeliveredPeople > 0)
    }
}

interface ActionsWithCargo {
    fun loadCargo(cargoWeight: Float, maxLoadCapacity: Float): Float {
        var quantityOfLoadCargo = 0.0f
        if (cargoWeight > maxLoadCapacity) quantityOfLoadCargo = maxLoadCapacity
        else quantityOfLoadCargo = cargoWeight
        println("Произведена посадка $quantityOfLoadCargo пассажира(ов)")
        return quantityOfLoadCargo
    }

    fun unloadCargo() {
        println("Выгрузить груз")
    }

    fun transportCargo(quantityOfCargoToTransport: Float, maxLoadCapacity: Float) :  {
        var undeliveredCargo = quantityOfCargoToTransport
        var cargoOnTheTrip = 0.0f
        var tripNumber = 1
        do {
            println("Поездка $tripNumber")
            cargoOnTheTrip = loadCargo(undeliveredCargo, maxLoadCapacity)
            unloadCargo()
            undeliveredCargo -= cargoOnTheTrip
            tripNumber += 1
            println()
        } while (undeliveredCargo > 0)
}