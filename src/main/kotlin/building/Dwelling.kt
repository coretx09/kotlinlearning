/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */

package building

import kotlin.math.PI
import kotlin.math.sqrt

// RACINE
abstract class Dwelling(private var residents: Int) {
    //Property & functions must be initialized or be abstract
    abstract val buildingMaterial: String
    abstract val capacity: Int // nombre de personnes pouvant y vivre
    fun hasRoom(): Boolean {
        return residents < capacity
    }
    // abstract function
    abstract fun floorArea(): Double
    // initialized function
    fun getRoom () {
        if (capacity > residents) {
            residents++
            println("you get a room")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }

}

// SQUARE CABIN
// Implemented Dwelling
class SquareCabin(residents: Int, private val length: Double): Dwelling(3) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArea(): Double {
        return length * length
    }
}

// ROUND HUNT
// open for inherit
open class RoundHut(residents: Int, private val radius: Double): Dwelling(4) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }
}

// ROUND TOWER
// override for modified
class RoundTower(residents: Int, private val floors: Int = 2, radius: Double): RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = super.capacity * floors
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }

}