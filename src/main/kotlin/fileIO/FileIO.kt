package fileIO

import java.io.File

fun readFile(filePath: String) {
    try {
       val file = File(filePath)
        if (!file.exists()) {
            println("File not found, check the file path: $filePath")
            return
        }
        println("File contents: $filePath")
        file.forEachLine { line ->
            println(line)
        }
        }
    catch (e: Exception) {
        println("Read file error")
    }
}

fun main() {
    val filePath = "/Users/ek.belikova/Documents/text.txt"
    readFile(filePath)
}