package Kotilen

class P14_Collection {

}

// 14. Collection
// -> list,set,map


fun main() {
    //List

    // Immutable collection 값을 수정할 수 없다.
    val numberList = listOf<Int>(1,2,3,3) // int만 담을 수 있는 list
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])
    // 중복을 허용한다


    //Set
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    numberSet.forEach {
        it
        println(it)
    }
    // 중복을 허용하지 않는다, 순서가없다 Index가 없음.

    //Map -> Key : value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("One" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.get("One"))
    // Key값은 : One / value : 1


    //Mutable Collection (변경 가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println(mNumberList)
    println(mNumberList.get(3))

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
//  Set은 index가 없기 때문에 적어줄 필요가 없음
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)

}