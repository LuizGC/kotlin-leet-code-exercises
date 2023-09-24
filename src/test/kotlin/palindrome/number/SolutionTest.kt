package palindrome.number

import kotlin.test.Test
import kotlin.test.assertFalse

class SolutionTest {

    private val solution = Solution()

    @Test
    fun scenarios() {
        assertFalse(solution.isPalindrome(-121))
        assertFalse(solution.isPalindrome(10))
        assertFalse(solution.isPalindrome( 1234))
        assertFalse(solution.isPalindrome(120))
        assert(solution.isPalindrome(121))
        assert(solution.isPalindrome(1111))
        assert(solution.isPalindrome(91119))
        assert(solution.isPalindrome(11))
        assert(solution.isPalindrome(1))
    }
}