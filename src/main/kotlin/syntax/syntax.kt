package org.example.syntax

class Person (val name: String, val age: Int) {
     fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }

     fun checkAgeCategory() {
        when {
            age < 14 -> println("$name is a children.")
            age in 15..25 -> println("$name is an youth.")
            age in 26..65 -> println("$name is a adult.")
            else -> println("$name is a senior.")
        }
    }
}

    fun main() {
        val person1 = Person("Kate", 22)
        person1.introduce()
        person1.checkAgeCategory()

        val person2 = Person("Vasya", 12)
        person2.introduce()
        person2.checkAgeCategory()

        for (i in 1..10) {
            if (i % 2 == 0) {
                println("$i is even")
            } else {
                println("$i is odd")
            }
        }

        // Подсчет суммы четных чисел от 1 до 10
        var sumEven = 0
        var j = 1
        while (j <= 10) {
            if (j % 2 == 0) {
                sumEven += j
            }
            j++
        }
        println("Sum of even numbers from 1 to 10 is $sumEven")

        // Подсчет суммы нечетных чисел, используя do-while цикл
        var sumOdd = 0
        var k = 1
        do {
            if (k % 2 != 0) {
                sumOdd += k
            }
            k++
        } while (k <= 10)
        println("Sum of odd numbers from 1 to 10 is $sumOdd")
    }