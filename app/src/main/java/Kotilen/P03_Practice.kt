package Kotilen

class P03_Practice{
}

var a = 1+2+3+4+5 // 연산의 결과값을 변수에 넣을 수 있음
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My Name is $e Nice to meet you"
// 문자열내에 변수를 넣고싶을 때에는 $변수명

// null
// - 존재하지 않는다.

//var abc : Int = null -> 널값을 가질 수 없다
var abc : Int? = null // -> null을 가질수 있음

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c) // Int toInt
    println(d) // float toFloat
    println(f)
    println(e)

}