package mergeSortedArray

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun example1() {
        val solution = Solution()
        val result = intArrayOf(1,2,3,0,0,0)
        solution.merge(result, 3, intArrayOf(2,5,6), 3)
        assertArrayEquals(intArrayOf(1,2,2,3,5,6), result)
    }

    @Test
    fun example2() {
        val solution = Solution()
        val result = intArrayOf(1)
        solution.merge(result, 1, intArrayOf(), 0)
        assertArrayEquals(intArrayOf(1), result)
    }

    @Test
    fun example3() {
        val solution = Solution()
        val result = intArrayOf(0)
        solution.merge(result, 0, intArrayOf(1), 1)
        assertArrayEquals(intArrayOf(1), result)
    }

    @Test
    fun example4() {
        val solution = Solution()
        val result = intArrayOf(4,5,6,0,0,0)
        solution.merge(result, 3, intArrayOf(1,2,3), 3)
        assertArrayEquals(intArrayOf(1,2,3,4,5,6), result)
    }

    @Test
    fun example5() {
        val solution = Solution()
        val result = intArrayOf(4,0,0,0,0,0)
        solution.merge(result, 1, intArrayOf(1,2,3,5,6), 5)
        assertArrayEquals(intArrayOf(1,2,3,4,5,6), result)
    }
}
