package com.example.hackerrank.solutions

/**
 * A video player plays a game in which the character competes in a hurdle race.
 * Hurdles are of varying heights, and the characters have a maximum height they can jump.
 * There is a magic potion they can take that will increase their maximum jump height by 1 unit for each dose.
 * How many doses of the potion must the character take to be able to jump all of the hurdles.
 * If the character can already clear all of the hurdles, return 0.
 *
 *  Example
 *  height = [1,2,'3',3,2]
 *  K = 1
 *  3 - 1 = 2
 */
fun hurdleRace(k: Int, height: List<Int>): Int {
    // Write your code here
    val max = height.maxOrNull() ?: 0

    return if (k > max) 0
    else max - k

}

fun hurdleRaceAlternative(k: Int, height: List<Int>): Int {
    // Write your code here
    var max = 0
    height.forEach {
        if (it > max) max = it
    }

    return if (k > max) 0
    else max - k

}