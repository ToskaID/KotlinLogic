package Segitiga

fun main() {

    segitigaKebalik(5)
}

fun segitigaKebalik(n:Int){

    for (i in n downTo 1){

        for (k in 1..n-i){
            print(" ")
        }
        for (j in 1..i+(i-1)){
            print("*")
        }
        println()
    }
}