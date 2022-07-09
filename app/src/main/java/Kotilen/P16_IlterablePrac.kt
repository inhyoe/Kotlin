package Kotilen

class P16_1_Ilterable {
}

fun main() {
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

//    for(item in a){
//        println(item)
//    }

    for((index,item) in a. withIndex()){
        println(" index : "+index + "value : " + item)
    }
    println("=============forEach==================")
    a.forEach {
        print(it)
    }
    println()
    println("============== for( i in 0 until a.size) =============")
    for( i in 0 until a.size){
        print(i)
    }
    println()
    println("==========for(i in 0 until a.size step(2))==========")
    for(i in 0 until a.size step(2)){
        print(i)
    }
    println()
    println("==========for(i in a.size -1 downTo (0))===========")
    for(i in a.size downTo (0)){
        print(i)
    }
    println()
    println("==========for(i in 0..10)===========")
    for(i in 2..a.size){
        print(i)
    }

}