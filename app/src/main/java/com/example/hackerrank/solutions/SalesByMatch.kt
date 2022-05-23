package com.example.hackerrank.solutions

class SalesByMatch {
    /**
     * Example
     * n = 7
     * ar = [1,2,1,2,1,3,2]
     *There is one pair of color 1 and one of color 2.
     * There are three odd socks left, one of each color. The number of pairs is 2.
     */

    fun sockMerchant(n: Int, ar: Array<Int>): Int {
        // Write your code here
        var count = 0
        val newList = ar.groupingBy { it }.eachCount().filter { it.value > 1 }
        newList.forEach { item ->
            val itemCount = item.value / 2
            if (itemCount >= 0) {
                count += itemCount
            }
        }
        return count
    }
}