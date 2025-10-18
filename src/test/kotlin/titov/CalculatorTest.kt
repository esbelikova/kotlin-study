package titov

import org.example.titov.multiply
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CalculatorTest {
    @Test
    fun testMultiply(){
        assertEquals(6, multiply(2, 3))
    }
}