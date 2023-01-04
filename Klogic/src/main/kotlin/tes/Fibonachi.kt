package tes

fun main() {

    println(fibo(5))
}

fun fibo(n:Int){

    var fn = 1
    var fn_1= 1
    var fn_2 =0

    for (i in 0..n){
        println("fn $i = $fn_2")
        fn = fn_1 + fn_2
        fn_2 = fn_1
        fn_1 = fn
    }
}