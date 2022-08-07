package com.aaron.chap02

fun main() {
    // False call
    printNameAndGender("FEMALE", "Aaron")

    printNameAndGender(gender = "FEMALE", name = "Aaron")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max3(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

fun max4(a: Int, b: Int) = if (a > b) { a } else { b }

fun max5(a: Int, b: Int) = if (a > b) a else b

// Default parameter
fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// varargs
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}