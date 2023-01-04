package Siku

fun main() {

    sikuKananAtas(5)
}

fun sikuKananAtas(n:Int){

    for (i in n downTo 1){

        for (k in 1..n-i){
            print(" ")
        }
        for (j in 1..i){
            print("*")
        }
        println()
    }
}