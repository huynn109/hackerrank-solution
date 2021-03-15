package kotlinResearch

fun main(args: Array<String>) {
    val numbers = listOf(5, 2, 10, 4)
    val sum = numbers.reduce { sum, element ->
        sum + element
    }
    val sumDoubled = numbers.fold(0) { sumD, element ->
        sumD + element
    }
    println(sumDoubled)
    println(sum)
}