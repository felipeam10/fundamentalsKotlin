package fundamentals

fun main() {
//    parOuImpar(2)
//    parOuImpar(3)
//    resultadoDaNota(8)
    println(parOuImparNew(2))
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0){
        println("Par")
    } else {
        println("Impar")
    }
}

fun parOuImparNew(numero: Int): String {
    return if (numero % 2 == 0){
        "Par"
    } else {
        "Impar"
    }
}

//se nota >= 6 -> passou
//se nota > 4 -> recuperacao
//se nota < 4 -> reprovado

fun resultadoDaNota(nota: Int) {
    if (nota >= 6){
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperacao")
    } else {
        println("Reprovado")
    }
}