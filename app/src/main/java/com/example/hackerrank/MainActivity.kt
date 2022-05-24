package com.example.hackerrank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hackerrank.solutions.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //breakingRecords()
        //testSubarrayDivision()
        //testDivisibleSumPairs()
        //testMigratoryBirds()
        //testDayOfProgrammer()
        //testBillDivision()
        //testAppleAndOrange()
        //testSalesByMatch()
        testDrawingBook()
    }

    private fun testDrawingBook() {
        val drawingBook = DrawingBook()
        println(drawingBook.pageCount(5,3))
    }

    private fun testSalesByMatch() {
        val salesByMatch = SalesByMatch()
        val list = mutableListOf(1,2,1,2,1,3,2)
        println(salesByMatch.sockMerchant(7, list.toTypedArray()))
    }

    private fun testAppleAndOrange() {
        val appleAndOrange = AppleAndOrange()
        val apples = listOf(2,3,-4)
        val oranges = listOf(3,-2,-4)
        appleAndOrange.countApplesAndOranges(7,10, 4,12, apples.toTypedArray(), oranges.toTypedArray())
    }

    private fun testBillDivision() {
        val list = mutableListOf(3, 10, 2, 9)
        val billDivision = BillDivision()
        billDivision.bonAppetit(list.toTypedArray(), 1, 12)
    }

    private fun testDayOfProgrammer() {
        val year = 1758
        val dayOfTheProgrammer = DayOfTheProgrammer()
        Log.d("RESULT", dayOfTheProgrammer.dayOfProgrammer(year))
    }
    private fun testMigratoryBirds() {
        val list = mutableListOf(3, 1, 1, 2, 4, 1 )
        val migratoryBirds = MigratoryBirds()
        Log.d("RESULT",migratoryBirds.migratoryBirds(list.toTypedArray()).toString())
    }

    fun breakingRecords() {
        val breakingTheRecords = BreakingTheRecords()
        val list = mutableListOf(10, 5, 20, 20, 4, 5, 2, 25, 1)
        breakingTheRecords.breakingRecords(list.toTypedArray()).forEachIndexed { index, i ->
            Log.d("RESULT",i.toString())
        }
    }
    fun testSubarrayDivision() {
        val subarrayDivision = SubarrayDivision()
        val list = mutableListOf(4)
        Log.d("RESULT",subarrayDivision.birthday(list.toTypedArray(),4, 1).toString())
    }
    fun testDivisibleSumPairs() {
        val test = DivisibleSumPairs()
        val list = mutableListOf(1, 3,2, 6, 1, 2)
        Log.d("RESULT", test.divisibleSumPairs(6, 3,list.toTypedArray()).toString())
    }
}