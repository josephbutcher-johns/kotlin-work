// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()
    val sP = 0.5 * (a + b + c)
    val area = sqrt(sP * (sP -a) * (sP -b) * (sP -c))
    val rArea = "%.5f".format(area)
    println("Area =: $rArea")
}