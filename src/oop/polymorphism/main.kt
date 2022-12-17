package oop.polymorphism

import oop.employee.Employee
import oop.employee.Manager
import oop.employee.VicePrecident

fun main() {
    var employee = Employee(1, "Fathur")
    employee.sayHello("Hadiyan")
    employee = Manager(2, "Hadiyan")
    employee.sayHello("Fathur")
    employee = VicePrecident(3, "Fathur")
    employee.sayHello("Hadiyan")
}