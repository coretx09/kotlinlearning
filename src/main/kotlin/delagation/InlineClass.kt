package delagation




inline class Number(val number:Int) {
    fun getNumber() = number
}

interface First{
    val num: Int
        get() = mu()

    fun mu()= 65
}

fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}

private fun functionThrowing() {
    throw ArithmeticException("Some message")
}

class MyException : Throwable("Some message")
fun someFunction() {
    throw MyException()
    println("Will not be printed")
}


fun main() {

    try {
        someFunction()
        println("Will not be printed")
    } catch (e: MyException) {
        println("Caught $e")
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
    println(touch(null))

}