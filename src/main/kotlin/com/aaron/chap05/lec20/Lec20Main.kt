package com.aaron.chap05.lec20

import com.aaron.chap03.lec14.PersonDto

data class Person(
    val name: String,
    val age: Int
)

fun printPerson2(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun main() {
    val person = Person("Aaron", 43)

    val value1 = person.let { it.age }

    val value2 = person.run { this.age }

    val value3 = person.also { it.age }

    val value4 = person.apply { this.age }

    with(person) {
        println(name)
        println(this.age)
    }

    // let
    // - call chain
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)

    strings.map { it.length }
        .filter { it > 3 }
        .let({ lengths -> println(lengths) })

    strings.map { it.length }
        .filter { it > 3 }
        .let { println(it)}

    // let
    // - non-null code block
    val str: String? = "5"

    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // let
    // - 1회성 지역 변수
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "${firstItem!}"
        }.uppercase()

    // run
    // - 객체 초기화와 반환값의 계산을 동시에 할 때
    // val person = Person("Aaron", 43).run(personRepository::save)
    // val person = Person("Aaron", 43).run {
    //     personRepository.save(this)
    // }

    // apply, also
    // - 객체 설정을 할 때 객체를 수정하는 로직이 call chain 중간에 사용될 때

    val mutableNumbers = numbers.toMutableList()
    println("numbers: ${numbers}")
    mutableNumbers.add("four")

    val mutableNumbers2 = numbers.toMutableList()
        .also { "numbers: ${it}" }
        .add("four")

    // with
    return with(person) {
        PersonDto(
            name = name,
            age = age,
         )
    }
}