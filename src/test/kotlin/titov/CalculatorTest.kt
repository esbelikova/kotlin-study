package titov

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.example.titov.Calculator

class CalculatorTest {

    @Test
    fun testAdd() {
        assertEquals(5, Calculator.add(2, 3))
    }

    @Test
    fun testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3))
    }

    @Test
    fun testDivide() {
        assertEquals(4, Calculator.divide(8, 2))
    }

    @Test
    fun testDivideByZero() {
        assertThrows<IllegalArgumentException> {
            Calculator.divide(5, 0)
        }
    }
}