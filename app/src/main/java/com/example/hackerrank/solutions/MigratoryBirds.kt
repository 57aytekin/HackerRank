package com.example.hackerrank.solutions

class MigratoryBirds {

    /**
     * arr[1, 4, 4, 4, 5, 3]
     * Explanation
        The different types of birds occur in the following frequencies:
        Type 1: 1 bird
        Type 2: 0 birds
        Type 3: 1 bird
        Type 4: 3 birds
        Type 5: 1 bird
        The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.
     */

    fun migratoryBirds(arr: Array<Int>): Int {
        // Write your code here
        var max = 0
        var maxValue = 0
        val frequencies = arr.groupingBy { it }.eachCount().toSortedMap()
        frequencies.forEach {
            if (it.value > max) {
                max = it.value
                maxValue = it.key
            }
        }
        return maxValue
    }

    fun simpleWay(arr: Array<Int>): Int  {
        val frequencies = arr.groupingBy { it }.eachCount().toSortedMap()
        val maxValue = frequencies.maxByOrNull {
            it.value
        }
        return maxValue!!.key
    }
}