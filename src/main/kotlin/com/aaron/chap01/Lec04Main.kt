package com.aaron.chap01

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    println(money1 > money2)

    val money3 = money1
    val money4 = JavaMoney(2_000L)

    println(money1 == money3)
    println(money1 == money4)

    println(money1 === money3)
    println(money1 === money4)

    val money5 = money1.plus(money2)
    println(money5)

    val money6 = Money(2_000L)
    val money7 = Money(1_000L)
    println(money6 + money7)
}