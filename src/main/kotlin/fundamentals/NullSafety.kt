package fundamentals

fun main() {
// -----------------------------------------------------------
//    var name : String? = null
//
////    if (name != null){
////        println(name.length)
////    }
//
////    val toShort : Short = name?.length?.toShort()
//    val toShort : Short = name!!.length.toShort()
// -----------------------------------------------------------

    // elvis operator -----> ?: -----> se a variavel for null, ele imprime zero

//    var nome : String? = null
//
//    var tamanho = nome?.length ?: 0
//
//        println(tamanho)

// -----------------------------------------------------------

    var lista : List<Int?> = listOf(1, 2, null, 4)
    println(lista)

    var listaNullable : List<Int?>? = null
    println(listaNullable)


}