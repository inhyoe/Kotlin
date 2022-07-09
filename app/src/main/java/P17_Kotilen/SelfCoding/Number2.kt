package P17_Kotilen.SelfCoding

class Number2 {
}

fun main() {
//    var score = intArrayOf(20,30,60,79,80,90,89)
//
//    for(i in 0 until score.size){
//        if(score[i] >= 80 && score[i] <= 90){
//            println("A")
//        }else if(score[i] >= 70 && score[i] < 80){
//            println("B")
//        }else if(score[i] >= 60 && score[i] < 70){
//            println("C")
//        }else{
//            println("F")
//        }
//
//    }
    print(second(89))
}

fun secondFun(score: Int): String{

        if(score >= 80 && score <= 90){
            return "A"
        }else if(score >= 70 && score< 80){
            return "B"
        }else if(score >= 60 && score < 70){
            return "C"
        }else{
            return "F"
        }

    }
