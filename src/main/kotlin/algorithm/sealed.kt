package algorithm

sealed class Test: Err () {
    data class A(val a:Int = 5, val b:Int = 6) : Test()
    object B : Test()

}

open class Err

data class State(val a: Int = 1, val b: Int= 3 )
fun main(){


   /** var myA = Test.A(emptyList())
    myA = Test.A(listOf("a","b"))

    var my2: Test = Test.A(emptyList())
    var m3 = Test.A(listOf("u"))
    println(m3.a) */

    val nest = Test.B
    val myTest : Test
    val yt: String

    val state1 = State()
    val state2 = state1.copy(a=2)
    println(state1.a)

}






