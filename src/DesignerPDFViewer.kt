import java.util.*

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val mapTmp = mutableMapOf<Char, Int>()
    var c = 'a'
    var i = 0
    while (c <= 'z') {
        mapTmp[c] = h[i]
        ++c
        ++i
    }
    var maxHeight = 1
    for (element in word){
        if ((mapTmp[element] ?: 0 ) > maxHeight)
            maxHeight = mapTmp[element] ?: 0
    }
    return maxHeight * word.length
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}