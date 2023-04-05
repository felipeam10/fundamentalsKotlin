package fundamentals

class MyClass(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun createWithDefaultValue(): MyClass {
            return MyClass("Felipe", "Rua Teste", 400)
        }
    }
}

class MySecondClass(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun createWithDefaultValue(): MySecondClass {
        return MySecondClass("Felipe2", "Rua2 Teste", 401)
    }
}

fun main() {
    var MySecondClass = MySecondClass("name", "adress", 111).createWithDefaultValue()

    var MyClass = MyClass.createWithDefaultValue()
    println(MyClass.nome)
}