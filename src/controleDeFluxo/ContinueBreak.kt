package controleDeFluxo

fun main() {

    var i = 0
    while (i < 100) {

        if (i == 50) {
            break
            // O break finaliza o laço de repetição, neste caso, ao atender o requisito de 50.
        }

        println("$i")
        i++
    }

    while (i < 80) {

        if (i < 50) {
            i++
            continue
            // Tudo abaixo do continue é um unreachable code e quando ele é lido volta para a repetição.
        }

        println("$i")
        i++
        // E quando chega em 50, o código faz o print até 79.
    }

}