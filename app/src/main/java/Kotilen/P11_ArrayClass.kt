package Kotilen

class P11_ArrayClass {

}
fun main(array: Array<String>){
    //배열을 생성하는 방법
    var number: Int = 10
    var group = arrayOf<Int>(1,2,3,4,number)
    println(group.get(4))

    // 방법2
    var number1: Int = 20
    var group1 = arrayOf(1,2,3,4,"sex")
    println(group1.get(4))

    //배열을 꺼내는 방법
    group1.get(1)
    //방법 2)
    println(group[4])

    //배열의 값을 바꾸는 방법
    group1.set(1,"sex") // set(index,value)
    println(group1[1])
}


