package Kotilen

class P09_Control_Flow_When {

}

fun main(args: Array<String>){
    val value: Int = 3
    when(value){
//     case문과 비슷함
        1 ->{
            println("value is 1")
        }
        2 ->{
            println("value is 2")
        }
        3 ->{
            println("value is 3")
        }
        else ->{
            println("I Don't Know about that" )
        }
    }

    if(value == 1){
        println("value is 1")
    }else if(value == 2){
        println("value is 2")
    }else if(value == 3){
        println("value is 3")
    }else{
        println("Fuck You")
    }

    val value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)

}