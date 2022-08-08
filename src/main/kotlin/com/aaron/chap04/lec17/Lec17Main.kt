package com.aaron.chap04.lec17

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

    // 람다를 만드는 방법 #1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 #2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 람다를 호출하는 방법 #1
    isApple(fruits[0])

    // 람다를 호출하는 방법 #2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)

    filterFruits(fruits, { fruit: Fruit -> fruit.name == "바나나" })

    filterFruits(fruits) { fruit: Fruit -> fruit.name == "바나나" }

    filterFruits(fruits) { fruit -> fruit.name == "바나나" }

    filterFruits(fruits) { a -> a.name == "바나나" }

    filterFruits(fruits) { it.name == "바나나" }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}