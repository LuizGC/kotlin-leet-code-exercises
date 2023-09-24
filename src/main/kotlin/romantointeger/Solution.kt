package romantointeger

class Solution {

    fun romanToInt(s: String): Int {
        var output = 0
        var previous = 0
        for (c in s) {
            val value = when(c) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
            if (previous < value) {
                output -= previous
            } else {
                output += previous
            }
            previous = value
        }
        return output + previous
    }
}