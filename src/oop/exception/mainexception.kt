package oop.exception

fun main() {
    try {
        validate("Hadiyan")
        validate("")
        println("Success") //this line will not be executed
    } catch (e: ValidationException) {
        println("error thrown : ${e.message}")
    } finally {
        println("finally always executed")
    }
    validate("")
}

fun validate(name: String) {
    if (name.isEmpty()) {
        throw ValidationException("name is blank")
    } else
        println("name is $name")
}