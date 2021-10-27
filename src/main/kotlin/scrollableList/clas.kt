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

    /* Methodes
     Le Builder Pattern est un modèle de conception en programmation qui vous permet de construire un objet complexe
     dans une approche étape par étape.
     méthodes addItem() et addAll() de la Order classe, retourne le fichier Order.
     */
    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
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
    val ordersList = mutableListOf<Order>()

    val order1 = Order("1")
    order1.addItem(Noodles())
    order1.addItem((vegetables))
    order1.addItem(Vegetables("bananes"))
    order1.print()
    ordersList.add(order1)

    val order2 = Order("2")
    order2.addAll(listOf(vegetables, Vegetables("orange", "orange")))
    order2.print()
    ordersList.add(order2)

    /* BUILDER PATTERN
     Bien qu'il ne soit pas obligatoire d'enchaîner ces appels, il s'agit d'une pratique courante
      et recommandée qui tire parti de la valeur de retour de la fonction. */
    val order4 = Order("4").addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
    order4.print()
    ordersList.add(order4)

    //pas besoin de stocker la commande dans une variable
    ordersList.add(
        Order("5")
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach")))

    for (order in ordersList) {
        order.print()
        println()
    }

}