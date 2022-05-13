package com.example.hackerrank.solutions

class DivisibleSumPairs {

    /**
     * Example
        ar[1,2,3,4,5,6]
        n = 6, k= 5
    Three pairs meet the criteria: [1,4], [2,3] and [4,6].
     */

    fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
        // Write your code here
        var count = 0
        val list = mutableListOf<List<Int>>()
        ar.forEachIndexed { index, i ->
            for (j in 0 until n) {
                val firstVal = ar[index]
                val secondVal = ar[j]
                if (!list.contains(mutableListOf(j, index))) {
                    if (index != j && ( (firstVal + secondVal) % k == 0) ) {
                        list.add(mutableListOf(index, j))
                        count ++
                    }
                }
            }
        }
        return count
    }

}