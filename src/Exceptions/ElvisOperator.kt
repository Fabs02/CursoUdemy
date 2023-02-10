package Exceptions

fun main() {

    val str: String? = null

    if(str == null) {
        println("Nulo")
    } else {
        println(str)
    }

    /* Operador elvis analisa a variável da esquerda e, caso seja nula, executa o que está na direita. na direita pode
    haver qualquer instrução, uma string, int, até mesmo funções.
     */
    println(str ?: "Nulo")

}