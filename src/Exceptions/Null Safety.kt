package Exceptions

// Null safety - Tenta previnir erros de variáveis nulas, como NullPointerException, com ajuda de:
// ? - O "?" diz para o compilador tratar qualquer erro nulo que ocorrer. Imprimindo null e não deixando o programa quebrar.
// !! - O "!!" diz ao compilador que você "assume" qualquer erro que vier, caso haja alguma variável nula, ocorrerá um
// erro no código, ex: NullPointerException.

fun main() {
    val s: String? = null
    println(s?.length)
}