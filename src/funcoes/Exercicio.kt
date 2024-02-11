package funcoes

fun main() {
    println (converterAno(2))

    println (str("Hello World!"))

    println (cuboInt(4))

    println (convMilhasKM(2.0f, 1.6f))

    println(trocaLetras("Ola pessoas!"))
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

fun str(hw: String) = println(hw.length)

fun cuboInt(num: Int): Int = num * num * num

fun convMilhasKM(milhas: Float, km: Float): Float = milhas * km

fun trocaLetras(str: String) {
    println(str.lowercase().replace("a", "x", true))
}

/* Ex 1 -> fun convertAnos(anos:Int) {

    println("$anos anos equivalem a:")
    prinln("${anos * 12} meses")
    prinln("${anos * 365} dias")
    prinln("${anos * 365 * 24} horas")
    prinln("${anos * 365 * 24 * 60} minutos")
    prinln("${anos * 365 * 24 * 60 * 60} segundos")
}


* */
/*fun teste() {
    val ola = "Olá pessoas!"
    val replaceX = ola.replace("Olá pessoas!", "Olx pessoxs!")

    println(replaceX.lowercase())
}*/