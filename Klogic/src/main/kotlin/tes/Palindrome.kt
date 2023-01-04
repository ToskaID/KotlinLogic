package tes

fun main() {

    println(palindorme("katak"))
    println(palindorme("buku"))

}

fun palindorme(string:String):Boolean{


    var reverse = ""
    val length = string.length-1
    for (i in length downTo 0){
        reverse += string[i]
    }
    return reverse.equals(string)
}