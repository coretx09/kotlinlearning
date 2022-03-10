package collections

fun main() {
                               // Lambda         //
    val triple: (Int) -> Int = { a: Int -> a * 3 }
            // Function Type //
    println(triple(2))

    // utilise implicitement l'identifiant spécial it pour le paramètre d'un lambda avec un seul paramètre.
    val double: (Int) -> Int = { it * 2}
    println(double(45))


    // Higher-order FUNCTIONS
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    // sortedWith() comparator : tri une collection  en fonction de ce que vous voulez
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length  })
}