package controleDeFluxo

import java.util.*

/*
1 - Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).
2 - Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).
3 - Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

4 - Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
*/

fun main() {
    evento()
}

fun quadrado() {
    println("Informe o valor do lado 1: ")
    val lado1 = readLine()

    println("Informe o valor do lado 2: ")
    val lado2 = readLine()

    if(lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (lado1 == lado2) {
            println("Isso é um quadrado")
        }
    } else {
        println("Isso não é um quadrado")
    }
}

fun triangulo() {
    println("Informe o valor do lado 1: ")
    val lado1 = readLine()

    println("Informe o valor do lado 2: ")
    val lado2 = readLine()

    println("Informe o valor do lado 3: ")
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

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun evento() {
    print("Insira a sua idade: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() >= 18)
        println("Acesso permitido")
    } else {
        println("Negado. Menores de idade não são permitidos")
        return
    }

    print("Insira o tipo do seu convite: ")
    var convite = readLine()

    if (convite != null && convite != "") {
        convite = convite.lowercase()

        if (convite == "comum" || convite == "premium" || convite == "luxo")
            println("Convite válido")
    } else {
        println("Negado. Convite inválido")
        return
    }

    print("Insira o código do seu convite: ")
    var codigoConvite = readLine()

    if (codigoConvite != null && codigoConvite != "") {
        codigoConvite = codigoConvite.uppercase()

        if (codigoConvite == "XL" || codigoConvite == "XT")
            println("Código válido")
    } else {
        println("Negado. Convite inválido.")
        return
    }

    if (idade.toInt() >= 18 && convite == "comum" || convite == "premium" || convite == "luxo" &&
        codigoConvite == "XL" || codigoConvite == "XT"
    ) {
        println("Welcome :)")
        return
    }
}