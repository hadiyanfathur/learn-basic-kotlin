infix fun String.to(type : String): String {
    return when (type) {
        "UP" -> this.uppercase()
        "LOW" -> this.lowercase()
        else -> this
    }
}
fun main() {
    val name = "Hadiyan"
    println(name to "UP")
    println(name to "LOW")
    println(name to "OTHER")
}