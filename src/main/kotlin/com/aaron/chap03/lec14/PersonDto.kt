package com.aaron.chap03.lec14

fun main() {
    val person1 = PersonDto("Aaron", 34)
    val person2 = PersonDto("Aaron", 34)

    println(person1 == person2)
    println(person1 === person2)
}

data class PersonDto(
    val name: String,
    val age: Int,
)