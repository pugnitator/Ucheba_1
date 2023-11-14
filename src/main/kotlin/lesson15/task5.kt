package lesson15

fun main() {
    val passengerCar = PassengerCar("volvo", 3,)
    val numberOfPeopleToTransport = 6
    passengerCar.transportPassengers(numberOfPeopleToTransport, passengerCar.maxNumberOfPassengers)

    val truck = Truck("Камаз", 1, 2.0f,)
    val quantityOfCargoToTransport = 2.0f
    truck.transportCargo(quantityOfCargoToTransport, truck)
}

abstract class Car(
    val model: String,
    val maxNumberOfPassengers: Int,
) : FunctionsForAllCar

class PassengerCar(
    model: String,
    maxNumberOfPassengers: Int,
) : Car(model, maxNumberOfPassengers,)


class Truck(
    model: String,
    maxNumberOfPassengers: Int,
    val maxLoadCapacity: Float,
) : Car(model, maxNumberOfPassengers,), ActionsWithCargo

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
        var peopleOnTheTrip: Int
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
        val quantityOfLoadCargo: Float
        if (cargoWeight > maxLoadCapacity) quantityOfLoadCargo = maxLoadCapacity
        else quantityOfLoadCargo = cargoWeight
        println("Загружено груза: $quantityOfLoadCargo т")
        return quantityOfLoadCargo
    }

    fun unloadCargo() {
        println("Выгрузить груз")
    }

    fun transportCargo(quantityOfCargoToTransport: Float, car: Truck) {
        var undeliveredCargo = quantityOfCargoToTransport
        var cargoOnTheTrip: Float
        var tripNumber = 1
        do {
            println("Поездка для перевоза груза $tripNumber")
            cargoOnTheTrip = loadCargo(undeliveredCargo, car.maxLoadCapacity)
            car.startDrive()
            car.stopDrive()
            unloadCargo()
            undeliveredCargo -= cargoOnTheTrip
            tripNumber += 1
            println()
        } while (undeliveredCargo > 0)
    }
}