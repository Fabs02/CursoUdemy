package poo

//convenção a classe começar com a letra maiúscula
class Pessoa(val anoNascimento: Int, var nome: String) {

    var olhos: String = ""

    fun acordar() {

    }

    fun dormir() {

    }
}

fun main() {
    //class -> Comportamentos e atributos

    //classe (instancia) gera -> objetos
    // () -> Significa instanciar uma classe, quando instanciamos, é criado um objeto.
    var pessoa: Pessoa = Pessoa(2002, "Fulano")

    println(pessoa.nome)

    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos = "Castanho"
}