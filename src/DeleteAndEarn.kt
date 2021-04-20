fun main() {
//    val a = arrayOf(3, 4, 2).toIntArray()
    val a1 = arrayOf(1, 1, 1, 2, 4, 5, 5, 5, 6).toIntArray()
//    val b = deleteAndEarn(a)
    val b1 = deleteAndEarn(a1)
//    println(b)
    println(b1)
}

fun deleteAndEarn(nums: IntArray): Int {
    val max = nums.max()!!.plus(1)
    val arr = IntArray(max) { 0 }
    for (num in nums) {
        arr[num]++
    }
    val tmpArr = IntArray(max + 1)
    tmpArr[0] = arr[0]
    tmpArr[1] = arr[0].coerceAtLeast(arr[1])
    for (i in 2 until arr.size) {
        tmpArr[i] = (arr[i] * i + tmpArr[i - 2]).coerceAtLeast(tmpArr[i - 1])
    }
    return tmpArr[max - 1]
}