package algorithm

fun calculate(variables:String): Int {
    print("Calculating $variables ...")
    return 42
}
val fizz = calculate("fizz")
val match get() = calculate("match")

interface Element {
    val active: Boolean
    var noActive: Int
    fun choice() = "$active $noActive"
}

class ActualElement : Element {
    override var active: Boolean = false
    override var noActive: Int = 4


}

fun main() {
    val element = ActualElement()
    println(element.choice())

}