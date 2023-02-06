package controleDeFluxo

fun main() {

    val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    var mes = 0

    do {
        patAna += (salario * 0.05f) + (salario * 0.05f) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes++

        println("Pat Ana ${(patAna * 0.002f)} ----- Pat Paula ${(patPaula * 0.008f)}")

    } while(patAna > patPaula)
    
    println("Pat de Paula alcançará o de Ana no mês $mes")
}