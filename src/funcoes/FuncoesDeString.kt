package funcoes

fun main() {
    val str = "Programação em Kotlin."

    println("Tamanho da string: ${str.length}")// Mostra o tamanho da string.
    println("Posição (index) 0 da string: ${str[0]}")// Mostra o char no index indicado.

    println(str.startsWith("Pro", false))// Verifica se a string começa com.
    println(str.endsWith("abc"))// Verifica se a string termina com.

    println(str.substring(1, 4))// Primeiro pulo um número de espaços e depois pega a próxima letra até o index indicado.
    println(str.replace("Kotlin.", "Kotlin é show!"))// Substitui um valor por outro.

    println(str.lowercase())// Coloca a string inteira em minúsculo
    println(str.uppercase())// Coloca a string inteira em maiúsculo

    println("      meu nome é         ".trim()) //Tira os espaços em branco no começo e no fim da string.
                                                //Muito usado em formulários, caso o usuário aperte o espaço sem querer.
}