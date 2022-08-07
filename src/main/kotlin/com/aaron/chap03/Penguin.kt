package com.aaron.chap03

class Penguin(
    species: String
) : Animal(species, 2), Flyable, Swimable {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 move move~")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}