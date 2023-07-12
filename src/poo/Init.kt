package poo

class Animal(var especie: String) {
    // Init é um código que é executado quando a classe é instânciada. Pode haver vários blocos de init.
    var fala: String = ""
    init {
        if (especie == "cachorro") {
            fala = "Au!"
        } else if (especie == "gato") {
            fala = "Miau!"
        } else {
            ""
        }
    }
    fun falar() {
        println(fala)
    }
}

fun main() {
    Animal("cachorro").falar()
}