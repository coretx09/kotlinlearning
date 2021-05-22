package myapp

import java.lang.Math.PI

open class Aquarium(open var width: Int = 20, open var height: Int = 40, open var length: Int = 100) /*CONSTRUCTOR */ {
    /* Dans Kotlin, vous définissez le constructeur directement dans la déclaration de classe elle-même,
    en spécifiant les paramètres entre parenthèses comme si la classe était une méthode.

    La manière la plus compacte de Kotlin est de définir les propriétés directement avec le constructeur,
    en utilisant var ou val

    Vous devez marquer une classe comme open pour lui permettre d'être sous-classée.
    De meme pour les propriétés et les variables membres comme open, afin de les remplacer dans la sous-classe.
    */

    // Proprietes
    // Getter/setter des proprieties
    /*
     les getters sont utilisés pour obtenir la valeur de la propriété.
     les setters sont utilisés pour définir la valeur de la propriété.
     */
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape: String = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
    // Init Blocks
    /* Si votre constructeur a besoin de plus de code d'initialisation, il peut être placé dans un ou
       plusieurs init bloc*/
    init {
        println("INITIALIZING")
    }
    init {
        println("stop INIT")
    }
    // second constructor
    constructor(numberOfFish: Int, text: String, text2: String) : this() {
        width = 15
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    // Methods
    open fun printSize() {
        println(
            """
            width = $width
            height = $height
            length = $length
            volume = $volume
            Volume: $volume l Water: $water l (${water / volume * 100.0}% full)
        """.trimIndent()
        )
    }

}
// Sous-classes
// Class is open for inheritance
// Pour remplacer une propriété, utilisez le override mot - clé dans la sous-classe.
// Un membre marqué override est lui-même open , c'est-à-dire qu'il peut être remplacé dans les sous-classes.
// Si vous souhaitez interdire la redéfinition, utilisez final
    class TowerTank (override var height: Int, var diameter: Int):
    Aquarium(height = height, width = diameter, length = diameter) {
    // remplacer(overriding) proprietes
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
    // remplacement et appel de function de class base (super)
    override fun printSize() {
        println("class TowerTank")
        // appel function de base
        super.printSize()

    }
    /* Ordre initialisation des classe derives
      Lors de la construction d'une nouvelle instance d'une classe dérivée,
       l'initialisation de la classe de base est effectuée comme première étape
     */

        }

