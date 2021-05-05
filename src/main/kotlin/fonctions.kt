
import java.util.Random

fun main(args: Array<String>){

    //Dans Kotlin, presque tout est une expression et a une valeur, même si cette valeur n'est kotlin.Unit

    val hello = println("hello world !")
    println(hello)

    val temperature = 20
    val isCold = if (temperature < 15) {
        println("is cold")
    } else println("is no cold")

    val message = "la temperature est ${if (temperature in 16..25) "Good" else "NO"}"
    println(message)

    // !! les boucles sont des exceptions à «tout a une valeur». Il n'y a pas de valeur raisonnable
   // pour les for ou while, donc elles n'ont pas de valeurs.


    // FUNCTIONS :

    fun randomDay(): String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
        /* La nextInt() function prend une limite entière, qui limite
         le nombre de Random() 0 à 6 pour correspondre au week tableau.*/
    }

    //test1
    fun fishFoodTest (day : String) : String {
        /* vous pouvez déclarer food avec val au lieu de var.
        * Étant donné que le code affecte désormais une chaîne à food une seule fois
        * Avoir une branche par défaut(else) garantit que food obtient une valeur avant
        * d'être renvoyée, elle n'a donc plus besoin d'être initialisée */
        val food: String
        when (day) {
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            //"Saturday" -> food = "lettuce"
            //"Sunday" -> food = "plankton"
            else -> food = "nothing"
        }
        return food
    }

    // final fishFood
    /* Étant donné que chaque expression a une valeur, vous pouvez rendre ce code un peu plus concis.
    * Renvoie when directement la valeur de l' expression et élimine la food variable
    * La valeur de l' when  expression est la valeur de la dernière expression de la branche
    * qui satisfait la condition.*/
    fun fishFood (day : String) : String {
        return when (day) {
            "Monday" -> "flakes"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Sunday" -> "plankton"
            else -> "nothing"
        }
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }

    feedTheFish()


    //FUNCTION Higher-order
    /*C'est une fonction qui prend des fonctions comme paramètres ou renvoie une fonction.
    elles peuvent être stockées dans des variables et des structures de données,
    .*/

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")


    //FUNCTION LAMBDA : Un lambda est une expression qui crée une fonction.
    /*les lambdas sont appelés fonctions anonymes , littéraux de fonction*/
    var dirtyLel = 20
    val waterFilter = {dirty : Int, resolv: Int -> dirty / resolv}
    println(waterFilter(1, 2))





}