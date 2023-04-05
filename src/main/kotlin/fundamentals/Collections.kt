package fundamentals

fun main() {

//    var lista = listOf(1, 2, 3, 4, 5, 6)
//    val pares = lista.filter { it % 2 == 0 }.first()
//    println(pares)

//    lista.forEach{
//        println(it)
//    }

//    for (numero in lista){
//        println(numero)
//    }

//    println(lista[0])
//    println(lista.get(3))
//    println(lista.size)
//    println(lista.indexOf(6))

//    ------------------------------------------

//    var lista = mutableListOf(6, 2, 5, 4, 3, 1, 1)
//    println(lista)

//    lista.add(8)
//
//    lista.removeAt(5)
//
//    lista[0] = 200

//    lista.sort()
//    println(lista)
//
//    lista.shuffle()
//    println(lista)

//    ------------------------------------------

//    var listaNomes = mutableListOf("Palmeiras", "Santos", "Cruzeiro")
//    println(listaNomes)
//    listaNomes.sort()
//    println(listaNomes)

//    ------------------------------------------

//    var setNumeros = setOf(1, 2, 2, 3) //nao imprime numeros duplicados
//    println(setNumeros)
//    println(setNumeros.contains(1))

//    ------------------------------------------

    var mapNomeIdade = mutableMapOf("Felipe" to 38, "Lidiane" to 36)
    println(mapNomeIdade)

//    mapNomeIdade.put("Cecilia", 3)
    mapNomeIdade["Cecilia"] = 400
    println(mapNomeIdade)

    mapNomeIdade.remove("Felipe")
    println(mapNomeIdade)

    mapNomeIdade["Cecilia"] = 100
    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Felipe", 36)
    println(mapNomeIdade)
}