

fun main(args: Array<String>){

    print("gf")
    println("force")
    println("merci")
    fun playerName(name: String = "Steve") = name
    playerName("jean")
    val names = playerName("Cris")
    println(names)

    fun operations(
        numberSerial: String,
        numberPasseport: Int,
        yourName: String,
        city: String
    ): String{
        println(yourName)
        println("${numberSerial.toUpperCase()}.$numberPasseport")
        println(city)
        return "$numberSerial $numberPasseport"
    }
    val personalInfos = operations("oa", 675432, "sauvet",
    "brazzaville")
    println(personalInfos)

    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Byte.MAX_VALUE)

}