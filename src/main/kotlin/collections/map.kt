package collections

fun main() {

    val peoplesAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    println(peoplesAges)

    // ajouter plus d'entrées à Maps
    peoplesAges.put("Barbara", 52)
    peoplesAges["Joe"] = 51

    // Enumeration avec forEach
    peoplesAges.forEach { print("${it.key} is ${it.value}, ") }
    println("")

    /** map()
     * La conversion d'une collection en chaîne est une opération courante, et ce séparateur supplémentaire
      à la fin est également un problème courant. Vous apprendrez comment gérer cela dans les étapes à venir.*/
    println(peoplesAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
    /* joinToString(", ")ajoute chaque élément de la collection transformée à une chaîne, séparée par ,
    et il sait ne pas l'ajouter au dernier  */

    // filter
    val filteredNames = peoplesAges.filter { it.key.length >= 4 }
    println(filteredNames)
}