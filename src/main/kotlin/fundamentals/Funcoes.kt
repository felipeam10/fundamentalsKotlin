package fundamentals

fun main() {
    println("Hello World")

    println(retornaNome())

    var name = retornaNome1()
    println(name)

    sayHello("Felipe", 120)
    sayHello(retornaNome1(), 200)
    sayHello(age = 112, name1 = "Matusalen")

    sayHello1("IdadeFixa") 
}

fun retornaNome(): String{
    return "Felipe"
}

fun retornaNome1(): String{
    return "Felipe1"
}

fun sayHello(name1: String, age: Int) {
    println("Hello ${name1}, congrats for yous ${age} years old")
}
fun sayHello1(name2: String, age: Int = 20) {
    println("Hello ${name2}, congrats for yous ${age} years old")
}