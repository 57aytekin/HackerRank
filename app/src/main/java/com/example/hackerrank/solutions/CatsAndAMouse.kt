package com.example.hackerrank.solutions

import kotlin.math.abs

/**
 * Example
 *  x = 2
 *  y = 5
 *  z = 4
 * The cats are at positions 2 (Cat A) and 5 (Cat B), and the mouse is at position 4.
 * Cat B, at position 5 will arrive first since it is only 1 unit away while the other is 2 units away.
 * Return 'Cat B'.
 */
class CatsAndAMouse {

    fun catAndMouse(x: Int, y: Int, z: Int): String {
        val catA = abs(z-x)
        val catB = abs(z-y)
        return when {
            catB < catA -> "Cat B"
            catA < catB -> "Cat A"
            else -> "Mouse C"
        }
    }
}