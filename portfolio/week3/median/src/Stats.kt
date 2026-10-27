// Task 7.7.1: statistics functions
import java.io.File
fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()){"numbers must not be empty"}
    val sortNumbers = numbers.sorted()
    val middle = sortNumbers.size / 2
    // odd list
    if (sortNumbers.size % 2 == 1) {
        return sortNumbers[middle]
    }
    // even list
    else {
        return (sortNumbers[middle - 1] + sortNumbers[middle]) / 2
    }
}

fun statistics(numbers: List<Float>) {
    println("Minimum" + numbers.minOrNull())
    println("Maximum" + numbers.maxOrNull())
    println("Mean" + numbers.average())
    println("Median" + median(numbers))
}

fun main(args : Array<String>) {
    val numbers = File(args[0]).readLines().map{ it.trim().toFloat() }
    statistics(numbers)
}
