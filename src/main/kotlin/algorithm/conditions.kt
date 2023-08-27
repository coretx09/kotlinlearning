package algorithm


fun fibonacci(n:Int):Int {
    if (n<=1)
        return n
    return fibonacci(n-1) + fibonacci(n-2)
}

fun fibonacci2(n:Int):Int {
    return if (n<=1)
        n
    else fibonacci2(n-1) + fibonacci2(n-2)
}

fun gcd(m:Int, n:Int):Int {
    if (m == 0) {
        return n
    }
    if (n == 0) {
        return m
    }
    return gcd(n, m % n)
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

fun linearContains(value: Int, numbers: List<Int>): Boolean {
    for (element in numbers) {
        if (element == value) {
            return true
        }
    }
    return false
}

fun pseudoBinaryContains(value: Int, numbers: List<Int>):
        Boolean {
    if (numbers.isEmpty()) return false
    val middleIndex = numbers.size / 2
    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index] == value) {
                return true
            }
        }
    } else {
        for (index in middleIndex until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}
fun main(){

    val fn = fibonacci2(13)
    //println(fn)
    //println( gcd(10, 3))
    val numbers = listOf(1, 3, 56, 66, 68, 80, 99, 105, 450)

    //println(linearContains(3, numbers))
    println(pseudoBinaryContains(34, numbers))

}