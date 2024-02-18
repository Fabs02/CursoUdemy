package controleDeFluxo

fun main() {
    portaria2()
}

fun triangulo2() {
    print("Informe o primeiro lado: ")
    val lado1 = readLine()

    print("Informe o segundo lado: ")
    val lado2 = readLine()

    print("Informe o terceiro lado: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("Isso é um triângulo equilátero")
        } else {
            println("Isso não é um triangulo equilátero")
        }
    }
}

fun qualASaida2(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun portaria2() {
    print("Qual a sua idade?: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() >= 18) {
            println("Maior de idade, acesso permitido")
        } else {
            println("Menor de idade, acesso negado")
            return
        }
    }

    print("Qual o tipo de convite?: ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
            println("Convite válido")
        } else {
            println("Convite inválido")
            return
        }
    }

    print("Qual o código do convite?: ")
    var codConvite = readLine()

    if (codConvite != null && codConvite != "") {
        codConvite = codConvite.lowercase()

        if (codConvite == "comum" && codConvite.startsWith("xt")) {
            println("Welcome :)")
        } else if (tipoConvite == "premium" || tipoConvite == "luxo"
            && codConvite.startsWith("xl")
        ) {
            println("Welcome :)")
        } else {
            println("Negado, convite inválido")
        }
    } else {
        println("Negado, convite inválido")
        return
    }
}