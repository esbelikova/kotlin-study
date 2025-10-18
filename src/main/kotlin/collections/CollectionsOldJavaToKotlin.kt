package org.example.collections

import java.time.LocalDate

class CollectionsOldJavaToKotlin {

    /**
     * Найдите минимальную дату в списке дат. Если список пустой, вернуть null.
     */
    fun findMinDate(dates: List<LocalDate>): LocalDate? {
        var minDate: LocalDate? = null
        for (date in dates) {
            if (minDate == null || date.isBefore(minDate)) {
                minDate = date
            }
        }
        return minDate
    }

    /**
     * Создайте новый список строк из старого, сохранив только первые вхождения повторяющихся элементов.
     */
    fun listWithoutDuplicates(strings: List<String>): List<String> {
        val result = mutableListOf<String>()
        for (element in strings) {
            if (!result.contains(element)) {
                result.add(element)
            }
        }
        return result
    }

    /**
     * Подсчитайте количество дубликатов каждого элемента в списке.
     * Элементы, которые встречаются только 1 раз, не должны входить в результат.
     */
    fun countDuplicates(strings: List<String>): Map<String, Int> {
        val itemCount = mutableMapOf<String, Int>()
        for (string in strings) {
            itemCount[string] = itemCount.getOrDefault(string, 0) + 1
        }
        return itemCount.filter { it.value > 1 }
    }

    /**
     * Удалите из оригинального списка чисел четные числа.
     */
    fun removeEvenNumbers(numbers: MutableList<Int>) {
        numbers.removeAll { it % 2 == 0 }
    }

    /**
     * В списке строк переверните каждую строку задом наперед.
     */
    fun reverseStrings(strings: MutableList<String>) {
        strings.replaceAll { it.reversed() }
    }
}