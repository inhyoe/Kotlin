package P17_Kotilen.SelfCoding

class Number3 {

}

fun main() {
    // 전달받은 숫자의 각 자리 숫의 합을 구하자
    var arr = intArrayOf(12,42,53,51,64,85,99)

    for(i in 0 until arr.size){
        var sum: Int = 0;
        var x : Int = 0;
        sum = arr[i] % 10; // 1의자리
        x = sum + arr[i]/10
        println( "$i 번째 수의 각 자리 합은 " + x)
        sum = 0;
        x = 0;
    }

}

fun third(number: Int):Int {
    var sum: Int = 0;
    var x: Int = 0;
    sum = number % 10; // 1의자리
    x = sum + number / 10
    return x
}
