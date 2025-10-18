package org.example

import org.example.syntax.Person

fun main() {
    println("Hello World!")
    val person = Person("Kate", 22)
    person.introduce()
    person.checkAgeCategory()
}