package Segitiga

fun main() {

    duaBintang(5)
}

fun duaBintang(n:Int){

    for (i in 1..n){

        for (k in 1..n-i){
            print(" ")
        }
        for (j in 1..i){
            print("* ")
        }
        println()
    }
}