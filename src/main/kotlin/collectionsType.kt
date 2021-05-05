

fun main(args: Array<String>) {


    //MAKE LISTS:
    // Lists are a fundamental type in Kotlin, and are similar to lists in other languages.

    /*Notez que la modification d'une collection mutable ne nécessite pas qu'elle soit une var
      Cependant, si vous essayez de réaffecter une val collection, vous obtiendrez une erreur de compilation.
     */

    // MUTABLE LIST (mutableListOf):  Il étend l'interface de liste et vous permet d'ajouter et
    // de supprimer des éléments.
    
    val listStudent = mutableListOf("sauvet", "kivi", "eric", 45, 65.9)
    println(listStudent)
    println("""
        add element: (${listStudent.add("mars")}) $listStudent 
        add all element: (${listStudent.addAll(1, listOf(1, 2))} $listStudent
        replace element set: ${listStudent.set(7, "ngampio")} $listStudent
        
        remove element: (${listStudent.remove(65.9)} ) $listStudent
        remove element by index: (${listStudent.removeAt(1)}) $listStudent
        
        index of element : ${listStudent.indexOf(45)}
        element at index : ${listStudent.elementAt(3)}
        
        number count : ${listStudent.count()}
        
    """.trimIndent())
    // listStudent = mutableListOf("yt") ERROR

    var listVar = mutableListOf("gf", "tr", 54)
    listVar = mutableListOf(0)
    println(listVar)
    listVar.add(0, 2 )
    println(listVar)
    println(listVar.size)


    // IMMUTABLE LIST (listOf): permet de récupérer des données à l'aide de diverses méthodes
    
    val presentStudent = listOf("jean", "Marc", "jean")
    println("liste des eleves present: $presentStudent")
    println("""
        size: ${presentStudent.size}
        get(1) : ${presentStudent[1]}
        first element : ${presentStudent.first()}
        last index : ${presentStudent.lastIndex}
        verified element : Marc in class =  ${presentStudent.contains("Marc")}
        index of element : jean index = ${presentStudent.indexOf("jean")}
        index of lastElement : jean index = ${presentStudent.lastIndexOf("jean")}
        
    """.trimIndent())


    // ARRAYS (arrayOf) : there is no mutable version of an Array.

    //Un tableau déclaré avec arrayOf n'a pas de type associé aux éléments
    //Déclarez un tableau de chaînes à l'aide de arrayOf.
    val nameSchool = arrayOf("hse", "polytex", "hvu")

    // Utilisez  java.util.Arrays.toString() utilitaire de matrice pour l'imprimer.
    println(java.util.Arrays.toString(nameSchool))

    //ou (contentTostring) Renvoie une représentation sous forme de chaîne du contenu du tableau
    // spécifié comme s'il s'agissait de List
    println(nameSchool.contentToString())
    
    // ARRAYS WITH TYPE :
    /*Vous pouvez également déclarer des tableaux avec un type pour tous les éléments.*/
    val tabType = intArrayOf(3, 6, 6, 5)
    println(tabType.contentToString())


    // Another option is to use the Array constructor
    // that takes the array size and the function that returns values of array elements given its index
    // Creates an Array<String>
    val asc = Array (5) {i -> (i * 2).toString()}
    println(asc.contentToString())
    asc.forEach { print(it)}
    println()
    
    //Primitive type arrays
    // Array of int of size 3 with values [0, 0, 0]
    val arr1 = IntArray(3)
    println(arr1.contentToString())

    // e.g. initialise the values in the array
    val arr2 = LongArray(5) {(it * 5).toLong() } //it fait référence à l'index du tableau
    println(arr2.contentToString())


    // BOUCLE:
    val myTable = arrayOf("qg", "pdg", "dg")
    for (i in myTable) print("$i ")
    println()

    // Parcourir les éléments et les index en même temps:
    for((index, element) in myTable.withIndex()) {
        println("Item at $index is $element")
    }


}