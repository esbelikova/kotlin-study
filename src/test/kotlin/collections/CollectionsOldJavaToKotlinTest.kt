package org.example.collections

import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class CollectionsOldJavaToKotlinTest {

    private val collections = CollectionsOldJavaToKotlin()

    // Тест для findMinDate
    @Test
    fun `findMinDate returns null for empty list`() {
        val result = collections.findMinDate(emptyList())
        assertNull(result)
    }

    @Test
    fun `findMinDate returns the only date in single-element list`() {
        val date = LocalDate.of(2023, 10, 1)
        val result = collections.findMinDate(listOf(date))
        assertEquals(date, result)
    }

    @Test
    fun `findMinDate returns correct minimum date`() {
        val dates = listOf(
            LocalDate.of(2023, 10, 5),
            LocalDate.of(2023, 10, 1),
            LocalDate.of(2023, 10, 3)
        )
        val expected = LocalDate.of(2023, 10, 1)
        val result = collections.findMinDate(dates)
        assertEquals(expected, result)
    }

    // Тест для listWithoutDuplicates
    @Test
    fun `listWithoutDuplicates preserves order and removes duplicates`() {
        val input = listOf("a", "b", "a", "c", "b")
        val expected = listOf("a", "b", "c")
        val result = collections.listWithoutDuplicates(input)
        assertEquals(expected, result)
    }

    @Test
    fun `listWithoutDuplicates returns empty list for empty input`() {
        val result = collections.listWithoutDuplicates(emptyList())
        assertTrue(result.isEmpty())
    }

    @Test
    fun `listWithoutDuplicates returns same list for no duplicates`() {
        val input = listOf("a", "b", "c")
        val result = collections.listWithoutDuplicates(input)
        assertEquals(input, result)
    }

    // Тест для countDuplicates
    @Test
    fun `countDuplicates returns map with counts greater than 1`() {
        val input = listOf("a", "b", "a", "c", "b", "a")
        val expected = mapOf("a" to 3, "b" to 2)
        val result = collections.countDuplicates(input)
        assertEquals(expected, result)
    }

    @Test
    fun `countDuplicates returns empty map when no duplicates`() {
        val input = listOf("a", "b", "c")
        val result = collections.countDuplicates(input)
        assertTrue(result.isEmpty())
    }

    @Test
    fun `countDuplicates returns empty map for empty list`() {
        val result = collections.countDuplicates(emptyList())
        assertTrue(result.isEmpty())
    }

    // Тест для removeEvenNumbers
    @Test
    fun `removeEvenNumbers removes all even numbers from mutable list`() {
        val numbers = mutableListOf(1, 2, 3, 4, 5, 6)
        collections.removeEvenNumbers(numbers)
        assertEquals(listOf(1, 3, 5), numbers)
    }

    @Test
    fun `removeEvenNumbers does nothing if no even numbers`() {
        val numbers = mutableListOf(1, 3, 5)
        collections.removeEvenNumbers(numbers)
        assertEquals(listOf(1, 3, 5), numbers)
    }

    @Test
    fun `removeEvenNumbers clears list if all are even`() {
        val numbers = mutableListOf(2, 4, 6)
        collections.removeEvenNumbers(numbers)
        assertTrue(numbers.isEmpty())
    }

    // Тест для reverseStrings
    @Test
    fun `reverseStrings reverses each string in mutable list`() {
        val strings = mutableListOf("abc", "hello", "kotlin")
        collections.reverseStrings(strings)
        assertEquals(listOf("cba", "olleh", "niltok"), strings)
    }

    @Test
    fun `reverseStrings handles empty strings`() {
        val strings = mutableListOf("", "a", "ab")
        collections.reverseStrings(strings)
        assertEquals(listOf("", "a", "ba"), strings)
    }

    @Test
    fun `reverseStrings does nothing on empty list`() {
        val strings = mutableListOf<String>()
        collections.reverseStrings(strings)
        assertTrue(strings.isEmpty())
    }
}