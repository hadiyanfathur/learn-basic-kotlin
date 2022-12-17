package oop.person

/**
 * Interface
 * 1. Interface is a contract
 * 2. Interface is a blueprint
 * 3. Interface is a collection of abstract method
 * 4. Interface can have default method
 * 5. Interface can have property
 * 6. Interface can have multiple inheritance
 */
interface Interaction {
    val firstName: String
    fun sayHello(name: String)
    //default implementation
    fun sayGoodBye(name: String) {
        println("Good Bye $name, i $firstName say goodbye to you")
    }
}