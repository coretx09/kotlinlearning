package algorithm


fun sendEmail(email:String?): String{
    return email?.let{
        println(it)
    it} ?: "invalidEmail"

}
fun main(){

}