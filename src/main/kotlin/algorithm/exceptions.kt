package algorithm

import java.io.File
import java.io.FileNotFoundException


fun main() {


    val content = try {
        File("AAA").readText()
    } catch (e: FileNotFoundException) {
        "hg"
    }
    println(content) // (empty string)
}