package com.example.hackerrank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hackerrank.solutions.BreakingTheRecords
import com.example.hackerrank.solutions.DivisibleSumPairs
import com.example.hackerrank.solutions.MigratoryBirds
import com.example.hackerrank.solutions.SubarrayDivision

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //breakingRecords()
        //testSubarrayDivision()
        //testDivisibleSumPairs()
        testMigratoryBirds()
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