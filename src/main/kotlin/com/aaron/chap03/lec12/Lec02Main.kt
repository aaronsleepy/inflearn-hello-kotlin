package com.aaron.chap03.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("move move")
        }

        override fun fly() {
            println("fly fly")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move();
    movable.fly()
}