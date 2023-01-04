package Siku

fun main() {

    sikuKiriAtas(5)
}

fun sikuKiriAtas(n:Int){

    for (i in n downTo 1){

        for (j in 1..i){
            print("*")
        }
        println()
    }
}