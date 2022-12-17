fun movie(name: String, transformer : (String) -> String) : String {
    return transformer(name)
}

fun main() {
    // Higher Order Function
    // Function yang menerima function sebagai parameter atau mengembalikan function
    // Jika terlalu banyak digunakan akan membuat kode tidak optimal, karena akan di buat banyak object lambda di java

    val upper = { value : String -> value.uppercase() }
    val lower = { value : String -> value.lowercase() }

    println(movie("Avenger", upper))
    println(movie("Avenger", lower))
    println(movie("Avenger", { value -> value.lowercase() }))

    //trailing lambda if last parameter is lambda
    val movieToUpper = movie("Avenger") { value : String -> value.uppercase() }
    val movieToLower = movie("Avenger") { value : String -> value.lowercase() }
    println(movieToUpper)
    println(movieToLower)
}