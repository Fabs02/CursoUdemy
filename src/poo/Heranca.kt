package poo

// Classe pai, classe mãe.
open class Eletronico (var marca: String) {

    fun ligar() {

    }

    fun desligar() {

    }
}

// Classe filha, a classe que herdou.
class Computador (marca: String) : Eletronico(marca) {

    fun instalarSoftware() {

    }

    fun processar() {

    }
}



fun main() {
    var c: Computador = Computador("DELL")

    c.ligar()
    c.desligar()
}