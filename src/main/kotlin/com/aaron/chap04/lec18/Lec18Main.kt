package com.aaron.chap04.lec18

import com.aaron.chap04.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("사과", 10_000),
    )

    val apples = fruits.filter { it.name == "사과" }

    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    val applePrice = fruits.filter { it.name == "사과" }
        .map { it.price }

    fruits.all { it.name == "사과" }

    fruits.none { it.name == "사과" }

    fruits.any { it.name == "사과" }

    fruits.count()

    fruits.sortedBy { it.price }

    fruits.sortedByDescending { it.price }

    fruits.distinctBy { it.name }
        .map { it.name }

    fruits.first()

    fruits.firstOrNull()

    fruits.last()

    fruits.lastOrNull()

    val groupBy: Map<String, List<Fruit>> = fruits.groupBy { it.name }

    // fruits.associateBy

    val groupBy1: Map<String, List<Int>> = fruits.groupBy({ it.name }, { it.price })

    fruits.groupBy { it.name }
        .filter { (key, value) -> key == "사과" }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)

//    val results = mutableListOf<Fruit>()
//    for (fruit in fruits) {
//        if (filter(fruit)) {
//            results.add(fruit)
//        }
//    }
//
//    return results
}