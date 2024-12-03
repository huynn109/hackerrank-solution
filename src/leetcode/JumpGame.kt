package leetcode

/**
 * https://leetcode.com/problems/jump-game/description/
 */

fun main() {
    println("result: ${jumpGame(intArrayOf(2, 3, 1, 1, 4))}")
    println("result: ${jumpGame(intArrayOf(3, 2, 1, 0, 4))}")
    println("result: ${jumpGame(intArrayOf(1, 1, 1, 0))}")
}

fun jumpGame(nums: IntArray): Boolean {
    var targetIndex = nums.size - 1
    for (i in targetIndex downTo 0) {
        if (nums[i] + i >= targetIndex) {
            targetIndex = i
        }
    }
    return targetIndex == 0
}