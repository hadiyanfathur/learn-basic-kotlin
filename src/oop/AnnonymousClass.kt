package oop

fun goRun(action: Action) {
    action.run()
}

fun main() {
    goRun(object : Action {
        override fun run() {
            println("run")
        }
    })

    goRun(object : Action {
        override fun run() = println("run two")
    })
}