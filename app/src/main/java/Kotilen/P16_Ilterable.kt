package Kotilen

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    // 반복하는 방법(1)
    // for in 구문
    for (item in a){
        if(item <= 5){
            println("Less than Five")
        }else{
            println("more than five")
        }
    }

    // 반복하는 방법 2)
    // for in 반복문
    // index와 item을 둘 다 알고 싶을 때 변수명.withdIndex()
    for((index,item) in a.withIndex()){
        println("index : " + index + " value : " + item)
    }

    // 반복하는 방법 3) ForEach구문 사용
    a.forEach{
        it
        println(it)
    }
    println()
    a.forEach{ item ->
        println(item)
    }
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    // 반복하는 방법(6)
    println(a.size)
    for ( i in 0 until a.size){
        // untill은 마지막을 포함하지 않는다
        println(a.get(i))
    }

    for ( i in 0 until a.size step(2)){
        // step에 적어놓은 수만큼 반복한다.
        // i의 범위
        println(a.get(i))
    }

    for(i in a.size - 1 downTo (0)){
        // 8부터 0까지 출력
        println(a.get(i))
    }

    for(i in a.size -1 downTo (0) step (2)){
        println(a.get(i))
    }

    for(i in 0..10) {
        // untill과는 다름
        // for(i in 0 until 10) = 0~ 9까지
        // for(i in 0..10) = 0~10까지
        println(10)
    }

    // 반복하는 방법 (11)
    var k: Int = 0;
    var j: Int = 4;

    while(k < j){
        k++
        println("k : " + k)
    }
    k = 0;
    // 반복하는 방법 (12)
    do{
        println("hello")
        k++
    }while(k < j)

}
