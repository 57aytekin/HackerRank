package com.example.hackerrank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hackerrank.solutions.BreakingTheRecords

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breakingTheRecords = BreakingTheRecords()
        val liste = mutableListOf(10, 5, 20, 20, 4, 5, 2, 25, 1)

        breakingTheRecords.breakingRecords(liste.toTypedArray()).forEachIndexed { index, i ->
            Log.d("RESULT",i.toString())
        }
    }
}