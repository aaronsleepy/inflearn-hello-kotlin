package com.aaron.chap03

import com.aaron.chap02.printAll

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class init...")
        println(number)
    }
}

class Derived(
    override val  number: Int
) : Base(number) {
    init {
        println("Derived Class init...")
        println(number)
    }
}