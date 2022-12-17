fun main() {
    val fullNameLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    println(fullNameLambda("Hadiyan", "Fathur"))

    val nameLambda: (String) -> String = {
        "My Name is $it"
    }
    println(nameLambda("Hadiyan"))

    val nameReference: (String) -> String = ::toUpper
    println(nameReference("Hadiyan"))
}

fun toUpper(value : String) : String = value.uppercase()