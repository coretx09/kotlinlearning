package scrollableList

//  créez un programme Kotlin qui permet de commander différentes combinaisons d'aliments.

open class Item(val name: String, val price: Int)

/* Le Noodles constructeur de classe ne prend aucun paramètre, mais étend Item
et appelle le constructeur de superclasse en lui transmettant "Noodles"le nom et le prix de 10 */
class Noodles : Item("Noodles", 10) {
    /* Lorsque vous imprimez une instance d'objet sur la sortie, la toString()méthode de l'objet est appelée
     Vous devez remplacer toString()pour renvoyer quelque chose de plus significatif   */
     override fun toString(): String {
        return name
    }
}

/* Le Vegetables constructeur de classe prend comme paramètres vararg
 vararg modificateur vous permet de passer un nombre variable d'arguments du même type dans une fonction ou un constructeur.
 Un seul paramètre peut être marqué comme vararg et est généralement le dernier paramètre de la liste. */
class Vegetables(private vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        // si aucune garniture n'est transmise
        return if (toppings.isEmpty()) {
            "$name : Chef's choice"
        }
        /* joinToString() méthode pour joindre toutes les garnitures en une seule chaîne.
             Pour spécifier un séparateur différent d'une virgule, transmettez la chaîne de séparation souhaitée
              en tant qu'argument de la joinToString() */
        else {
            name + ": " + toppings.joinToString("/\\ ")
        }

    }
}

// Class de commande
class Order(private val orderNumber: String) {
    // variable de classe de niveau supérieur pouvant contenir des éléments de type Item (instances, sous-classe).
    private val itemList = mutableListOf<Item>()

    // Methodes
    fun addItem(newItem: Item) {
        itemList.add(newItem)
    }

    fun addAll(newItems: List<Item>) {
        itemList.addAll(newItems)
    }

    fun print() {
        println("Order #$orderNumber")
        var total = 0
        for (item in itemList) {
            println("$item: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
        println()
    }
}

fun main() {
    //instances d'objets Noodles
    val noodles = Noodles()
    //instances d'objets Vegetables
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()
    // la methode toString est appelée
    println(noodles)
    println(vegetables)
    println(vegetables2)

    // instances d'objets Order
    val order1 = Order("1")
    order1.addItem(Noodles())
    order1.addItem((vegetables))
    order1.addItem(Vegetables("bananes"))
    order1.print()

    val order2 = Order("2")
    order2.addAll(listOf(vegetables, Vegetables("orange", "orange")))
    order2.print()

}