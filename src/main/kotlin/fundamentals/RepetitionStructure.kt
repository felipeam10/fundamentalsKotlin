package fundamentals

fun main() {
//    print1to10()
//    print10to1()
//    printTwoInTwoto10()
//    printRange(10, 20)
//    whileLessthen10()
    doWhileLessthen10()
}

fun print1to10(){
    for(numero in 1 .. 10){
        println(numero)
    }
}

fun print10to1(){
    for(numero1 in 10 downTo 1){
        println(numero1)
    }
}

fun printTwoInTwoto10(){
    for(numeroPar in 2 .. 10 step 2){
        println(numeroPar)
    }
}

fun printRange(start: Int, end: Int){
    for (numberInRange in start .. end){
        println(numberInRange)
    }
}

fun whileLessthen10(){
    var x = 0
    while (x < 10){
        println(x)
        x++
    }
}

fun doWhileLessthen10(){
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}


