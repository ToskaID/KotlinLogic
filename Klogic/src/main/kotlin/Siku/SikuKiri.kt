package Siku

fun main() {

    sikuKiri(5)

}

fun sikuKiri(n:Int){

    for (i in 1..n){


        for (j in 1..i){
            print("*")
        }
        println()
    }
}