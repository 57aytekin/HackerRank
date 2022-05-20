package com.example.hackerrank.solutions

class BillDivision {

    /**
     * For example, assume the bill has the following prices: bill=[2,4,6].
     * Anna declines to eat item K = bill[2] which costs 6.
     * If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3.
     * If he includes the cost of bill[2], he will calculate (2+4+6)/2 = 6.
     * In the second case, he should refund 3 to Anna.
     */

    fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
        val annaPay = bill.toMutableList().apply {
            removeAt(k)
        }.sum() / 2
        val result = b - annaPay

        if (result == 0) print("Bon Appetit")
        else println(result)

    }
}