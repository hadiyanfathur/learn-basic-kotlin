fun movie2(name: String, transformer : (String) -> String) : String {
    return transformer(name)
}

fun main() {
    val anonString = fun (value : String) : String {
        return value.uppercase()
    }
    println(anonString("Hadiyan"))

    val movie = movie2("Avenger", fun (value : String) : String {
        if (value.isBlank())
            return "No Movie"
        return value.uppercase()
    })
    println(movie)
}