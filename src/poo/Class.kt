package poo

// Convenção a classe começar com a letra maiúscula
// Parâmetros com valores default.
class Pessoa(val anoNascimento: Int, var nome: String) {

    var doc: String? = null
    // Aqui no construtor pode haver lógica, como if por exemplo. Nos parâmetros acima com valor default, não tem lógica.
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }

    fun acordar() {

    }

    fun dormir() {

    }
}

fun main() {

    //class -> Comportamentos e atributos

    //classe (instancia) gera -> objetos
    // () -> Significa instanciar uma classe, quando instanciamos, é criado um objeto.
    var pessoa: Pessoa = Pessoa(2002, "Fulano", "wegsdf32r23")

    println(pessoa.nome)

    // this -> Se refere ao objeto

    pessoa.acordar()
    pessoa.dormir()
    pessoa.doc
}