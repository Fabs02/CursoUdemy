package controleDeFluxo

/*
1 - Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
*/

fun bonus(cargo: String): Float {
    var bonus = 0f

    if (cargo == "Gerente")
        bonus = 2000f
    else if (cargo == "Coordenadores") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus
}

/* Outra maneira de resolver:

* fun bonus(cargo: String): Float {
    val bonus = 0f

    return if (cargo == "Gerente")
        2000f
    else if (cargo == "Coordenadores") {
        1500f
    } else if (cargo == "Engenheiro de software") {
        1000f
    } else if (cargo == "Estagiário") {
        500f
    } else {
        bonus
    }
}
*/

fun main() {
    val bonus = bonus("Gerente")
    println(bonus)
}