package oop.vehicle

sealed class Vehicle(var name: String, var brand: String) {
    abstract fun run()
}
