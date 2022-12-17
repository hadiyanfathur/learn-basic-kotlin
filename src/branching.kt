fun main() {
    ifExp("Hadiyan")
    ifExp("Hadi")
    ifExp(null)
    println("==============")
    whenExp("Hadiyan")
    whenExp("Hadi")
    whenExp(null)
    println("==============")
    whenGroupExp("A")
    whenGroupExp("D")
    whenGroupExp("H")
    println("==============")
    whenInExp("A")
    whenInExp("D")
    whenInExp("H")
    println("==============")
    whenIsExp("Hadiyan")
    whenIsExp(1)
    println("==============")
    whenCustomExp(100)
    whenCustomExp(88)
    whenCustomExp(40)
    whenCustomExp(20)
}

fun ifExp(name: String?) {
    if (name != null) {
        println("Hello $name")
    } else {
        println("Hello")
    }
}

fun whenExp(name: String?) {
    when (name) {
        "Hadiyan" -> println("Hello Hadiyan")
        "Hadi" -> println("Hello Hadi")
        else -> println("Hello")
    }
}

fun whenGroupExp(score: String){
    when (score) {
        "A", "B", "C" -> println("Good")
        "D", "E" -> println("Not Good")
        else -> println("Bad")
    }
}

fun whenInExp(score: String){
    val passValue : Array<String> = arrayOf("A", "B", "C")

    when (score) {
        in passValue -> println("Good")
        !in passValue-> println("Failed")
    }
}

fun whenIsExp(name: Any){
    when (name) {
        is String -> println("Hello $name")
        !is String -> println("Hello not String")
    }
}

fun whenCustomExp(score: Int){
    when {
        score > 90 -> println("Amazing")
        score > 75 -> println("Good")
        score > 50 -> println("ok")
        score > 40 -> println("Not Good")
        else -> println("Bad")
    }
}