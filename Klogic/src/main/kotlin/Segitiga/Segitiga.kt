package Segitiga

fun main() {

    segitiga(5)
}

fun segitiga(n:Int){

    for (i in 1..n){

        for (k in 1..n-i){
            print(" ")
        }
        for (j in 1..i + (i-1)){
            print("*")
        }
        println()
    }
}