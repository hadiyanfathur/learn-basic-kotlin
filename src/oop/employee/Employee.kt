package oop.employee

open class Employee(var id: Int, var name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name} my id is ${this.id}")
    }
}