class Person {


    var name: Int = 5
        get() = 10 + field

}

class Girl {
    var age: Int = 0
        get() = field + 1
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value-3
            }
        }


}




fun main(args: Array<String>) {

    val sauvet = Person()
    println(sauvet.name)

    val sara = Girl()
    sara.age = 240
    println(sara.age)

}