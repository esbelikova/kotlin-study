package fileIO

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.io.File

class ReadFileTest {
    @Test
    fun testReadFile_FileExists() {
        val tempFile = File.createTempFile("testFile", ".txt")
        tempFile.writeText("Hello, world!")
        assertDoesNotThrow { readFile(tempFile.absolutePath) }
        tempFile.delete()
    }

    @Test
    fun testReadFile_FileDoesNotExist() {
        val fakePath = "fake/path/to/file.txt"
        assertDoesNotThrow { readFile(fakePath) }
    }
}