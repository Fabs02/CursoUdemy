package Exceptions

/* Exemplo simples Try Catch
fun main() {

    try {
        val s: String? = null
    } catch(e: NullPointerException) {
        print("Valor nulo!!")
    }

    println("FIM")

}
 */

fun main() {

    try {
        //return - Se escrever um return logo no início, o finally ainda é executado.
        val s: String? = null
        println(s!!.length)


        val n = 10 / 0
    } catch (e: NullPointerException) {
        println("Valor nulo!")
    } catch (e: ArithmeticException) {
        println("Não é possível dividir por 0") //Pode haver mais de um catch, como também pode haver um só.
    } catch (e: Exception) {
        println("Genérica") /* É a principal, está no topo da cadeia, ex: NullPointerException também é uma exception.
                               Se ela for a primeira catch, sempre será ela a impressa.*/
    } finally {
        println("Finally!") //O finally sempre é executado, independente do que ocorrer.
    }

    println("Fim")
}