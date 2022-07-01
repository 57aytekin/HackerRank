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
        //testDrawingBook()
        //testCountingValleys()
        //testElectronicShop()
        //testCatsAndMouse()
        //testPickingNumbers()
        println(hurdleRace(1, listOf(1,2,3,3,2)))

    }

    private fun testPickingNumbers() {
        val pickingNumbers = PickingNumbers()
        val list = mutableListOf(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9,
            9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9,
            98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4)
        println(pickingNumbers.pickingNumbersAlternative(list.toTypedArray()))
    }

    private fun testCatsAndMouse() {
        val catsAndAMouse = CatsAndAMouse()
        println(catsAndAMouse.catAndMouse(2,5,4))
    }

    private fun testElectronicShop() {
        val electronicsShop = ElectronicsShop()
        val keyboards = mutableListOf(40, 50, 60)
        val drives = mutableListOf(5, 8, 12)
        println(electronicsShop.getMoneySpent(keyboards.toTypedArray(), drives.toTypedArray(), 60))
    }

    private fun testCountingValleys() {
        val countingValleys = CountingValleys()
        //println(countingValleys.countingValleys(8,"UDDDUDUU"))
        println(countingValleys.countingValleys(8,"DDUUUUDD"))
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