fun main(args: Array<String>) {

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter {it[0] == 'p'})

    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")




}
