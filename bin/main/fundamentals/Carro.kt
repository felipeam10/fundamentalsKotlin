package fundamentals

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono)

data class Dono(var nome: String, var idade: Int)

fun main() {
    var carro = Carro("Branco", 1996, Dono("Felipe", 1984))

    println(carro.cor)
    carro.cor = "Preto"
    println(carro.dono.nome)

    carro.dono.nome = "fulano"
    println(carro.dono)
}