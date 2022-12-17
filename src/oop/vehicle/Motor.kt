package oop.vehicle

class Motor : Vehicle {
    constructor(name: String, brand: String) : super(name, brand)

    override fun run() {
        println("$name is running")
        println("brand is $brand")
    }
}