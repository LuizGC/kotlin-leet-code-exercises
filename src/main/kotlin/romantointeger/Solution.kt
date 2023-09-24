package romantointeger

private const val I = 'I'
private const val V = 'V'
private const val X = 'X'
private const val L = 'L'
private const val C = 'C'
private const val D = 'D'
private const val M = 'M'

class Solution {

    private val ROMAN_MAP = mapOf(
        I to 1,
        V to 5,
        X to 10,
        L to 50,
        C to 100,
        D to 500,
        M to 1000
    )

    private val NEGATIVE_OPERATION = mapOf(
        I to setOf(V, X),
        X to setOf(L, C),
        C to setOf(D, M)
    )

    fun romanToInt(s: String): Int {
        var output = 0
        for (i in 1..<s.length) {
            val c = s[i-1]
            if (NEGATIVE_OPERATION[c]?.contains(s[i]) == true) {
                output -= ROMAN_MAP[c]?:0
            } else {
                output += ROMAN_MAP[c]?:0
            }
        }
        return output + (ROMAN_MAP[s.last()]?:0)
    }
}