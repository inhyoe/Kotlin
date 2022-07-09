package Kotilen

fun main() {
    val array = arrayOf<Int>(1,2,3,4)
    val number = array.get(0)
    println(number)

    array.set(0,100)
    val number1 = array.get(0);

    println(number1)



//    val number2 = array.set(100,100);
//  Array Bound
//    처음 만들때 결정됨
    // Array 사이즈가 벗어남
//    println(number2)

//    Array를 만드는 방법(3)
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('a','b','c')
    // 일반 배열은 다른 문자형도 들어갔던것과달리
    // 이 배열은 받지 못한다

//   Array를 만드는 방법(4) -> lambda를 활용한 방법
//   반드시 알아야 하는 것은 아님
    val a5 = Array(10,{ 0 })
    var a6 = Array(5,{1;2;3;4;5;})
//  내부는 ;을 사용
}