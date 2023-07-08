package funcoes

fun main() {
    println(media(8f, 8f, 10f))
}

//vararg -> Faz com que a função tenha quantos parâmetros forem necessários para o momento, N parâmetros!
fun media(vararg notas: Float): Float {
    var soma = 0f
    for(n in notas) {
        soma += n
    }
    return (soma/notas.size)
}
