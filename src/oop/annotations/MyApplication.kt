package oop.annotations

@Fancy(name = "MyApplication")
class MyApplication(val name: String, val version: Int) {
    fun run() :String = "Running $name version $version"
}