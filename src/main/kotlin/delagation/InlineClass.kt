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




fun main() {



}