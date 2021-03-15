fun getNumberOfOptions(
    priceOfJeans: Array<Int>,
    priceOfShoes: Array<Int>,
    priceOfSkirts: Array<Int>,
    priceOfTops: Array<Int>,
    budgeted: Int
): Long {
    val sumJS = mutableListOf<Int>()
    val sumKT = mutableListOf<Int>()
    for (i in priceOfJeans.indices){
        for (j in priceOfShoes.indices){
            sumJS.add(priceOfJeans[i] + priceOfShoes[j])
        }
    }
    for (i in priceOfSkirts.indices){
        for (j in priceOfTops.indices){
            sumKT.add(priceOfSkirts[i] + priceOfTops[j])
        }
    }
    sumJS.sort()
    sumKT.sortDescending()
    var result = 0L
    var limit = 0L
    for (i in sumJS.indices){
        val remain = budgeted - sumJS[i]
        while (limit < sumKT.size && sumKT[limit.toInt()] > remain) limit++
        if (limit.toInt() == sumKT.size) break
        result += sumKT.size - limit
    }
    return result
}

fun main(args: Array<String>) {
    val priceOfJeansCount = readLine()!!.trim().toInt()

    val priceOfJeans = Array<Int>(priceOfJeansCount, { 0 })
    for (i in 0 until priceOfJeansCount) {
        val priceOfJeansItem = readLine()!!.trim().toInt()
        priceOfJeans[i] = priceOfJeansItem
    }

    val priceOfShoesCount = readLine()!!.trim().toInt()

    val priceOfShoes = Array<Int>(priceOfShoesCount, { 0 })
    for (i in 0 until priceOfShoesCount) {
        val priceOfShoesItem = readLine()!!.trim().toInt()
        priceOfShoes[i] = priceOfShoesItem
    }

    val priceOfSkirtsCount = readLine()!!.trim().toInt()

    val priceOfSkirts = Array<Int>(priceOfSkirtsCount, { 0 })
    for (i in 0 until priceOfSkirtsCount) {
        val priceOfSkirtsItem = readLine()!!.trim().toInt()
        priceOfSkirts[i] = priceOfSkirtsItem
    }

    val priceOfTopsCount = readLine()!!.trim().toInt()

    val priceOfTops = Array<Int>(priceOfTopsCount, { 0 })
    for (i in 0 until priceOfTopsCount) {
        val priceOfTopsItem = readLine()!!.trim().toInt()
        priceOfTops[i] = priceOfTopsItem
    }

    val budgeted = readLine()!!.trim().toInt()

    val result = getNumberOfOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops, budgeted)

    println(result)
}
