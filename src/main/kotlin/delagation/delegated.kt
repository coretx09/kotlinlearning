package delagation

import kotlin.reflect.KProperty

fun main(){
    val new: Int by Multiplicator()
    println(new)
    var second: Int by Multiplicator()
    second = 3
    println("$second \n $new")

}

class Multiplicator {
    private var value = 1
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return value
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value:Int) {
        this.value = value * 2
    }
}

