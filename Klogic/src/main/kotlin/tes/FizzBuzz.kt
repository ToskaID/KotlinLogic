package tes

fun main() {
    println(fizzBuzz(15))
}

fun fizzBuzz(n:Int):String{

    var data = ""

    for (i in 1..n){
        if (i % 3 == 0 && i % 5 == 0){
            data += "FizzBuzz\n"
        }else if( i % 3 == 0){
            data += "Fizz\n"
        }else if(i % 5 == 0){
            data += "Buzz\n"
        }else{
            data += "$i\n"
        }
    }
    return data
}