package oop.vehicle

fun main() {
    val car = Car("Avanza", "Toyota")
    println(car.name)
    println(car.brand)
    println(car)
    println(car.copy())
    println(vehicles("This is Motor", Motor("R15", "Yamaha")))
}

/**
 * Sealed class is designed to inheritance of a class
 * Sealed class can't be instantiated
 * Sealed class in when expression
 */
fun vehicles(value : String, vehicle: Vehicle) : String {
    return when(vehicle) {
        is Motor -> value + " " + vehicle.name
        is Bicycle -> value + " " + vehicle.name
    }
}