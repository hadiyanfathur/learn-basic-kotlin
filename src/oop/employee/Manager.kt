package oop.employee

open class Manager(id: Int, name: String) : Employee(id, name) {

    // if don't want to override by child class, use final
    final override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name} my id is ${this.id}, i am a manager")
    }
}