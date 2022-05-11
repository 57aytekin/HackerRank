package com.example.hackerrank.solutions


class BreakingTheRecords {

    /***                             Count
    Game  Score  Minimum  Maximum   Min Max
    0      12     12       12       0   0
    1      24     12       24       0   1
    2      10     10       24       1   1
    3      24     10       24       1   1

     */
    fun breakingRecords(scores: Array<Int>): Array<Int> {
        var minScore = scores.first()
        var maxScore = scores.first()
        var minCount = 0
        var maxCount = 0
        val distinctArray : Array<Int> = scores.distinctBy { it }.toTypedArray()
        distinctArray.forEachIndexed { _, i ->
            if (i < minScore) {
                minCount ++
                minScore = i
            } else if (i > maxScore) {
                maxCount ++
                maxScore = i
            }
        }
        return mutableListOf(maxCount, minCount).toTypedArray()
    }
}