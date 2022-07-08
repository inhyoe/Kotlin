package Kotilen

class P06_Operater {

}

// 06 연산자
// 산술연산자
// +,-,*,/ (나누기),% (나머지)


// 논리 연산자
// True || False = true

fun main(array: Array<String>){
    // 산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var d = 20 / 3
    var  e = 20 % 3
    println(a)
    println(b)
    println(d)
    println(e)

    // 복합 대입 연산자( 단항연산자 )
    a += 10
    println(a)

    var g = a> b
    var h = a == b
    println(g)
    println(h)


}
