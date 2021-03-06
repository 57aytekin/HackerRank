package com.example.hackerrank.solutions

class AppleAndOrange {
    /**
     * For example, Sam's house is between s = 7 and t = 10.
     * The apple tree is located at a = 4 and the orange at b = 12.
     * There are m = 3 apples and n = 3 oranges.
     * Apples are thrown apples[2,3,-4] units distance from a, and oranges[3,-2,-4] units distance.
     * Adding each apple distance to the position of the tree, they land at [4+2, 4+3, 4+ -4] = [6,7,0].
     * Oranges land at [12+3, 12+ -2, 12 + -4] = [15,10,8].
     * One apple and two oranges land in the inclusive range 7 - 10 so we print;
     * 1
     * 2
     */

    fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
        // Write your code here
        var appleCount = 0
        var orangeCount = 0
        apples.map { it + a }.forEachIndexed { _, apple ->
            if (apple in s..t) {
                appleCount ++
            }
        }
        oranges.map { it + b }.forEachIndexed { _, orange ->
            if (orange in s..t) {
                orangeCount ++
            }
        }
        println(appleCount)
        println(orangeCount)

    }
}