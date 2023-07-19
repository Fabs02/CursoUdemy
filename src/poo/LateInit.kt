package poo

// Lateinit -> Faz com que a variável seja inicializada depois. Pode ser apenas var e não val.
// Dispensamos a necessidade de inicializar como valor vazio ou null, mas precisamos declara-lá depois obrigatóriamente.
class Receita {
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos"
    }

    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos"
        }
    }
}

fun main() {
    val r: Receita = Receita()
    r.imprimeReceita()
    println(r.instrucoes)
}