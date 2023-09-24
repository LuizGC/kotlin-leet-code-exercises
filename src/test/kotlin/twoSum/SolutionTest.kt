package twoSum

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest {

    private val solution = Solution()
    @Test
    fun firstScenario() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val expectedOutput = intArrayOf(0, 1)
        assertContentEquals(expectedOutput, solution.twoSum(nums, target))
    }

    @Test
    fun secondScenario() {
        val nums = intArrayOf(3,2,4)
        val target = 6
        val expectedOutput = intArrayOf(1, 2)
        assertContentEquals(expectedOutput, solution.twoSum(nums, target))
    }

    @Test
    fun thirdScenario() {
        val nums = intArrayOf(3,3)
        val target = 6
        val expectedOutput = intArrayOf(0, 1)
        assertContentEquals(expectedOutput, solution.twoSum(nums, target))
    }

    @Test
    fun forthScenario() {
        val nums = intArrayOf(3,2,3)
        val target = 6
        val expectedOutput = intArrayOf(0, 2)
        assertContentEquals(expectedOutput, solution.twoSum(nums, target))
    }

}
