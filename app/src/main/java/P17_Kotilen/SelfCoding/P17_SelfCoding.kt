package P17_Kotilen.SelfCoding

fun main(array: Array<String>) {
    first()
    println("Second : "+secondFun(80))
    println("Third : "+third(89))
    gugudan()
}



fun second(score: Int): String{

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
