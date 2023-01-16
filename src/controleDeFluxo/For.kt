package controleDeFluxo

fun main() {

    for (i in 1..10) {
        println("$i ")
    }

    for (i in 0..20 step 2) {
        println("$i ")
    }

    for (i in 30 downTo 0) {
        println("$i ")
    }

    for (i in 30 downTo 0 step 3) {
        println("$i ")
    }

    val str = "Kotlin is great!!"
    for (char in str) {
        println("$char ")
    }
}

