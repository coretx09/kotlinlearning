// import Scanner class from Java standard library using, for input of other data types
import java.util.Scanner

fun main(args: Array<String>){

    // OUTPUT KOTLIN :
    // function readLine() which is used for reads line of string input from standard input stream.
    print("your name : ")
    var nameEnter = readLine()


    while(true){
        println("your name is $nameEnter YES/NO? ")
        var nameConfirm = readLine()
        if (nameConfirm == "yes"){
            println("все Nice ")
            break
        }
        else if (nameConfirm == "no"){
            println("???")
            print("your name is : ")
            nameEnter = readLine()
        }
        else {
            println("try again")

        }
        when (nameConfirm){
            "no" -> "your name is "
        }

    }

    // function readLine() for Integer
    //var nameConfirmed = readLine()
    println("your age: ")
    var ageUser = Integer.valueOf(readLine())
    println("name: $nameEnter and age: ${ageUser + 1}")

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)  //reader object of Scanner class is created.

    //the nextInt() method is called which takes integer input from the user
    print("your size: ")
    var sizeUser = reader.nextFloat()
    println(sizeUser)

}

