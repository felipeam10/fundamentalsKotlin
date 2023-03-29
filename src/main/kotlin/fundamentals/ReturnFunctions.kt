package fundamentals

fun retornaNumeroPorExtenso(number: Int): String {
    if(number == 5){
        return "Five"
    } else if (number == 6){
        return "Six"
    }
    return "Number not mapped."
}

fun main() {
    println(retornaNumeroPorExtenso(12))
}