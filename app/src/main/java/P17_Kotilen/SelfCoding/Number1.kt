package P17_Kotilen.SelfCoding

fun main() {
    // 1번
    // List를 두개 만듬
    // 첫번째 ArrayList에는 0 ~ 9까지 반복문을 사용하여 값을 입력
    // 두번째 ArrayList에는 첫번빼 ArrayList의 값을 하나씩 확인한 후
    // 짝수면 True 홀수면 False를 넣어준다.


    var FirstNum = IntArray(10, { 0 })
    var SecondNum = BooleanArray(10, { false })
    println(FirstNum.size)
    for (i in 0 until FirstNum.size) {
        FirstNum[i] = i
    }
    for (i in 0 until FirstNum.size) {
        println(FirstNum.get(i))
    }

    for (i in 0 until FirstNum.size) {
        if (FirstNum.get(i) % 2 == 0) {
            SecondNum[i] = true
        } else {
            SecondNum[i] = false
        }
    }
    for (i in 0 until SecondNum.size) {
        println(" "+i+" "+SecondNum.get(i))
    }
}


fun first(){
    var FirstNum = IntArray(10, { 0 })
    var SecondNum = BooleanArray(10, { false })
    println("FirstNum의 크기 : "+FirstNum.size)
    for (i in 0 until FirstNum.size) {
        FirstNum[i] = i
    }
    print("FirstNum의 원소 : ")
    for (i in 0 until FirstNum.size) {
        print(FirstNum.get(i))
    }
    println()
    for (i in 0 until FirstNum.size) {
        if (FirstNum.get(i) % 2 == 0) {
            SecondNum[i] = true
        } else {
            SecondNum[i] = false
        }
    }
    for (i in 0 until SecondNum.size) {
        println(" "+i+" "+SecondNum.get(i))
    }
}