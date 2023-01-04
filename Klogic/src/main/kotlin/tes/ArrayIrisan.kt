package tes

fun main() {

    irisan(intArrayOf(1,2,3,4,5), intArrayOf(4,5,6,7,8))

}

fun irisan(array1:IntArray, array2:IntArray){

    for (data1 in array1){
        for (data2 in array2){
            if (data1 == data2){
                println("$data1")
            }
        }
    }
}