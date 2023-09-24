package twoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..<nums.size - 1) {
            val initial = nums[i]
            for (j in i + 1..<nums.size) {
                val sum = initial + nums[j]
                if (sum == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}