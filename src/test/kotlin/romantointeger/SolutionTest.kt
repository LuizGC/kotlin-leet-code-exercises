package romantointeger

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    @Test
    fun romanToInt() {
        assertEquals(1, solution.romanToInt("I"))
        assertEquals(3, solution.romanToInt("III"))
        assertEquals(58, solution.romanToInt("LVIII"))
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
        assertEquals(49, solution.romanToInt("XLIX"))
    }
}