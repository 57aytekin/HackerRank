package com.example.hackerrank.solutions

class SubarrayDivision {

    /**
     * Example
     s = [2,2,1,3,2]
     d = 4
     m = 2
    Lily wants to find segments summing to Ron's birth day, d=4
    with a length equalling his birth month, m = 2.
    In this case, there are two segments meeting her criteria: [2,2]  and [1,3].
     */

    fun birthday(s: Array<Int>, d: Int, m: Int): Int {
        var count = 0
        s.forEachIndexed { index, i ->
            var total = 0
            for (j in index until index+m) {
                if (s.size >= index + m) {
                    total += s[j]
                }
            }
            if (d == total) {
                count ++
            }
        }
        return count

    }
}
