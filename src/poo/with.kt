package poo

fun main() {

    val pessoaCriadaParaExecutarTestes = Pessoa(1995, "Fabricio")
    pessoaCriadaParaExecutarTestes.acordar()
    pessoaCriadaParaExecutarTestes.dormir()


    // O with serve para chamar métodos de uma maneira mais compacta, caso o nome da variável seja muito verbosa.
    with(pessoaCriadaParaExecutarTestes) {
        acordar()
        dormir()
    }
}