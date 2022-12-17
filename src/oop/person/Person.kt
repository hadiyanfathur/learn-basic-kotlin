package oop.person

class Person(override var firstName: String, var lastName: String?) : Interaction {
    init {
        println("Init Person $firstName")
    }

    //secondary constructor
    constructor(firstName: String) :
            this(firstName, null) {
        println("Secondary Constructor")
    }

    override fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }
}