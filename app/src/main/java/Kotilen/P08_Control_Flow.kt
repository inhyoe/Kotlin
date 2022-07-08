package Kotilen



class P08_Control_Flow {
}

fun main(args: Array<String>){
    val a: Int = 5
    val b: Int = 10
    if(a > b){
        println(1)
    }else{
        println(2   )
    }

    // 엘비스 연산자 -> 코틀린의 특수한 문법
    // 활용 할 수록 좋음
    val number: Int? =
//        null
      100
    val number2 = number ?: 10

    val number3: Int?= null
    val number4 = number3 ?: 20
    println(number2)
    println(number4)


    // if문은 무조건 리턴하는 값이 있어야함.
    val num1: Int = 10
    val num2: Int = 20
    val num3: Int = 30

    val max = if( num1 > num2){
        println(num1)
    }else{
        println(num2)
    }
    val max2 = if( num1 > num2){
        println(num1)
    }else if(num1 == num2){ // error
        println(num2)
    }else{
        println(num3)
    }

}