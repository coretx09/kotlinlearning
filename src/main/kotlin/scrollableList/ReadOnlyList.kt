package scrollableList

/*  LIST EN LECTURE SEUL : listOf
 List ne peut pas être modifiée après sa création.
 */
fun main() {

    // variable numbers de type List<Int> car elle contiendra une liste d'entiers en lecture seule.
    val numbers: List<Int> = listOf(1, 2, 3, 4, 6)
    println("numbers: $numbers")

    // le type de la variable peut être deviné, Par conséquent, vous pouvez raccourcir cette ligne de code comme suit :
    val numbers2 = listOf(1, 2, 31, 26, 5)
    println("numbers2 : $numbers2")
    /* La sortie est une liste de tous les éléments de la liste
     Remarquez les parenthèses [], indiquant qu'il s'agit d'un fichier List */

    // Access elements of the list
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    println("index of element 3: ${numbers2.indexOf(3)}")

    // Use the contains() method
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")

    // reversed()/sorted() method
    // reversed() fonction renvoie une nouvelle liste où les éléments sont dans l'ordre inverse
    println("Reversed list numbers2: ${numbers2.reversed()}")

    // sorted() renvoie une nouvelle liste où les éléments sont triés par ordre croissant.
    println("sorted list: ${numbers2.sorted()}")
}