package palindrome.number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var inverse = x % 10
        var state = x / 10
        while (state > 0) {
            inverse = (state % 10) + (inverse * 10)
            state /= 10
        }
        return inverse == x
    }
}