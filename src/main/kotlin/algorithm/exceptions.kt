package algorithm

import java.io.File
import java.io.FileNotFoundException


private fun functionThrowing() {
    throw ArithmeticException("Some message")
}

class MyException : Throwable("Some message")
fun someFunction() {
    throw MyException()
    println("Will not be printed")
}
fun touch(number: Int?):Int {
    println("toch")
    return try {
        number!! - 2
    } catch (_: Exception) {
        println("hg")
        8
    }

}

fun long(word:String) =  word.apply {
        try {
            if (length < 3)
                someFunction()
            else
                println(length)
        } catch(_:MyException){
            println("Size of $this < 3 ")
        }
        println(" $this start")
    }

fun sumFromOne(n: Int): Int {
   try {
       return n * 2  / n
    } catch (_: Exception) {}
    return 0
}



fun main() {


    val content = try {
        File("AAA").readText()
    } catch (e: FileNotFoundException) {
        "File not found"
    }
    println(content) // (empty string)

    try {
        someFunction()
        println("Will not be printed")
    } catch (e: MyException) {
        println("Caught $e")
    }

    //println(long("pu"))
    println( sumFromOne(0))

}