package com.example.hackerrank.solutions

class DrawingBook {

    /**
     * Example
     * n = 5
     * p = 3
     * Using the diagram above, if the student wants to get to page 3,
     * they open the book to page 1, flip 1 page and they are on the correct page.
     * If they open the book to the last page, page 5, they turn 1 page
     * and are at the correct page. Return 1.
     */

    fun pageCount(n: Int, p: Int): Int {
        // Write your code here
        val lastPageNumber = if (n % 2 == 0) (n / 2) +1 else (n / 2) + (n % 2)
        val pageNumber = if (p % 2 == 0) (p / 2) +1 else (p / 2) + (p % 2)
        return if ( pageNumber <= (lastPageNumber - pageNumber) )
            pageNumber -1
        else
            lastPageNumber - pageNumber
    }
}