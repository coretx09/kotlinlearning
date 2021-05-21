package myapp

/*  Abstract class
les classes abstract sont toujours ouvertes; vous n'avez pas besoin de les marquer avec open.
 Les propriétés et méthodes d'une classe abstract ne sont pas abstract,
 sauf si vous les marquez explicitement avec le abstract mot - clé.
 Si les propriétés ou les méthodes sont abstraites, les sous-classes doivent les implémenter.

   Interfaces
les classes abstract peuvent avoir des constructeurs,
et les interfaces ne le peuvent pas, mais sinon elles sont très similaires.
Les interfaces ne peuvent avoir aucune logique de constructeur ni stocker aucun état
 */


/*abstract class AquariumFish {
    abstract val color: String
}*/

 interface FishAction {
    fun eat()
    fun bar(){/*implement method*/ println("impl FishAction")}
}

interface FishColor {
    val color: String
    fun bar()
}

/* Interface delegation:
 La délégation d'interface est une technique avancée où les méthodes d'une interface sont implémentées
 par un objet assistant (ou délégué), qui est ensuite utilisé par une classe.
 */
// pour fishColor
object GoldColor: FishColor {
    override val color = "gold"
    override fun bar() {/*implement methods*/println("impl fishColor")}
}
// pour fishAction
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println("eat $food")
    }


}

// class
class Shark: FishAction , FishColor  {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }

    override fun bar() {
        super<FishAction>.bar()
    }

}


class Plecostomus:
    FishAction by PrintingFishAction("algae"),
    FishColor by GoldColor {
    override fun bar() = super.bar()
}



