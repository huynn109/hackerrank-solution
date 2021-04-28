import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var scanNext = scan.nextInt()
    scan.nextLine()
    var strTmp = ""
    val resStr = StringBuilder("")
    var k: Int
    val st = Stack<String>()
    while (scanNext-- > 0) {
        val arrLine: List<String> = scan.nextLine().split(" ")
        when (arrLine[0]) {
            "1" -> {
                st.push(strTmp)
                strTmp += arrLine[1]
            }
            "2" -> {
                st.push(strTmp)
                k = arrLine[1].toInt()
                strTmp= if (k < strTmp.length) {
                    val str = StringBuilder(strTmp)
                    str.replace(str.length - k, str.length, "").toString()
                } else ""
            }
            "3" -> {
                k = arrLine[1].toInt()
                if (k <= strTmp.length) resStr.append(strTmp[k - 1] + "\n")
            }
            "4" -> if (!st.isEmpty()) strTmp = st.pop()
        }
    }
    print(resStr)
}