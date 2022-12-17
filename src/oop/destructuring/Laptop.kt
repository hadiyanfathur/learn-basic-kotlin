package oop.destructuring

// class should be destructured manually
class Laptop(val name: String, val price: Int) {
    operator fun component1() = name
    operator fun component2() = price
}