package controleDeFluxo

fun main() {

    //Exemplo simples de condicional if
    val num = 10

    if (num > 10) {
        println("$num é maior que 10")
    }

    maiorDeIdade(19)
    maiorDeIdade(17)

    saudacoes(dia = true)

}

fun maiorDeIdade(idade: Int) {

   if (idade >= 18) {
       println("Maior de idade")

   } else if (idade > 60){
       println("Terceira idade")
   } else {
       println("Menor de idade")
   }
}

fun saudacoes(dia: Boolean) = if (dia) {
    "Bom dia"
} else {
    "Boa noite"
}