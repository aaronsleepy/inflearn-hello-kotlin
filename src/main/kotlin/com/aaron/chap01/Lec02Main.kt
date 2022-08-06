package com.aaron.chap01

import java.lang.IllegalArgumentException

fun main() {
    println(startsWithA3(null))
    println(startsWithA3("Abc"))

    println(startsWithA4(null))
}

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null 들어왔습니다")
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null;
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}