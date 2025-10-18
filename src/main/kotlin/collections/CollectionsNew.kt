package org.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun wordsCounter(string: String): Map<String, Int> {
    val words = string.lowercase(Locale.getDefault()).split(" ")
    val map = mutableMapOf<String, Int>()
    for (word in words) {
        val count = map.getOrDefault(word, 0)
        map[word] = count + 1
    }
    return map
}

fun findMostFrequentWord(list: ArrayList<Int>): Int? {
    val countMap = mutableMapOf<Int, Int>()
    for (element in list) {
        val count = countMap.getOrDefault(element, 0)
        countMap[element] = count + 1
    }
    var maxCount = 0
    var mostFrequentWords:Int? = null
    for ((element,count) in countMap){
        if(count > maxCount){
            maxCount = count
            mostFrequentWords = element
        }
    }
    return mostFrequentWords
}
fun main() {
    println(wordsCounter("Я не могу я я я хочу на море море"))
    println(findMostFrequentWord(arrayListOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 4)))
}