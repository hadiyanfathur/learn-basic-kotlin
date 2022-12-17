package oop.vehicle

class Bicycle : Vehicle {
    constructor(name: String, brand: String) : super(name, brand)

    override fun run() {
        println("$name is running")
        println("brand is $brand")
    }
}