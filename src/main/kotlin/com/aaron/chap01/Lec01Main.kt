package com.aaron.chap01

fun main() {
    var number1 = 10L
    val number2 = 10L

    // Nullable
    var number3: Long? = 1_000L
    number3 = null

    var person = Person("aaron")
}

class Person(name: String) {
    var age = 23
}
