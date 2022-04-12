fun main() {

    println("A soma de 10 + 5 é igual a: ${soma (10, 5)}")

}

//Realiza algo expecífico, para que não precise repitir o mesmo código várias vezes.
fun soma (n1: Int, n2: Int): Int {

    return n1 + n2

}

/*Tipos de retorno:

Unit: Diz que uma função não possui retorno. A função executa o seu corpo e finaliza a sua execução.

Double, Float, Long, Int, Short, Byte, Boolean, String e Char:
Os mesmos tipos que são usados para declaração de variáveis, servem como retorno de funções.

Instâncias de classes:
Uma função capaz de retornar um tipo de dado resultante de uma instância de uma classe.

*/