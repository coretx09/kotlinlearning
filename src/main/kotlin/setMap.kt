fun main(args: Array<String>) {

    // Set
    // Set<T> stocke des éléments uniques; leur ordre n'est généralement pas défini.
    val numbers = setOf(1, 2, 3, 54, 32)
    val numbers2 = setOf(1, 54, 32, 2, 3)
    println("""
        $numbers
        $numbers2
        ${numbers == numbers2}
        ${numbers.size}

    """.trimIndent())

    // MutableSet
    // MutableSet est un Set avec des opérations demerit à partir de MutableCollection
    // MutableCollection<T>est un Collection avec des opérations d'écriture, telles que add et remove..

    val num1 = mutableSetOf("moi", 34, 76, "toi")
    println("""
        add 5 : ${num1.contains(1)}
        
    """.trimIndent())


    // Map
    // Map<K, V>n'est pas un héritier de  Collection
    
    val map1 = mapOf("name" to "sauvet", "age" to 25, "city" to "spb")
    println("""
        all keys: ${map1.keys}
        all values: ${map1.values}
    """.trimIndent())

    // mutableMap:
    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
    numbersMap.put("three", 3)
    numbersMap["one"] = 11
    println(numbersMap)

    val myMap = mutableMapOf("name" to "1", "city" to "spb")
    myMap["status"] = "no"
    println(myMap)
    

    /*val mapTest = mutableMapOf("name" to "sauvet", "age" to 25, "city" to "spb")
    mapTest["age"] = 26
    println(mapTest) */




}