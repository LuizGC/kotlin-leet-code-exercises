package mergeSortedArray

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if (n == 0) {
            return
        }
        var index = 0
        for(i in 0 until m) {
            if (nums1[i] > nums2[index]) {
                val temp = nums2[index]
                nums2[index] = nums1[i]
                nums1[i] = temp
            }
            if (index < n - 1 && nums2[index] > nums2[index + 1]) {
                index++
            }
        }
        for(i in 0 until n) {
            nums1[i + m] = nums2[i]
        }
    }
}