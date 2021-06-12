package diceRollerApp

fun buildDice() {
    // first Dice
    val firstDice = Dice(6) // Instantiation
    println("Your ${firstDice.numSides} sided dice roll ${firstDice.roll()}")

    // second Dice
    val secondDice = Dice(8)
    println("Your ${secondDice.numSides} sided roll ${secondDice.roll()}")
}

fun buildLuckyDice() {
    val firstLuckyDice = Dice(6)
    val rollResult = firstLuckyDice.roll()
    val luckyNumber = 4
    if (rollResult == luckyNumber) {
        println("YOU WIN")
    } else {
        println("You didn't win, try again!")
    }



}

fun main(args: Array<String>) {

    buildLuckyDice()


}