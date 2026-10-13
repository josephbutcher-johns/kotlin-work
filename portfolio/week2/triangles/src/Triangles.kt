// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    if (a < (b + c) && b < (c + a) && c < (a + b)) {
        return true
    }
    else{
        return false
    }
}

fun triangleArea( triangle: Triangle): Double {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    val sP = 0.5 * (a + b + c)
    val area = sqrt(sP * (sP -a) * (sP -b) * (sP -c))
    val rArea = "%.5f".format(area)
    return rArea.toDouble()
}