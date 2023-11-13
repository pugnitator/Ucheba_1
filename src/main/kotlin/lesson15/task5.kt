package lesson15

fun main() {

    val passengerCar = PassengerCar("volvo", 3, 0)
    val numberOfPeopleToTransport = 6


    println()

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

    fun unloadPassengers(numberOfPeople: Int) {
        println("Из автомобиля вышли $numberOfPeople человек(а)")
    }

    fun transportPassengers(car: Any, numberOfPeopleToTransport: Int, maxLoadCapacity: Int) {
        if (car is Truck || car is PassengerCar) {
            var deliveredPeople = 0
            do {
                deliveredPeople += passengerCar.loadPassengers(
                    numberOfPeopleToTransport,
                    passengerCar.maxNumberOfPassengers
                )
                passengerCar.transportPassengers("Москва", "Петушки")
                passengerCar.startDrive()
                passengerCar.stopDrive()
                passengerCar.unloadPassengers(numberOfPeopleToTransport)
            } while (deliveredPeople != numberOfPeopleToTransport)

        } else println("Перевозка невозможна")
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