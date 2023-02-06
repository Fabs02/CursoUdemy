package controleDeFluxo

fun main() {
    ex4("xxbooo")
}

fun ex1() {
    val caixa = 2000
    val balao = 7

    var quantBalao = 0
    while ((balao * quantBalao) + balao < caixa) {

        quantBalao++
    }
    println("Cabem $quantBalao balões na caixa d'água")
}

fun ex2() {
    var i = 1

    while (i <= 50) {
        if (i % 3 == 0 && i % 5 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun ex3(str: String) {
    var i = str.length - 1

    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun ex4(str: String): Boolean {
    val lowerStr = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < str.length) {
        if (str[i] == 'x') {
            countX++
        } else if (str[i] == 'o') {
            countO++
        }
        i++
    }

    return (countX == countO && countX != 0)
}