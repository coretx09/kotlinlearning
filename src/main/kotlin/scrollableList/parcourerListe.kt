package scrollableList

fun main() {
    // WHILE LOOPS :
    // chaque élément représente le nombre d'invités qui ont RSVP de chaque famille.
    val guestPerFamily = listOf(3, 4, 1, 3)

    // nombre total d'invités, initialisez à 0
    var totalGuests = 0

    /* index variable continuera d'augmenter de 1 à chaque fois jusqu'à ce que vous atteigniez
     le dernier index de la liste, après quoi vous quittez la boucle */
    var index = 0

    /* La condition est de continuer à exécuter le bloc de code,
    tant que l'index valeur est inférieure à la taille de la liste. */
    while (index < guestPerFamily.size) {
        totalGuests += guestPerFamily[index]
        index++
    }
    // Resultat
    println("Total Guest Count: $totalGuests")


    // FOR LOOPS
    val namesFirstFamily = listOf("Jessica", "Henry", "Alicia")
    println("NAME GUEST FIRST FAMILY :")

    /* La variable name est définie égale au premier élément de nameFirstFamily et le bloc de code est exécuté.
     Ensuite, la name variable est automatiquement mise à jour pour être l'élément suivant de nameFirstFamily,
     et le bloc de code est à nouveau exécuté. Cela se répète pour chaque élément de la liste, jusqu'à ce que
     la fin de numberList soit atteinte.  */
    for (name in namesFirstFamily) {
        // Une opération courante sur les listes consiste à faire quelque chose avec chaque élément de la liste.
        println("number ${namesFirstFamily.indexOf(name) + 1}: $name")
    }
}