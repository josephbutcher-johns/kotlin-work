// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val a = Triangle.first
    val b = Triangle.second
    val c = Triangle.third
    if (a < (b + c) && b < (c + a) && c < (a + b)) {
        return true
    }
    else{
        return false
    }
}

fun triangleArea( triangle: Triangle): String {
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val a = Triangle.first.toDouble()
    val b = Triangle.second.toDouble()
    val c = Triangle.third.toDouble()
    val sP = 0.5 * (a + b + c)
    val area = sqrt(sP * (sP -a) * (sP -b) * (sP -c))
    val rArea = "%.5f".format(area)
    return rArea
}