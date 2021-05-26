package diceRollerApp

fun buildDice(){
    // first Dice
    val firstDice = Dice(6) // Instantiation
    println("Your ${firstDice.numSides} sided dice roll ${firstDice.roll()}")

    // second Dice
    val secondDice = Dice(8)
    println("Your ${secondDice.numSides} sided roll ${secondDice.roll()}")

}

fun main(args: Array<String>){

    buildDice()




}