
/*    PROGRAM ENTRY POINT
An entry point of a Kotlin application is the main function.
Another form of main accepts a variable number of String arguments.
 */
fun main(args: Array<String>) {

    //PRINT:
    /*print prints its argument to the standard output.*/
    print("SAUVET ")
    /* println prints its arguments and adds a line break,
     so that the next thing you print appears on the next line.*/
    println("Hello \n World!")

    //FUNCTION:
    /*A function with two Int parameters and Int return type.*/
    fun sum(a: Int = 0, b: Int = 0): Int{
        return a + b
    }
    println("la somme = ${sum(4, 6)}") //string template

    /*A function body can be an expression. Its return type is inferred.*/
    fun sum2(a: Int, b:Int) = a + b
    val laSum = sum2(19, 1)
    println(laSum)

    /*A function that returns no meaningful value. */
    fun printSum(a: Int, b: Int): Unit{  //Unit return type can be omitted.
        println("a = $a b= $b : a + b = ${a + b}") //string template
    }
    printSum(2, 7)

    // VARIABLES:
    /* val(immutable)
     Read-only local variables are defined using the keyword val.
     On ne peut leur attribuer une valeur qu'une seule fois. */

    val a: Int = 1 // Immediate assignment
    val b = 2 // Int type is inferred
    val c: Int // Type required when no initializer is provided
    c = 3 // deferred assignment

    /* var(mutable)
    * Variables that can be reassigned use the var keyword.*/
    var d = 100
    d += 1

    //Creating classes and instances: To define a class, use the class keyword.
    class Person

    //CONDITIONAL EXPRESSIONS
    //if :
    fun maxOf(a: Int, b: Int): Int {
       if (a > b) {
           return a
       } else {
           return b}
    }
    fun minOf(a: Int, b: Int) = if (a < b) a else b

    //for loop:
    val myList = listOf(32, "man", 1995)
    for (item in myList) {
        println(item)
    }

    val myList2 = listOf("sauvet", "kivi", "poupous")
    for (index in myList2.indices) {
        println("item at index $index is ${myList2[index]}")
    }

    // while loop:
    var index = 0
    while (index < myList.size) {
        println("item at index $index  is ${myList[index]}")
        index ++
    }

    // when loop:
    fun describe(obj: Any): String =
        when (obj) {
            1           -> "one"
            "hello"     -> "salutation"
            2           -> "it's two"
            is Long     -> "Long"
            is Int      -> "integer"
            !is String  -> "is not string"
            else        -> "unknown"
        }
    println(describe("yt"))

    //RANGE: using in operator
    //Check if a number is within a range
    val year = 2021
    if (year in 1995..2090) println("life")

    //Iterate over a range.
    for (x in 1..5) {
        print(x)
    }
    println()
    //Or over a progresrintln(name)sion.
    for (x in 6..12 step 3) print(x)
    println()
    for (x in 20 downTo 5 step 5) print(x)
    println()
    for (x in 10 until 19 step 3) print(x)


}