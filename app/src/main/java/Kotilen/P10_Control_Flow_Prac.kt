package Kotilen

class P10_Control_Flow_Prac {
}


fun main(args: Array<String>){
    val value: Int? = null
    when(value){
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = true

    when(value2){
        true ->{
            println("true")
        }
        false ->{
            println("false")
        }
        null -> {
            println("null")
        }
    }
    // 값을 리턴하는 when 구문의 경우 반드시 값을 리턴해야한다
    val value3 = when(value2){
        true -> println(1)
        false -> println(2)
        else -> println("else")
    }
    val value4: Int = 10
    // When의 다양한 조건식
    when(value4){
        is Int -> {
            println("value4 is Int")
        }else ->{
            println("value4 isnot Int")
        }
    }

    // when의 다양한 조건식 (2)
    val value5: Int = 71
    when(value5){
        in 60.. 70 ->{
            println("60~70")
        }
        in 70.. 80 ->{
            println("70~80")
        }
        in 80.. 90 ->{
            println("80~90")
        }
        else ->
            println("nope")
    }

}
