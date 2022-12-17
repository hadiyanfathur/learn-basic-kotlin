fun main() {
    val range = 1..100
    println(range)
    println(range.step)
    println(range.count())
    println(range.first)
    println(range.last)
    println(range.isEmpty())
    println(range.reversed())
    println(range.reversed().step)
    println(range.reversed().count())
    println(range.contains(50))
    println(range.contains(101))

    println("====================================")

    val range2 = 100 downTo 1
    println(range2)
    println(range2.step)
    println(range2.count())
    println(range2.first)
    println(range2.last)
    println(range2.isEmpty())
    println(range2.reversed())
    println(range2.reversed().step)
    println(range2.reversed().count())
    println(range2.contains(50))
    println(range2.contains(101))

    println("====================================")

    val range3 = 1..100 step 2
    println(range3)
    println(range3.step)
    println(range3.count())
    println(range3.first)
    println(range3.last)
    println(range3.isEmpty())
    println(range3.reversed())
    println(range3.contains(50))
    println(range3.contains(99))
}