package controleDeFluxo

fun main() {
    val bonus = ex1("Gerente")
    println(bonus)

    val bonus2 = ex2("Coordenador", 2)
    println(bonus2)

    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    //false && false && true && true = false

    println(!a && !b && (c && d))
    //true && true && true = true

    println(a && ((b || c) || d))
    //false && true = false

    println(a || ((!b && c) || !d))
    // false || true = true
}

fun ex1(cargo: String): Float {
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

fun ex2(cargo: String, tempoExp: Int): Float {
    var bonus = 0f

    if (cargo == "Gerente") {
        if (tempoExp < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (tempoExp < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiários") {
        bonus = 500f
    }

    return bonus
}