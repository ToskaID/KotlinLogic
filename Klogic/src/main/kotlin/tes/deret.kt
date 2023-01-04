package tes

fun main() {

    println(deret(5))
}

fun deret(n:Int):String{

    var data = 1
    var bil = ""

    for (i in 1..n-1){

        bil += "${i} * "
        data *= i
    }
    return "${bil}$n = ${data * n}"
}