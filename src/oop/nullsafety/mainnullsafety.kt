package oop.nullsafety

fun main() {
    helloSmartphone(Smartphone("Samsung"))
    helloSmartphone(null)
    helloSmartphone2(Smartphone("Xiaomi"))
    helloSmartphone2(null)
    helloSmartphone3(Smartphone("iPhone"))
    helloSmartphone3(null)
    helloSmartphone4(Smartphone("Oppo"))
    //helloSmartphone4(null) will throw a null pointer exception
}

//null safety
fun helloSmartphone(smartphone: Smartphone?) {
    println(smartphone?.name)
}

//elvis operator
fun helloSmartphone2(smartphone: Smartphone?) {
    println(smartphone?.name ?: "no name Smartphone")
}

//manual checking
fun helloSmartphone3(smartphone: Smartphone?) {
    if (smartphone != null) {
        println(smartphone.name)
    } else {
        println("no name Smartphone")
    }
}

//if you sure that the value is not null, you can use !! operator
fun helloSmartphone4(smartphone: Smartphone?) {
    println(smartphone!!.name)
}