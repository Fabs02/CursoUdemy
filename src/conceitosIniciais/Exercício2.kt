package conceitosIniciais

fun main() {

    var nomeCompleto = "Fabricio Calvanese Augusto"
    var textoVazio: String

    val calcado: Byte = 42

    val pibBrasil: Long = 1869000000000
    val populacaoBrasil: Int = 211000000

    val pibPercapita = pibBrasil / populacaoBrasil

    println("O valor do pib percapita brasileiro é R$$pibPercapita")
}