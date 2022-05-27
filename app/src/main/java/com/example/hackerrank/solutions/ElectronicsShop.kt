package com.example.hackerrank.solutions

class ElectronicsShop {
    /**
     * Example
     * b = 60
     * keyboards = [40, 50, 60]
     * drives = [5, 8, 12]
     * The person can buy a 40 keyboard + 12 USB drive = 52, or a
     * 50 keyboard + 8 USB drive = 58.
     * Choose the latter as the more expensive option and return 58.
     */
    fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
        var spentMoney = -1
        keyboards.forEachIndexed { _, keyboardPrice ->
            if (keyboardPrice < b) {
                drives.forEachIndexed { _, drivePrice ->
                    if (drivePrice < b) {
                        val total = keyboardPrice + drivePrice
                        if (total in (spentMoney + 1)..b) {
                            spentMoney = total
                        }
                    }
                }
            }
        }
        return spentMoney
    }
}