package controleDeFluxo

fun main() {
    val n = readLine()
    println(n)
}

fun bonus(cargo: String): Float {
    var bonus = 0f

    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiários") {
        bonus = 500f
    }

    return bonus
}

fun bonusWhen(cargo: String): Float {
    val bonus = 0f
    when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
    }

    return bonus
}

//Outra forma:

fun bonusWhen2(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}