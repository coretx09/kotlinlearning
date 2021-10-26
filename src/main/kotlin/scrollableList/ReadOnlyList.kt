package scrollableList
// fun main est la fonction principale
//  LIST EN LECTURE SEUL: listOf
fun main() {

    // variable numbers de type List<Int> car elle contiendra une liste d'entiers en lecture seule.
    val numbers: List<Int> = listOf(1, 2, 3, 4, 6)
    println("numbers: $numbers")

    // le type de la variable peut être deviné, Par conséquent, vous pouvez raccourcir cette ligne de code comme suit :
    val numbers2 = listOf(1, 2, 3, 4, 6)
    println("numbers2 : $numbers2")
}