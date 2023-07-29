package Nullability

import kotlin.test.assertEquals


fun main(){

    // NULLABLE TYPES
    var nullableVariable: Int? = 10
    nullableVariable = null


    // Vérification de null dans les conditions
    val b = if (nullableVariable != null) 6 else 10

    var answer: String? = "42"
    answer = null
    val response = answer!!.toInt()
    println(response)

}
