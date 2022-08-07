package com.aaron.chap02

import java.lang.IllegalArgumentException

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score} can't be less than 0")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score>= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}

fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score} should be 0 to 100")
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("Good")
        else -> println("Bad")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("Is 0")
        number %2 == 0 -> println("Is even number")
        else -> println("Is odd number")
    }
}