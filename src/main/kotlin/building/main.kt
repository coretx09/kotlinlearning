package building

// SQUARE CABIN
fun builderSquareCabin(){
    val squareCabin = SquareCabin(5, 50.0)
    println("Has room? ${squareCabin.hasRoom()}")
    // all operations to do with instanceName
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea()}")
    }
}

// ROUND HUNT
fun builderRoundHunt(){
    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: $buildingMaterial")
        println("Capacity: $capacity")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")

    }
}

// ROUND TOWER
fun  builderRoundTower() {
    val roundTower = RoundTower(4, 2, 15.0)
    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: $buildingMaterial")
        println("Capacity: $capacity")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")

    }
}

fun main() {
    builderSquareCabin()
    builderRoundHunt()
    builderRoundTower()

}