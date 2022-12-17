fun main() {
    println(fullName())
    println(fullName(lastName = "Fathur", firstName = "Hadiyan")) //name argument
    println(fullName(lastName = "Fathur"))
    println(fullName(firstName = "Hadiyan"))
    println(fullName("Hadiyan"))
    println(fullName(null))
    println(fullNameSingle(lastName = "Fathur"))
    println(varArgFunction("Hi", "Hadiyan", "Fathur", "Rahman"))
}

fun fullName(firstName: String? = "", lastName: String? = ""): String {
    return "$firstName $lastName"
}

fun fullNameSingle(firstName: String? = "", lastName: String? = ""): String = "$firstName $lastName"

fun varArgFunction(say : String, vararg names: String) : String = "$say ${names.joinToString(",")}"