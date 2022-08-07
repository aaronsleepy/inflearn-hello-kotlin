package com.aaron.chap04.lec15

fun main() {
    // array
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    val array2 = array.plus(300)
    for ((idx, value) in array2.withIndex()) {
        println("${idx} ${value}")
    }

    // Collection - List : ArrayList
    val numbers = listOf(100, 200, 300)
    val emptyList = emptyList<Int>()

    println(numbers[2])
    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }

    val mutableNumbers = mutableListOf(100, 200, 300)
    mutableNumbers.add(400)

    // Collection - Set : LinkedHashSet

    // Collection - Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    val map = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in map.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in map.entries) {
        println(key)
        println(value)
    }

    // Nullable

}
