package com.aaron.chap03

import java.lang.IllegalArgumentException

class Person(
    val name: String = "Beckom",
    var age: Int = 43
) {
    init {
       if ( age <= 0) {
           throw IllegalArgumentException("Age can't be ${age}")
       }
        println("init")
    }

    constructor(name: String) : this(name, 1)

    constructor(): this("Aaron") {
        println(name)
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult2: Boolean
        get() = this.age >= 20

    val isAdult3: Boolean
        get() {
            return this.age >= 20
        }
}