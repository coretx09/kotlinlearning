import java.util.Scanner

fun main(args: Array<String>) {

    
    // instance reader
    val reader = Scanner(System.`in` ) 
    // called
    print("Your best number")
    val bestNumber = reader.nextInt()
    
    // CONDITIONS:
    if (bestNumber in 1..5) println("janv - jun")
    else if (bestNumber in 6..9) println("jul - sept")
    else if (bestNumber in 10..12) println("oct - dec")
    else println("only in range 1 to 12")

    // WHEN
    print("best day: ")
    when (val bestDay: Int = reader.nextInt()) {
        1 -> println("lundi")
        2 -> println("mardi")
        3 -> println("mercredi")
        4 -> println("jeudi")
        5 -> println("vendredi")
        6 -> println("samedi")
        7 -> println("dimanche")
        else -> println("only in range 1 to 7")

    }
    
}