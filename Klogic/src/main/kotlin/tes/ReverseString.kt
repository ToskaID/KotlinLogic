package tes

fun main() {

    println(reverse1("agus dwi roy"))
    println(reverse2("agus dwi roy"))
    println(reverse3("agus dwi roy"))
}

fun reverse1 (string: String):String{
    var text = ""
    val length = string.length-1

    for(i in length downTo 0){
        text += string[i]
    }
    return text
}

fun reverse2(string: String):String{
    var text = ""

    val split = string.split(" ")
    val length = split.size-1

    for (i in length downTo 0){
        text += "${split[i]} "
    }

    return text
}

fun reverse3(string: String):String{
    var text = ""

    val split = string.split(" ")


    for (spl in split){

        val size  = spl.length-1
        for (i in size downTo 0){
            text += spl[i]


        }

    }

    return text
}