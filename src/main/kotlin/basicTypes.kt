fun main(args:Array<String>){

    // NUMBERS :
    // Integer types:
    println("Byte ${Byte.MIN_VALUE} To ${Byte.MAX_VALUE} ${Byte.SIZE_BITS} ")
    println("Short ${Short.MIN_VALUE} To ${Short.MAX_VALUE}")
    println("Int ${Int.MIN_VALUE} To ${Int.MAX_VALUE}")
    println("Long ${Long.MIN_VALUE} To ${Long.MAX_VALUE}")
    // All variables initialized with integer values not exceeding the maximum value of Int have the inferred type Int
    val one = 1 // Int by default
    val oneLong = 1L // long
    val oneByte: Byte = 1
    val oneShort: Short = 1
    val threeBillions = 3000000000

    // Floating-point types
    val pi = 3.14 // Double by default
    val piFloat = 3.1465_4288_2876_578F // To explicitly specify the Float type for a value, add the suffix f or F
    println("$piFloat and ${piFloat.toDouble()}")



}
