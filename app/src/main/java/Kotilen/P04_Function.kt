package Kotilen

class P04_Function {
}

// 04. Function
// - 함수란
//  - 어떤 input을 넣어주면 어떤 output으로 나오는 것

// - 함수 선언 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 .. ) : 반환형{
//          함수 내용
//          return 반환값
// }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

fun main(array: Array<String>) {
    plus(1, 2)
    println(plus(1, 2))
    val result = plus(5, 4)
    println(result)
    // 인수를 명시적으로 호출하는 방법
    val result1 = plus(first = 20, second = 30)
    println(result1)

    var result2 = plusFive(10, 20)
    var result3 = plusFive(10)
    println("result 2 : " + result2)
    println("result 3 : " + result3)
    print("printPlus : ")
    printPlus(10, 20);
    println("printShort : " + plusShort(20, 30))
    plusMany(1,2,3)
}

// 디폴트 값을 갖는 함수 만들기

fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
//   Unit은 생략 가능
    val res: Int = first + second
    println(res)
}

// 간단하게 함수를 선언하는 방법
// 코드 정렬 단축키 커맨드 + 옵션 + L
fun plusShort(first: Int, Second: Int) = first + Second

// 가변인자를 갖는 함수 선언하는 방법

fun plusMany(vararg number: Int){
    for(numbers in number){
        println(numbers)
    }
}