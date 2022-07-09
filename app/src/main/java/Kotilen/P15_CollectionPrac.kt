package Kotilen

class P15_CollectionPrac {
}

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)

    a.add(0,100) // 원소 추가하기
    println("a.add : "+a)
    a.set(0,200) //원소 바꾸기
    println("a.set : "+a)
    a.removeAt(1) // 원소 삭제하기
    println("a.removeAt : "+a)

    println("=========mutableSetof==============")
    val b = mutableSetOf<Int>(1,2,3,4)
    println(b)
    b.add(5)
    println("b.add(2)"+b)
    b.remove(2)
    println("b.remove(2)"+b)
    b.remove(100) // 원소가 없다면 내버려둠
    println("b.add(100)"+b)

    println("=========mutableMapof==============")
    val c = mutableMapOf<String,Int>("one" to 1)
    c.put("two",2) // 원소 추가하기
    println("c.put(\"two\",2) : "+c)
    c.replace("two",3)
    println("c.replace(\"two\",3) : "+c)
    println(c.keys) // key만 출력하기
    println(c.values) // value만 출력하기
    c.clear() // 모든원소 삭제하기
    println(c)

}