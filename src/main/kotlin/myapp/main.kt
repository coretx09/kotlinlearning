package myapp

fun buildAquarium() {
    // aq 1
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.width = 65
    // aq 2
    val aquarium2 = Aquarium(29,"yt", "yt")
    aquarium2.printSize()
    aquarium2.volume = 70
    aquarium2.printSize()
    // aq 3
    val aquarium3 = Aquarium(25, 40, 25)
    aquarium3.printSize()
    // tower 1
    val myTower = TowerTank(40, 25)
    myTower.printSize()

}

fun main(args: Array<String>) {
    buildAquarium()



}