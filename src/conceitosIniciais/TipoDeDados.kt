/**
Valores reais
Type   Bit
Double 64
Float  32

Valores ínteiros
Long   64
Int    32
Short  16
Byte   8
Boolean
String
Char
 */

fun main() {

    var char = 'a'
    var string = "Olá mundo!"
    var boolean = true
    var boolean2 = false

    var double: Double = 1000.0
    var float: Float = 45f

    var long: Long = 10L
    var int: Int = 70
    var short: Short = 45
    var byte: Byte = 3

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")

}