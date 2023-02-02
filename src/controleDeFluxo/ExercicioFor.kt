package controleDeFluxo

fun main() {
    escada(5)
}

//Ex 1:
fun crescente() {

    for (i in 1..50) {
        print("$i ")
    }
}

//Ex 2:
fun decrescente() {

    for (i in 50 downTo 1) {
        print("$i ")
    }

}

//Ex 3:
fun naomult5() {

    for (i in 1..50) {

        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

//Ex 4:
fun soma() {
    var soma = 0

    for (i in 1..500) {
        soma += 1
        print("$i ")
    }
}

//Ex 5:
fun escada(n: Int) {

    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}