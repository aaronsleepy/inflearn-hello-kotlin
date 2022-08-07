package com.aaron.chap03

class AnotherPerson(
    name: String,
    var age: Int
) {
    // 잘 안쓴다...
    var name: String = name
        get() = field.uppercase()
        set(value) {
            field = value
        }
}