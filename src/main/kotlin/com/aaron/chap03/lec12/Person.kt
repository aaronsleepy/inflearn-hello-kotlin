package com.aaron.chap03.lec12

class Person private constructor(
    var name: String,
    var age: Int,
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

//        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스 동행 객체에여")
        }
    }
}

object Singleton {
    var a: Int = 0
}