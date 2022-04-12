package funcoes

fun main() {
    converterAno(2)

    str()

    cuboInt()

    convMilhasKM()

    trocaLetras("Ola pessoas!")
}

fun converterAno(ano: Int) {
    val meses = 12
    val dias = 365
    val horas = 24
    val minutos = 60
    val segundos = 60

    println("$ano anos equivalem a: ")

    val mesesC = ano * meses
    println("$mesesC meses")

    val diasC = ano * dias
    println("$diasC dias")

    val horasC = ano * dias * horas
    println("$horasC horas")

    val minutosC = ano * dias * horas * minutos
    println("$minutosC minutos")

    val segundosC = ano * dias * horas * minutos * segundos
    println("$segundosC segundos")
}

fun str(hw: String = "Hellow World!") = println(hw.length)

fun cuboInt(num: Int = 4) = println(num * num * num)

fun convMilhasKM(milhas: Double = 5.0, km: Double = 1.6) = println(milhas * km)

fun trocaLetras(str: String) {
    println(str.lowercase().replace("a", "x", true))
}


/*fun teste() {
    val ola = "Olá pessoas!"
    val replaceX = ola.replace("Olá pessoas!", "Olx pessoxs!")

    println(replaceX.lowercase())
}*/