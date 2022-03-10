package collections

/* Prenons maintenant tout ce que vous avez appris sur les collections, les lambdas et les fonctions d'ordre supérieur
  et appliquons-le à un cas d'utilisation réaliste. */

fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

                                      // startsWith() renvoie true si une chaîne commence par la chaîne spécifiée.
    val filteredWords = words.filter { it.startsWith('b', ignoreCase = true) } // Vous pouvez également lui dire d'ignorer la casse, donc "b" correspondra à "b" ou "B".*/
        .shuffled() // mélanges au hasard, vous pouvez voir les mots dans un ordre différent.
        .take(2) // fonction pour obtenir les premiers éléments de la collection
        .sorted()
    println(filteredWords)



}