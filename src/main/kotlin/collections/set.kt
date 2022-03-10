package collections

fun main() {

    // liste
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   $numbers")

    // list to set (set - pas de doublons et l'ordre n'a pas d'importance)
    val setOfNumbers = numbers.toSet()
    println("set: $setOfNumbers")

    // set & mutable set
    /* Même si l'un est mutable et l'autre non, et qu'ils ont les éléments dans un ordre différent,
     * ils sont considérés comme égaux cars, ils contiennent exactement le même ensemble d'éléments. */
    val set1: Set<Int> = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")

    // contains()
    println("contains 7: ${setOfNumbers.contains(7)}")

}