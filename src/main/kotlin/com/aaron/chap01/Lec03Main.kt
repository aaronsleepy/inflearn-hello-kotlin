package com.aaron.chap01

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()
    println(result)

    val number5: Int? = 3
    val number6: Long = number5?.toLong() ?: 0L

    printAgeIfPerson2(null)

    val person = Person("Aaron")
    println("나이: ${person.age}")

    val multiLine = """
        1줄
        2줄
        3줄
    """.trimIndent()
    println(multiLine)

    val str = "ABCDE"
    print(str[3])
}

fun printAgeIPerson(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person
//        println(person.age)
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}