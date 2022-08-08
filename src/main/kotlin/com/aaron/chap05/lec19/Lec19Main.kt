package com.aaron.chap05.lec19

import com.aaron.chap03.lec12.Person
import com.aaron.chap04.lec17.Fruit
import com.aaron.chap04.lec18.FruitDto

fun main() {
    // 구조분해
    val fruit = FruitDto("사과", 1_000)
    val (name, price) = fruit
//    fruit.component1()
//    fruit.component2()

    val numbers = 1..3
    numbers.map { it + 1}
        .forEach { println(it) }



}

typealias FruitFilter = (Fruit) -> Boolean

private fun filterFruits(
    fruits: List<Fruit>, filter: FruitFilter
): List<Fruit> {
    return fruits.filter(filter)
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0}
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}