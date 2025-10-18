package org.example.titov

object Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Int {
        require(b != 0) { "Деление на ноль!" }
        return a / b
    }
}