package oop.person

fun main() {
    val person = Person("Hadiyan", "Fathur")
    println(person.firstName)
    println(person.lastName)

    val person2 = Person("Hadiyan")
    println(person2.firstName)

    val person3 = Person("Hadiyan", "Fathur")

    println(person == person3)
    println(person.hashCode() == person3.hashCode())
    println(person.firstName == person3.firstName)
    hello(person)
    goodBye(person)
}

fun hello(interaction : Interaction) {
    interaction.sayHello("Fathur")
}

fun goodBye(interaction : Interaction) {
    interaction.sayGoodBye("Fathur")
}