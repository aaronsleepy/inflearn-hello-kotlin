package com.aaron.chap04.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())

    println(3.add(4))

    println(3.add2(4))
    println(3 add2 4)
}

// 확장 함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 중위 함수
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

// inline 함수
inline fun Int.add3(other: Int): Int {
    return this + other
}

// 지역 함수