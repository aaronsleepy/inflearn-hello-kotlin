package com.aaron.chap03

fun main() {
    val person = Person("Aaron", 123)
    println(person.name)

    person.age = 32
    println(person.age)

    val person2 = Person()
}