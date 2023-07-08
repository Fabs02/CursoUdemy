package funcoes

fun main() {
    println(media2(false, 8f, 10f, "", true))

    arrayOf(1, 2, 4, false)// CTRL+B -> Definições. O arrayof é uma função que utiliza o vararg.
    "gsghewgsrdv".startsWith("gs")
}

//Generics -> Permite quantos parâmetros eu quiser e de qualquer tipo que eu quiser e sem dar erro na chamada.
//Geralmente representado por T, e deve estar entre <T>. Só consegue identificar o tipo da variável após a compilaçao,
//ou seja, durante a própria execução do programa.

//Se existe um vararg na sua função, ele precisa ser o último a ser declarado, pois, se for qualquer posição senão a última,
//o compilador não sabe quando ele vai terminar para que o J, por exemplo, seja chamado. 1 vararg por função.
fun <T, J> media2(abc: J, vararg notas: T): Float {
    var soma = 0f
    for(n in notas) {
        if(n is Float) {
            soma += n
        }
    }
    return (soma/notas.size)
}