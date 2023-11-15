package lesson15

fun main() {
    val passengerCar = PassengerCar("volvo", 3)
    val numberOfPeopleToTransport = 6
    passengerCar.transportPassengers(numberOfPeopleToTransport)

    val truck = Truck("Камаз", 1, 2.0f)
    val quantityOfCargoToTransport = 2.0f
    truck.transportCargo(quantityOfCargoToTransport)
}

abstract class Car(
    val model: String,
    val maxNumberOfPassengers: Int,
) : Movable, PassengerCarrier {
    override fun startDrive() {
        println("Начать движение.")
    }

    override fun stopDrive() {
        println("Прекратить движение.")
    }

    override fun loadPassengers(numberOfPeopleToTransport: Int): Int {
        val numberOfLoadPeople: Int
        if (numberOfPeopleToTransport > maxNumberOfPassengers) numberOfLoadPeople = maxNumberOfPassengers
        else numberOfLoadPeople = numberOfPeopleToTransport
        println("Произведена посадка $numberOfLoadPeople пассажира(ов)")
        return numberOfLoadPeople
    }

    override fun transportPassengers(numberOfPeopleToTransport: Int) {
        var undeliveredPeople = numberOfPeopleToTransport
        var peopleOnTheTrip: Int
        var tripNumber = 1
        do {
            println("Поездка $tripNumber")
            peopleOnTheTrip = loadPassengers(undeliveredPeople)
            startDrive()
            stopDrive()
            unloadPassengers()
            undeliveredPeople -= peopleOnTheTrip
            tripNumber += 1
            println()
        } while (undeliveredPeople > 0)
    }

    override fun unloadPassengers() {
        println("Из автомобиля вышли пассажиры.")
    }
}

class PassengerCar(
    model: String,
    maxNumberOfPassengers: Int,
) : Car(model, maxNumberOfPassengers)

class Truck(
    model: String,
    maxNumberOfPassengers: Int,
    val maxLoadCapacity: Float,
) : Car(model, maxNumberOfPassengers), CargoCarrier {
    override fun loadCargo(cargoWeight: Float): Float {
        val quantityOfLoadCargo: Float
        if (cargoWeight > maxLoadCapacity) quantityOfLoadCargo = maxLoadCapacity
        else quantityOfLoadCargo = cargoWeight
        println("Загружено груза: $quantityOfLoadCargo т")
        return quantityOfLoadCargo
    }

    override fun unloadCargo() {
        println("Выгрузить груз")
    }

    override fun transportCargo(quantityOfCargoToTransport: Float) {
        var undeliveredCargo = quantityOfCargoToTransport
        var cargoOnTheTrip: Float
        var tripNumber = 1
        do {
            println("Поездка для перевоза груза $tripNumber")
            cargoOnTheTrip = loadCargo(undeliveredCargo)
            startDrive()
            stopDrive()
            unloadCargo()
            undeliveredCargo -= cargoOnTheTrip
            tripNumber += 1
            println()
        } while (undeliveredCargo > 0)
    }
}

interface Movable {
    fun startDrive()

    fun stopDrive()
}

interface PassengerCarrier {
    fun loadPassengers(numberOfPeopleToTransport: Int): Int

    fun unloadPassengers()

    fun transportPassengers(numberOfPeopleToTransport: Int)
}

interface CargoCarrier {
    fun loadCargo(cargoWeight: Float): Float

    fun unloadCargo()

    fun transportCargo(quantityOfCargoToTransport: Float)
}