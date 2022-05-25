package com.example.hackerrank.solutions

class CountingValleys {
    fun countingValleys(steps: Int, path: String): Int {
        // Write your code here

        var upCount = 0
        var valleyCount = 0

        path.forEachIndexed { index, c ->
            if (c == 'U') {
                upCount++
            }
            else {
                if (upCount == 0) valleyCount ++
                upCount --
            }
        }
        return valleyCount

    }

}