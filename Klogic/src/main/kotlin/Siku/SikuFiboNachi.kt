package Siku

fun main() {

    sikuFibonachi(10)
}

fun sikuFibonachi(n:Int){

    for (i in 1..n){

        var fn = 1
        var fn_1 =1
        var fn_2 = 0

        for (j in 1..i){
            print("$fn_2 ")
            fn = fn_1 + fn_2
            fn_2 = fn_1
            fn_1 = fn
        }
        println()
    }
}