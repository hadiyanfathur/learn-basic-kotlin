package oop.delegation

fun main() {
    val b = BaseImpl("Hadiyan")
    Delegate(b).sayHello()
    Delegate(b).sayGoodBye()
}