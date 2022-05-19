package com.example.hackerrank.solutions

class DayOfTheProgrammer {
    /**From 1700 to 1917, Russia's official calendar was the Julian calendar;
     * since 1919 they used the Gregorian calendar system.
     * The transition from the Julian to Gregorian calendar system occurred in 1918,
     * when the next day after January 31st was February 14th.
     * This means that in 1918, February 14th was the 32nd day of the year in Russia.
     *
     * In both calendar systems, February is the only month with a variable amount of days;
     * it has 29 days during a leap year, and 28 days during all other years.
     * In the Julian calendar, leap years are divisible by 4;
     * in the Gregorian calendar, leap years are either of the following:
        Divisible by 400.
        Divisible by 4 and not divisible by 100.
     */

    fun dayOfProgrammer(year: Int): String {
        var day = 13
        if (year in 1919..2700) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                day = 12
            }
        }
        if (year in 1700..1917) {
            if (year % 4 == 0) {
                day = 12
            }
        }
        if (year == 1918) {
            day = 26
        }
        return "$day.09.$year"
    }
}