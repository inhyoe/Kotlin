package Kotilen

class Variable_01 {
}

// 01 . Variable -> 변수
//  - 내 마음대로 원하는 것으르 넣을 수 있는 상자 -> Variable
//  - 한번 넣으면 바꿀 수 없는 상자 -> Value

// 변수 선언방법
// var/val 변수명 = 값
// Variable/Value

var num = 10
var hello = "Hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){
    println(num)
    println(hello)
    println(point)
    println(20)

    num = 100
    hello = "Good Bye"
    point = 10.4
//    fix = 20
    println(num)
    println(hello)
    println(point)
    println(fix)
}