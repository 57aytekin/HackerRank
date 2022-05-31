package com.example.hackerrank.solutions

class PickingNumbers {

    fun pickingNumbers(a: Array<Int>): Int {
        // Write your code here
        //val list = mutableListOf(1, 2, 2, 3, 1, 2)
        var mostRepeatedCount = 0
        var mostRepeatedValue = 0
        val newList = a.groupingBy { it }.eachCount().filter { it.value > 1 }.toSortedMap()

        newList.forEach {
            if (it.value > mostRepeatedCount){
                mostRepeatedCount = it.value
                mostRepeatedValue = it.key
            }
        }

        var count = 0
        if (mostRepeatedCount != 0 && mostRepeatedValue != 0) {
            val lastValueCount = a.groupingBy { it }.eachCount().filter { it.key == mostRepeatedValue-1 }[mostRepeatedValue-1] ?: 0
            val nextValueCount = a.groupingBy { it }.eachCount().filter { it.key == mostRepeatedValue+1 }[mostRepeatedValue+1] ?: 0
            count = if (lastValueCount > nextValueCount) {
                mostRepeatedCount + lastValueCount
            } else {
                mostRepeatedCount + nextValueCount
            }
        }

        if (count == 0) count = 2
        return count
    }

    fun pickingNumbersAlternative(a: Array<Int>): Int {
        val frequency = IntArray(101){0}

        var result = Int.MIN_VALUE

        for (i in a.indices) {
            val index = a[i]
            frequency[index]++
        }

        for (i in 1..100) {
            result = result.coerceAtLeast(frequency[i] + frequency[i - 1])
        }

        return result
    }
}